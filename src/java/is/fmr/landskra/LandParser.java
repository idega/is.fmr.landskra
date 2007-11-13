/*
 * $Id: LandParser.java,v 1.2 2007/11/13 16:27:38 thomas Exp $
 * Created on Sep 12, 2007
 *
 * Copyright (C) 2007 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.fmr.landskra;

import fasteignaskra.landskra_wse.FasteignaskraFasteign;
import fasteignaskra.landskra_wse.FasteignaskraFasteignAbuandi;
import fasteignaskra.landskra_wse.FasteignaskraFasteignEigandi;
import fasteignaskra.landskra_wse.FasteignaskraFasteignMatseining;
import fasteignaskra.landskra_wse.FasteignaskraFasteignUmradandi;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.axis.encoding.AnyContentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * 
 *  Last modified: $Date: 2007/11/13 16:27:38 $ by $Author: thomas $
 * 
 * @author <a href="mailto:thomas@idega.com">thomas</a>
 * @version $Revision: 1.2 $
 */
public class LandParser {
	
	public static final String DATE_PATTERN = "dd/MM/yyyy";
	
	private static Logger getLogger() {
		return Logger.getLogger(FasteignaskraParser.class.getName());
	}
	
	SimpleDateFormat simpleDateFormat;
	
	public LandParser() {
		simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);
	}

