package is.fmr.landskra;

import java.math.BigDecimal;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult;
import fasteignaskra.landskra_wse.Heiti;
import fasteignaskra.landskra_wse.HeitiHeiti;
import fasteignaskra.landskra_wse.HeitiHeitiFastaNr;

public class HeitiParser {

	Element heitiElement;

	Heiti heiti;

	public HeitiParser(Element asDOM) {
		heitiElement = asDOM;
		parseDom();
	}

	public HeitiParser(FindFastaNrByHeitiResponseFindFastaNrByHeitiResult response) throws Exception {
		this((Element)response.get_any()[1].getAsDOM().getFirstChild());
	}

	private void parseDom() {
		heiti = new Heiti();
		Element heitiHeitiElement = (Element) heitiElement
				.getFirstChild();
		parseHeiti(heitiHeitiElement);
	}

	private void parseHeiti(Element eHeiti) {
		HeitiHeiti hHeiti = new HeitiHeiti();
		heiti.setHeiti(hHeiti);

		NodeList children = eHeiti.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node nProperty = children.item(i);

			if (nProperty.getNodeName().equals("landnr")) {
				Integer landnr = getNodeChildValueAsInteger(nProperty);
				hHeiti.setLandnr(landnr);
			} else if (nProperty.getNodeName().equals("heitinr")) {
				Integer heitinr = getNodeChildValueAsInteger(nProperty);
				hHeiti.setHeitinr(heitinr);
			} else if (nProperty.getNodeName().equals("heiti")) {
				String heiti = getNodeChildValueAsString(nProperty);
				hHeiti.setHeiti(heiti);
			} else if (nProperty.getNodeName().equals("husnumer")) {
				String husnumer = getNodeChildValueAsString(nProperty);
				hHeiti.setHusnumer(husnumer);
			} else if (nProperty.getNodeName().equals("sveitarfelagsnr")) {
				String sveitarfelagsnr = getNodeChildValueAsString(nProperty);
				hHeiti.setSveitarfelagsnr(sveitarfelagsnr);
			} else if (nProperty.getNodeName().equals("sveitarfelag")) {
				String sveitarfelag = getNodeChildValueAsString(nProperty);
				hHeiti.setSveitarfelag(sveitarfelag);
			} else if (nProperty.getNodeName().equals("byggdarnr")) {
				String byggdarnr = getNodeChildValueAsString(nProperty);
				hHeiti.setByggdarnr(byggdarnr);
			} else if (nProperty.getNodeName().equals("byggd")) {
				String byggd = getNodeChildValueAsString(nProperty);
				hHeiti.setByggd(byggd);
			} else if (nProperty.getNodeName().equals("postnr")) {
				String postnr = getNodeChildValueAsString(nProperty);
				hHeiti.setPostnr(postnr);
			} else if (nProperty.getNodeName().equals("poststod")) {
				String poststod = getNodeChildValueAsString(nProperty);
				hHeiti.setPoststod(poststod);
			} else if (nProperty.getNodeName().equals("thinglysingarandlag")) {
				String thinglysingarandlag = getNodeChildValueAsString(nProperty);
				hHeiti.setThinglysingarandlag(thinglysingarandlag);
			} else if (nProperty.getNodeName().equals("FastaNr")) {
				parseFastaNr(nProperty, hHeiti);
			}
			

		}

	}

	private void parseFastaNr(Node node, HeitiHeiti heiti) {
		HeitiHeitiFastaNr fastanr = new HeitiHeitiFastaNr();
		HeitiHeitiFastaNr[] fastanumers = heiti.getFastaNr();
		if(fastanumers==null){
			fastanumers = new HeitiHeitiFastaNr[1];
			fastanumers[0]=fastanr;
		}
		else{
			HeitiHeitiFastaNr[] fastanumersnew = new HeitiHeitiFastaNr[fastanumers.length+1];
			System.arraycopy(fastanumers, 0, fastanumersnew, 0, fastanumers.length);
			fastanumersnew[fastanumers.length]=fastanr;
			fastanumers = fastanumersnew;
		}
		heiti.setFastaNr(fastanumers);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				Integer iFastanr = getNodeChildValueAsInteger(nProperty);
				fastanr.setFastanr(iFastanr);
			}
			else if (nProperty.getNodeName().equals("merking")) {
				String merking = getNodeChildValueAsString(nProperty);
				fastanr.setMerking(merking);
			} else if (nProperty.getNodeName().equals("heitinr")) {
				Integer heitinr = getNodeChildValueAsInteger(nProperty);
				fastanr.setHeitinr(heitinr);
			} else if (nProperty.getNodeName().equals("notkunarlykill")) {
				Short notkunarlykill = getNodeChildValueAsShort(nProperty);
				fastanr.setNotkunarlykill(notkunarlykill);
			} else if (nProperty.getNodeName().equals("notkun")) {
				String notkun = getNodeChildValueAsString(nProperty);
				fastanr.setNotkun(notkun);
			} else if (nProperty.getNodeName().equals("byggingarar")) {
				String byggingarar = getNodeChildValueAsString(nProperty);
				fastanr.setByggingarar(byggingarar);
			} else if (nProperty.getNodeName().equals("flatarmalseining")) {
				String flatarmalseining = getNodeChildValueAsString(nProperty);
				fastanr.setFlatarmalseining(flatarmalseining);
			} else if (nProperty.getNodeName().equals("flatarmal")) {
				BigDecimal flatarmal = getNodeChildValueAsBigDecimal(nProperty);
				fastanr.setFlatarmal(flatarmal);
			} else if (nProperty.getNodeName().equals("thinglysingarandlag")) {
				String thinglysingarandlag = getNodeChildValueAsString(nProperty);
				fastanr.setThinglysingarandlag(thinglysingarandlag);
			}
			
		}
		
	}

	/*
	private Calendar getNodeChildValueAsCalendar(Node domNode) {
		String str = getNodeChildValueAsString(domNode);
		Calendar calendar = new GregorianCalendar();
		
		Date date = Date.valueOf(str.substring(0,10));
		
		calendar.setTime(date);
		return calendar; 
	}
	*/

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

	public Heiti getHeiti() {
		// TODO Auto-generated method stub
		return heiti;
	}

}
