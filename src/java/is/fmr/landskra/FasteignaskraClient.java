/**
 * 
 */
package is.fmr.landskra;

import fasteignaskra.landskra_wse.FasteignaskraLocator;
import fasteignaskra.landskra_wse.FasteignaskraSoap;
import fasteignaskra.landskra_wse.Fasteignaskra_Element;
import fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult;
import fasteignaskra.landskra_wse.GetFasteignByFastaNrResponseGetFasteignByFastaNrResult;
import fasteignaskra.landskra_wse.Heiti;
import fasteignaskra.landskra_wse.HeitiHeitiFastaNr;
import is.thjodskra.SveitarfelagsUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;
import org.apache.axis.deployment.wsdd.WSDDDocument;
import org.apache.axis.message.addressing.Action;
import org.apache.axis.message.addressing.AddressingHeaders;
import org.apache.axis.message.addressing.Constants;
import org.apache.axis.message.addressing.To;
import org.apache.axis.types.URI;
import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.xml.sax.SAXException;

/**
 * <p>
 * Convenience client for working with the FMR webservice calls.
 * </p>
 * 
 * @author tryggvil
 * 
 */
public class FasteignaskraClient implements CallbackHandler {

	private String cryptoPropertiesFilePath = "keys/client_crypto.properties";

	private String keystorePassword = "fart";

	// private String axisClientDeployConfigURI =
	// "file:///idega/eclipse/rafverk/is.fmr.landskra/src/java/fasteignaskra/landskra_wse/client_deploy.wsdd";
	private String axisClientDeployConfigURI = "resource://fasteignaskra/landskra_wse/client_deploy.wsdd";