//	public LandParser(Element asDOM) {
//		fasteignaskraElement = asDOM;
//		simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);
//		parseDom();
//	}
//
//	public LandParser(GetLandByLandNrResponseGetLandByLandNrResult response) throws Exception {
//		this((Element)response.get_any()[1].getAsDOM().getFirstChild());
//	}
//
//	private void parseDom() {
//		fasteignaskra = new Fasteignaskra_Element();
//		Element fasteignElement = (Element) fasteignaskraElement
//				.getFirstChild();
//		parseFasteign(fasteignElement);
//	}
	
	public FasteignaskraFasteign parse(AnyContentType anyContentType) throws Exception {
		Element fasteignaskraElement = (Element) anyContentType.get_any()[1].getAsDOM().getFirstChild();
		Element fasteignElement = (Element) fasteignaskraElement.getFirstChild();
		return parseFasteign(fasteignElement);
	}

	private FasteignaskraFasteign parseFasteign(Element eFasteign) {
		FasteignaskraFasteign fasteign = new FasteignaskraFasteign();

		NodeList fasteignElements = eFasteign.getChildNodes();
		for (int i = 0; i < fasteignElements.getLength(); i++) {
			Node nProperty = fasteignElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer fastanr = getNodeChildValueAsInteger(nProperty);
				fasteign.setFastanr(fastanr);
			} else if (nProperty.getNodeName().equals("landnr")) {
				Integer landnr = getNodeChildValueAsInteger(nProperty);
				fasteign.setLandnr(landnr);
			} else if (nProperty.getNodeName().equals("merking")) {
				String merking = getNodeChildValueAsString(nProperty);
				fasteign.setMerking(merking);
			// be careful changed
			} else if (nProperty.getNodeName().equals("heiti")) {
				String gotuheiti = getNodeChildValueAsString(nProperty);
				fasteign.setGotuheiti(gotuheiti);
			} else if (nProperty.getNodeName().equals("husnumer")) {
				String husnumer = getNodeChildValueAsString(nProperty);
				fasteign.setHusnumer(husnumer);
			} else if (nProperty.getNodeName().equals("sveitarfelagsnr")) {
				String sveitarfelagsnr = getNodeChildValueAsString(nProperty);
				fasteign.setSveitarfelagsnr(sveitarfelagsnr);
			} else if (nProperty.getNodeName().equals("sveitarfelag")) {
				String sveitarfelag = getNodeChildValueAsString(nProperty);
				fasteign.setSveitarfelag(sveitarfelag);
			} else if (nProperty.getNodeName().equals("byggdarnr")) {
				String byggdarnr = getNodeChildValueAsString(nProperty);
				fasteign.setByggdarnr(byggdarnr);
			} else if (nProperty.getNodeName().equals("byggd")) {
				String byggd = getNodeChildValueAsString(nProperty);
				fasteign.setByggd(byggd);
			} else if (nProperty.getNodeName().equals("skyring")) {
				String skyring = getNodeChildValueAsString(nProperty);
				fasteign.setSkyring(skyring);
			} else if (nProperty.getNodeName().equals("notkunarlykill")) {
				Short notkunarlykill = getNodeChildValueAsShort(nProperty);
				fasteign.setNotkunarlykill(notkunarlykill);
			} else if (nProperty.getNodeName().equals("notkun")) {
				String notkun = getNodeChildValueAsString(nProperty);
				fasteign.setNotkun(notkun);
			} else if (nProperty.getNodeName().equals("tryggfelagslykill")) {
				String tryggfelagslykill = getNodeChildValueAsString(nProperty);
				fasteign.setTryggfelagslykill(tryggfelagslykill);
			} else if (nProperty.getNodeName().equals("tryggfelagsheiti")) {
				String tryggfelagsheiti = getNodeChildValueAsString(nProperty);
				fasteign.setTryggfelagsheiti(tryggfelagsheiti);
			} else if (nProperty.getNodeName().equals("Matseining")) {
				parseMatseining(nProperty,fasteign);
			} else if (nProperty.getNodeName().equals("Landeigandi")) {
				parseEigandi(nProperty,fasteign);
			} else if (nProperty.getNodeName().equals("Abuandi")) {
				parseAbuandi(nProperty,fasteign);
			} else if (nProperty.getNodeName().equals("Umradandi")) {
				parseUmradandi(nProperty,fasteign);
			}
		}
		return fasteign;

	}
	
	private void parseMatseining(Node node, FasteignaskraFasteign fasteign) {
		FasteignaskraFasteignMatseining matseining = new FasteignaskraFasteignMatseining();
		FasteignaskraFasteignMatseining[] matseiningar = fasteign.getMatseining();
		if(matseiningar==null){
			matseiningar = new FasteignaskraFasteignMatseining[1];
			matseiningar[0]=matseining;
		}
		else{
			FasteignaskraFasteignMatseining[] matseiningarnew = new FasteignaskraFasteignMatseining[matseiningar.length+1];
			System.arraycopy(matseiningar, 0, matseiningarnew, 0, matseiningar.length);
			matseiningarnew[matseiningar.length]=matseining;
			matseiningar = matseiningarnew;
		}
		fasteign.setMatseining(matseiningar);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer fastanr = getNodeChildValueAsInteger(nProperty);
				matseining.setFastanr(fastanr);
			}
			else if (nProperty.getNodeName().equals("matseiningarnr")) {
				Integer matseiningarnr = getNodeChildValueAsInteger(nProperty);
				matseining.setMatseiningarnr(matseiningarnr);
			} else if (nProperty.getNodeName().equals("landnr")) {
				Integer landnr = getNodeChildValueAsInteger(nProperty);
				matseining.setLandnr(landnr);
			} else if (nProperty.getNodeName().equals("heitinr")) {
				Integer heitinr = getNodeChildValueAsInteger(nProperty);
				matseining.setHeitinr(heitinr);
			} else if (nProperty.getNodeName().equals("skyring")) {
				String skyring = getNodeChildValueAsString(nProperty);
				matseining.setSkyring(skyring);
			} else if (nProperty.getNodeName().equals("notkunarlykill")) {
				Short notkunarlykill = getNodeChildValueAsShort(nProperty);
				matseining.setNotkunarlykill(notkunarlykill);
			} else if (nProperty.getNodeName().equals("notkun")) {
				String notkun = getNodeChildValueAsString(nProperty);
				matseining.setNotkun(notkun);
			} else if (nProperty.getNodeName().equals("merking")) {
				String merking = getNodeChildValueAsString(nProperty);
				matseining.setMerking(merking);
			} else if (nProperty.getNodeName().equals("flatarmal")) {
				BigDecimal flatarmal = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setFlatarmal(flatarmal);
			} else if (nProperty.getNodeName().equals("flatarmalseining")) {
				String flatarmalseining = getNodeChildValueAsString(nProperty);
				matseining.setFlatarmalseining(flatarmalseining);
			} else if (nProperty.getNodeName().equals("byggingarstigslykill")) {
				String byggingarstigslykill = getNodeChildValueAsString(nProperty);
				matseining.setByggingarstigslykill(byggingarstigslykill);
			} else if (nProperty.getNodeName().equals("byggingarstig")) {
				String byggingarstig = getNodeChildValueAsString(nProperty);
				matseining.setByggingarstig(byggingarstig);
			} else if (nProperty.getNodeName().equals("byggingarefnislykill")) {
				String byggingarefnislykill = getNodeChildValueAsString(nProperty);
				matseining.setByggingarefnislykill(byggingarefnislykill);
			} else if (nProperty.getNodeName().equals("byggingarefni")) {
				String byggingarefni = getNodeChildValueAsString(nProperty);
				matseining.setByggingarefni(byggingarefni);
			} else if (nProperty.getNodeName().equals("byggingarar")) {
				String byggingarar = getNodeChildValueAsString(nProperty);
				matseining.setByggingarar(byggingarar);
			} else if (nProperty.getNodeName().equals("herbergi")) {
				Integer herbergi = getNodeChildValueAsInteger(nProperty);
				matseining.setHerbergi(herbergi);
			} else if (nProperty.getNodeName().equals("husmat")) {
				BigDecimal husmat = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setHusmat(husmat);
			} else if (nProperty.getNodeName().equals("lodarhlutamat")) {
				BigDecimal lodarhlutamat = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setLodarhlutamat(lodarhlutamat);
			} else if (nProperty.getNodeName().equals("fasteignamat")) {
				BigDecimal fasteignamat = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setFasteignamat(fasteignamat);
			} else if (nProperty.getNodeName().equals("brunabotamat")) {
				BigDecimal brunabotamat = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setBrunabotamat(brunabotamat);
			} else if (nProperty.getNodeName().equals("byggingarvisitala")) {
				BigDecimal byggingarvisitala = getNodeChildValueAsBigDecimal(nProperty);
				matseining.setByggingarvisitala(byggingarvisitala);
			} else if (nProperty.getNodeName().equals("bvisitdags")) {
				Calendar bvisitdags = getNodeChildValueAsCalendar(nProperty);
				matseining.setBvisitdags(bvisitdags);
			}
			
		}
		
	}

	private void parseEigandi(Node node, FasteignaskraFasteign fasteign) {
		FasteignaskraFasteignEigandi eigandi = new FasteignaskraFasteignEigandi();
		FasteignaskraFasteignEigandi[] eigendur = fasteign.getEigandi();
		if(eigendur==null){
			eigendur = new FasteignaskraFasteignEigandi[1];
			eigendur[0]=eigandi;
		}
		else{
			FasteignaskraFasteignEigandi[] eigendurnew = new FasteignaskraFasteignEigandi[eigendur.length+1];
			System.arraycopy(eigendur, 0, eigendurnew, 0, eigendur.length);
			eigendurnew[eigendur.length]=eigandi;
			eigendur = eigendurnew;
		}
		fasteign.setEigandi(eigendur);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer fastanr = getNodeChildValueAsInteger(nProperty);
				eigandi.setFastanr(fastanr);
			}
			else if (nProperty.getNodeName().equals("kennitala")) {
				String kennitala = getNodeChildValueAsString(nProperty);
				eigandi.setKennitala(kennitala);
			} else if (nProperty.getNodeName().equals("nafn")) {
				String nafn = getNodeChildValueAsString(nProperty);
				eigandi.setNafn(nafn);
			} else if (nProperty.getNodeName().equals("eignarhluti")) {
				BigDecimal eignarhluti = getNodeChildValueAsBigDecimal(nProperty);
				eigandi.setEignarhluti(eignarhluti);
			} else if (nProperty.getNodeName().equals("eigandanumer")) {
				String eigandanumer = getNodeChildValueAsString(nProperty);
				eigandi.setEigandanumer(eigandanumer);
			} else if (nProperty.getNodeName().equals("kaupdagur")) {
				Calendar kaupdagur = getNodeChildValueAsCalendar(nProperty);
				eigandi.setKaupdagur(kaupdagur);
			} else if (nProperty.getNodeName().equals("afhendingardagur")) {
				Calendar afhendingardagur = getNodeChildValueAsCalendar(nProperty);
				eigandi.setAfhendingardagur(afhendingardagur);
			}
			
		}
		
	}
	
	private void parseAbuandi(Node node, FasteignaskraFasteign fasteign) {
		FasteignaskraFasteignAbuandi abuandi = new FasteignaskraFasteignAbuandi();
		FasteignaskraFasteignAbuandi[] abuendur = fasteign.getAbuandi();
		if(abuendur==null){
			abuendur = new FasteignaskraFasteignAbuandi[1];
			abuendur[0]=abuandi;
		}
		else{
			FasteignaskraFasteignAbuandi[] abuendurnew = new FasteignaskraFasteignAbuandi[abuendur.length+1];
			System.arraycopy(abuendur, 0, abuendurnew, 0, abuendur.length);
			abuendurnew[abuendur.length]=abuandi;
			abuendur = abuendurnew;
		}
		fasteign.setAbuandi(abuendur);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer fastanr = getNodeChildValueAsInteger(nProperty);
				abuandi.setFastanr(fastanr);
			}
			else if (nProperty.getNodeName().equals("kennitala")) {
				String kennitala = getNodeChildValueAsString(nProperty);
				abuandi.setKennitala(kennitala);
			} else if (nProperty.getNodeName().equals("nafn")) {
				String nafn = getNodeChildValueAsString(nProperty);
				abuandi.setNafn(nafn);
			} else if (nProperty.getNodeName().equals("eignarhluti")) {
				BigDecimal eignarhluti = getNodeChildValueAsBigDecimal(nProperty);
				abuandi.setEignarhluti(eignarhluti);
			} else if (nProperty.getNodeName().equals("eigandanumer")) {
				String eigandanumer = getNodeChildValueAsString(nProperty);
				abuandi.setEigandanumer(eigandanumer);
			} else if (nProperty.getNodeName().equals("kaupdagur")) {
				Calendar kaupdagur = getNodeChildValueAsCalendar(nProperty);
				abuandi.setKaupdagur(kaupdagur);
			} else if (nProperty.getNodeName().equals("afhendingardagur")) {
				Calendar afhendingardagur = getNodeChildValueAsCalendar(nProperty);
				abuandi.setAfhendingardagur(afhendingardagur);
			}
			
		}
		
	}

	private void parseUmradandi(Node node, FasteignaskraFasteign fasteign) {
		FasteignaskraFasteignUmradandi umradandi = new FasteignaskraFasteignUmradandi();
		FasteignaskraFasteignUmradandi[] umradendur = fasteign.getUmradandi();
		if(umradendur==null){
			umradendur = new FasteignaskraFasteignUmradandi[1];
			umradendur[0]=umradandi;
		}
		else{
			FasteignaskraFasteignUmradandi[] umradendurnew = new FasteignaskraFasteignUmradandi[umradendur.length+1];
			System.arraycopy(umradendur, 0, umradendurnew, 0, umradendur.length);
			umradendurnew[umradendur.length]=umradandi;
			umradendur = umradendurnew;
		}
		fasteign.setUmradandi(umradendur);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer fastanr = getNodeChildValueAsInteger(nProperty);
				umradandi.setFastanr(fastanr);
			}
			else if (nProperty.getNodeName().equals("kennitala")) {
				String kennitala = getNodeChildValueAsString(nProperty);
				umradandi.setKennitala(kennitala);
			} else if (nProperty.getNodeName().equals("nafn")) {
				String nafn = getNodeChildValueAsString(nProperty);
				umradandi.setNafn(nafn);
			} else if (nProperty.getNodeName().equals("eignarhluti")) {
				BigDecimal eignarhluti = getNodeChildValueAsBigDecimal(nProperty);
				umradandi.setEignarhluti(eignarhluti);
			} else if (nProperty.getNodeName().equals("eigandanumer")) {
				String eigandanumer = getNodeChildValueAsString(nProperty);
				umradandi.setEigandanumer(eigandanumer);
			} else if (nProperty.getNodeName().equals("kaupdagur")) {
				Calendar kaupdagur = getNodeChildValueAsCalendar(nProperty);
				umradandi.setKaupdagur(kaupdagur);
			} else if (nProperty.getNodeName().equals("afhendingardagur")) {
				Calendar afhendingardagur = getNodeChildValueAsCalendar(nProperty);
				umradandi.setAfhendingardagur(afhendingardagur);
			}
			
		}
		
	}	
	
	private Calendar getNodeChildValueAsCalendar(Node domNode) {
		Calendar calendar = new GregorianCalendar();
		String str = getNodeChildValueAsString(domNode);
		try {
			Date date = simpleDateFormat.parse(str);
			calendar.setTime(date);
		}
		catch (ParseException e) {
			getLogger().log(Level.WARNING, "[FasteignaSkraParser] Date could not be parsed: " + str + "Message was: " + e.getMessage());
		}
		return calendar; 
	}

	private BigDecimal getNodeChildValueAsBigDecimal(Node domNode) {
		String str = getNodeChildValueAsString(domNode);
		return new BigDecimal(str);
	}

	private Short getNodeChildValueAsShort(Node domNode) {
		String str = getNodeChildValueAsString(domNode);
		return new Short(str);
	}

	private String getNodeChildValueAsString(Node domNode) {
		Node firstChild = domNode.getFirstChild();
		String str=null;
		if(firstChild!=null){
			str = firstChild.getNodeValue();
		}
		return str;
	}

	private Integer getNodeChildValueAsInteger(Node domNode) {
		String str = getNodeChildValueAsString(domNode);
		return new Integer(str);
	}

}