	private String serviceUrl = "http://ws-test.fmr.is/SvcFasteignaskra_0201/Fasteignaskra.asmx";

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FasteignaskraClient test = new FasteignaskraClient();
		test.executeTest(args);
	}

	public Fasteignaskra_Element[] getFasteignirByHeitiAndPostnumer(
			String heitiStr, String postnumer) throws Exception {

		String sveitarfelagsnr = SveitarfelagsUtil
				.getSveitarfelagsnrFromPostnumer(postnumer);
		return getFasteignirByHeiti(heitiStr, sveitarfelagsnr);

	}

	public Fasteignaskra_Element[] getFasteignirByHeiti(String heitiStr,
			String sveitarfelagsNr) throws Exception {

		Heiti heiti = findFastaNrByHeiti(heitiStr, sveitarfelagsNr);
		HeitiHeitiFastaNr[] fastanumers = heiti.getHeiti().getFastaNr();

		Fasteignaskra_Element[] skras = null;

		if (fastanumers != null) {
			skras = new Fasteignaskra_Element[fastanumers.length];
			for (int i = 0; i < fastanumers.length; i++) {
				HeitiHeitiFastaNr hFastanr = fastanumers[i];
				String fastanr = hFastanr.getFastanr().toString();
				Fasteignaskra_Element fasteignaskra = getFasteignByFastaNr(fastanr);
				skras[i] = fasteignaskra;
			}
		}

		return skras;
	}

	public Fasteignaskra_Element getFasteignByFastaNr(String fastanumer)
			throws Exception {

		FasteignaskraSoap port = getService();
		GetFasteignByFastaNrResponseGetFasteignByFastaNrResult response = port
				.getFasteignByFastaNr(fastanumer);

		FasteignaskraParser parser = new FasteignaskraParser(response);
		Fasteignaskra_Element skra = parser.getFasteignaskra();
		return skra;
	}

	public Heiti findFastaNrByHeiti(String heitiStr, String sveitarfelagsNr)
			throws Exception {

		if (sveitarfelagsNr == null) {
			sveitarfelagsNr = "";
		}

		FasteignaskraSoap port = getService();
		FindFastaNrByHeitiResponseFindFastaNrByHeitiResult response = port
				.findFastaNrByHeiti(heitiStr, sveitarfelagsNr);

		HeitiParser parser = new HeitiParser(response);
		Heiti heiti = parser.getHeiti();
		return heiti;
	}

	public void executeTest(String[] args) throws Exception {

		System.setProperty("http.proxyHost", "localhost");
		System.setProperty("http.proxyPort", "8080");

		// String searchString = "Hringbraut";
		String searchString = "Engjavegur 6";
		// String searchString = "Hávallagata 13";
		// String sveitarfelagsNr = "0000";
		String sveitarfelagsNr = null;

		// String fastanumer = "2111170";
		// Havallagata 13: 101
		// String fastanumer = "2003728";

		/*
		 * MessageElement[] array = response.get_any(); for (int i = 0; i <
		 * array.length; i++) { MessageElement element = array[i];
		 * System.out.println("Element: "+i+": "+element.getAsString()); }
		 */

		// Fasteignaskra_Element skra = getFasteignByFastaNr(fastanumer);
		Fasteignaskra_Element[] fasteignir = getFasteignirByHeiti(searchString,
				sveitarfelagsNr);

		for (int i = 0; i < fasteignir.length; i++) {
			Fasteignaskra_Element skra = fasteignir[i];
			System.out.println("Fasteign med fastanumer: "
					+ skra.getFasteign().getFastanr() + " með fyrsta eiganda: "
					+ skra.getFasteign().getEigandi()[0].getNafn() + ", kt: "
					+ skra.getFasteign().getEigandi()[0].getKennitala());
		}

	}

	private FasteignaskraSoap getService() throws FileNotFoundException,
			ServiceException, Exception {

		EngineConfiguration config = getAxisEngine();
		// String monitorServiceUrl =
		// "http://localhost/SvcFasteignaskra_0201/Fasteignaskra.asmx";

		FasteignaskraLocator locator = new FasteignaskraLocator(config);
		locator.setEndpointAddress("FasteignaskraSoap", getServiceUrl());
		FasteignaskraSoap port = locator.getFasteignaskraSoap();

		/**
		 * For the signature part see:
		 * http://www.devx.com/Java/Article/28816/1954 and
		 * http://www.ivoa.net/internal/IVOA/IvoaGridAndWebServices/Java-security-howto.html
		 */
		Stub stub = (Stub) port;
		/*
		 * stub._setProperty(WSHandlerConstants.ACTION,WSHandlerConstants.USERNAME_TOKEN);
		 * stub._setProperty(WSHandlerConstants.PASSWORD_TYPE,WSConstants.PW_TEXT);
		 * stub._setProperty(WSHandlerConstants.USER, bfm.getUsername());
		 */

		stub._setProperty(WSHandlerConstants.ACTION,
				WSHandlerConstants.SIGNATURE);
		// stub._setProperty(WSHandlerConstants.USER,"privkey");
		stub._setProperty(WSHandlerConstants.USER,
				"c05d60a8-f08e-4713-b9af-f61840d3ab5f");
		stub._setProperty(WSHandlerConstants.SIG_PROP_FILE,
				getCryptoPropertiesFilePath());
		stub._setProperty(WSHandlerConstants.SIG_PROP_REF_ID,
				getCryptoPropertiesFilePath());
		stub._setProperty(WSHandlerConstants.SIG_KEY_ID, "DirectReference");// DirectReference
																			// or
																			// IssuerSerial

		stub._setProperty(WSHandlerConstants.PW_CALLBACK_CLASS, this.getClass()
				.getName());

		// Fix the Addressing Schema URI
		// (http://mail-archives.apache.org/mod_mbox/ws-addressing-dev/200610.mbox/%3C45341F0F.6090103@HotPOP.com%3E)
		stub
				._setProperty(
						org.apache.axis.message.addressing.Constants.ENV_ADDRESSING_NAMESPACE_URI,
						org.apache.axis.message.addressing.Constants.NS_URI_ADDRESSING_2004_03);

		// Fix the Addressing Schema URI
		// (http://mail-archives.apache.org/mod_mbox/ws-addressing-dev/200610.mbox/%3C45341F0F.6090103@HotPOP.com%3E)
		// stub._setProperty(org.apache.axis.message.addressing.Constants.TO,
		// "urn:landskra-wse:fasteignaskra_0201");

		AddressingHeaders addressingHeaders = (AddressingHeaders) stub
				._getProperty(Constants.ENV_ADDRESSING_REQUEST_HEADERS);
		if (addressingHeaders == null) {
			addressingHeaders = setUpAddressing();
			stub._setProperty(Constants.ENV_ADDRESSING_REQUEST_HEADERS,
					addressingHeaders);
		}
		return port;
	}

	protected EngineConfiguration getAxisEngine() throws URISyntaxException,
			IOException, ParserConfigurationException, SAXException {


		InputStream in = getAxisClientDeployConfigAsStream();

		File wsddFile = getTempFile("client-config.wsdd");
		// wsddFile.delete();
		// wsddFile.createNewFile();
		OutputStream out = new FileOutputStream(wsddFile);

		byte[] buf = new byte[1024];
		int read = in.read(buf);

		while (read > 0) {
			out.write(buf, 0, read);
			read = in.read(buf);
		}
		in.close();
		out.close();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		WSDDDocument wsdddoc = new WSDDDocument(db.parse(wsddFile));
		
		//WSDDDocument wsdddoc = new WSDDDocument(db.parse(in));
		
		// sas = new SimpleAxisServer();
		// sas.setServerSocket(new ServerSocket(serverport));
		// sas.setMyConfig(wsdddoc.getDeployment());

		EngineConfiguration config = wsdddoc.getDeployment();
		// new FileProvider(getAxisClientDeployConfigAsStream());
		return config;
	}

	private File getTempFile(String string) throws IOException {
		return File.createTempFile("fasteignaskraclient", string);
	}

	private InputStream getAxisClientDeployConfigAsStream()
			throws FileNotFoundException, URISyntaxException {
		String resourcePrefix = "resource://";
		String uri = getAxisClientDeployConfigURI();
		if (uri.startsWith(resourcePrefix)) {
			String path = uri.substring(resourcePrefix.length(), uri.length());
			return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
			//return getClass().getResourceAsStream(path);
		} else {
			return new FileInputStream(new File(new java.net.URI(
					getAxisClientDeployConfigURI())));
		}
		//
	}

	private static AddressingHeaders setUpAddressing() throws Exception {
		AddressingHeaders headers = new AddressingHeaders();
		String urn = "urn:landskra-wse:fasteignaskra_0201";
		Action a = new Action(new URI(urn));
		headers.setAction(a);
		To to = new To(new URI(urn));
		headers.setTo(to);
		// EndpointReference epr = new
		// EndpointReference("http://www.apache.org");
		// headers.setFaultTo(epr);
		return headers;
	}

	public void handle(Callback[] callbacks)
			throws UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			/*
			 * if (callbacks[i] instanceof WSPasswordCallback) {
			 * WSPasswordCallback pc = (WSPasswordCallback) callbacks[i]; String
			 * password = getPassword(pc.getIdentifer());
			 * pc.setPassword(password); } else { throw new
			 * UnsupportedCallbackException(callbacks[i], "Unrecognized
			 * Callback"); }
			 */

			if (callbacks[i] instanceof WSPasswordCallback) {
				WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
				/*
				 * here call a function/method to lookup the password for the
				 * given identifier (e.g. a user name or keystore alias) e.g.:
				 * pc.setPassword(passStore.getPassword(pc.getIdentfifier)) for
				 * festing we supply a fixed name here.
				 */
				pc.setPassword(getKeystorePassword());
			} else {
				throw new UnsupportedCallbackException(callbacks[i],
						"Unrecognized Callback");
			}

		}
	}

	public void setCryptoPropertiesFilePath(String cryptoPropertiesFilePath) {
		this.cryptoPropertiesFilePath = cryptoPropertiesFilePath;
	}

	public String getCryptoPropertiesFilePath() {
		return cryptoPropertiesFilePath;
	}

	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}

	public String getKeystorePassword() {
		return keystorePassword;
	}

	public void setAxisClientDeployConfigURI(String axisClientDeployConfigURI) {
		this.axisClientDeployConfigURI = axisClientDeployConfigURI;
	}

	public String getAxisClientDeployConfigURI() {
		return axisClientDeployConfigURI;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

}
