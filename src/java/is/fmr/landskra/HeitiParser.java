package is.fmr.landskra;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import fasteignaskra.landskra_wse.FindFastaNrByHeitiResponseFindFastaNrByHeitiResult;

public class HeitiParser {
	
	List listOfRealEstateNumbers;
	
	List listOfLandnumers;
	
	public void parse(FindFastaNrByHeitiResponseFindFastaNrByHeitiResult response) throws Exception {
		if (listOfLandnumers == null) {
			listOfLandnumers = new ArrayList();
		}
		if (listOfRealEstateNumbers == null) {
			listOfRealEstateNumbers = new ArrayList();
		}
		parse(response.get_any());
	}
	
	public void reset() {
		listOfRealEstateNumbers = null;
		listOfLandnumers = null;
	}

	private void parse(MessageElement[] messageElements) throws Exception {
		for (int i = 0; i < messageElements.length; i++) {
			MessageElement messageElement = messageElements[i];
			Element element = (Element) messageElement.getAsDOM().getFirstChild();
			parseDom(element);
		}
	}


	private void parseDom(Element heitiElement) {
		if (heitiElement == null) {
			return;
		}
		//Heiti heiti = new Heiti();
		NodeList nodes = heitiElement.getChildNodes();
		// nodes does not implement iterator
		for (int i = 0; i < nodes.getLength(); i++) {
			Element heitiHeitiElement = (Element) nodes.item(i);
			parseHeiti(heitiHeitiElement);
		}
	}

	private void parseHeiti(Element eHeiti) {

		NodeList children = eHeiti.getChildNodes();
		List resultFastanumer = null;
		String landnumer = null;
		for (int i = 0; i < children.getLength(); i++) {
			Node nProperty = children.item(i);

//			if (nProperty.getNodeName().equals("landnr")) {
//				Integer landnr = getNodeChildValueAsInteger(nProperty);
//				hHeiti.setLandnr(landnr);
//			} else if (nProperty.getNodeName().equals("heitinr")) {
//				Integer heitinr = getNodeChildValueAsInteger(nProperty);
//				hHeiti.setHeitinr(heitinr);
//			} else if (nProperty.getNodeName().equals("heiti")) {
//				String heitiString = getNodeChildValueAsString(nProperty);
//				hHeiti.setHeiti(heitiString);
//			} else 
//			if (nProperty.getNodeName().equals("husnumer")) {
//				String husnumer = getNodeChildValueAsString(nProperty);
//				Integer response = FasteignaskraClient.parseResponseStreetNumber(husnumer);
//				response.hashCode();
//				//hHeiti.setHusnumer(husnumer);
//			}
//			} else if (nProperty.getNodeName().equals("sveitarfelagsnr")) {
//				String sveitarfelagsnr = getNodeChildValueAsString(nProperty);
//				hHeiti.setSveitarfelagsnr(sveitarfelagsnr);
//			} else if (nProperty.getNodeName().equals("sveitarfelag")) {
//				String sveitarfelag = getNodeChildValueAsString(nProperty);
//				hHeiti.setSveitarfelag(sveitarfelag);
//			} else if (nProperty.getNodeName().equals("byggdarnr")) {
//				String byggdarnr = getNodeChildValueAsString(nProperty);
//				hHeiti.setByggdarnr(byggdarnr);
//			} else if (nProperty.getNodeName().equals("byggd")) {
//				String byggd = getNodeChildValueAsString(nProperty);
//				hHeiti.setByggd(byggd);
//			} else if (nProperty.getNodeName().equals("postnr")) {
//				String postnr = getNodeChildValueAsString(nProperty);
//				hHeiti.setPostnr(postnr);
//			} else if (nProperty.getNodeName().equals("poststod")) {
//				String poststod = getNodeChildValueAsString(nProperty);
//				hHeiti.setPoststod(poststod);
//			} else if (nProperty.getNodeName().equals("thinglysingarandlag")) {
//				String thinglysingarandlag = getNodeChildValueAsString(nProperty);
//				hHeiti.setThinglysingarandlag(thinglysingarandlag);
//			} else if (nProperty.getNodeName().equals("FastaNr")) {
//				// adds a fastnumer to the array in hheiti
//				parseFastaNr(nProperty, hHeiti);
//			}
			if (nProperty.getNodeName().equals("FastaNr")) {
				// adds a fastnumer to the array in hheiti
				List fastanumer = parseFastaNr(nProperty);
				if (resultFastanumer == null) {
					resultFastanumer = fastanumer;
				}
				else {
					resultFastanumer.addAll(fastanumer);
				}
			} 
			else if (nProperty.getNodeName().equals("landnr")) {
				landnumer = getNodeChildValueAsString(nProperty);
			}
		}
		if (resultFastanumer != null) {
			// if there are fastanumers as subnodes do not use the landnumer
			listOfRealEstateNumbers.addAll(resultFastanumer);
		}
		else if (landnumer != null) {
			// no fastanumers? use at least the landnumer
			listOfLandnumers.add(landnumer);
		}
	}

	/**
	 * returns true if at least one fastanumer was found else false
	 * 
	 * @param node
	 * @param heiti
	 * @return
	 */
	private List parseFastaNr(Node node) {
		List result = null;
//		HeitiHeitiFastaNr fastanr = new HeitiHeitiFastaNr();
//		HeitiHeitiFastaNr[] fastanumers = heiti.getFastaNr();
//		if(fastanumers==null){
//			fastanumers = new HeitiHeitiFastaNr[1];
//			fastanumers[0]=fastanr;
//		}
//		else{
//			HeitiHeitiFastaNr[] fastanumersnew = new HeitiHeitiFastaNr[fastanumers.length+1];
//			System.arraycopy(fastanumers, 0, fastanumersnew, 0, fastanumers.length);
//			fastanumersnew[fastanumers.length]=fastanr;
//			fastanumers = fastanumersnew;
//		}
//		heiti.setFastaNr(fastanumers);
		
		NodeList nodeElements = node.getChildNodes();
		for (int i = 0; i < nodeElements.getLength(); i++) {
			Node nProperty = nodeElements.item(i);

			if (nProperty.getNodeName().equals("fastanr")) {
				String iFastanr = getNodeChildValueAsString(nProperty);
//				fastanr.setFastanr(iFastanr);
				if (result == null) {
					result = new ArrayList();
				}
				result.add(iFastanr);
			}
//			else if (nProperty.getNodeName().equals("merking")) {
//				String merking = getNodeChildValueAsString(nProperty);
//				fastanr.setMerking(merking);
//			} else if (nProperty.getNodeName().equals("heitinr")) {
//				Integer heitinr = getNodeChildValueAsInteger(nProperty);
//				fastanr.setHeitinr(heitinr);
//			} else if (nProperty.getNodeName().equals("notkunarlykill")) {
//				Short notkunarlykill = getNodeChildValueAsShort(nProperty);
//				fastanr.setNotkunarlykill(notkunarlykill);
//			} else if (nProperty.getNodeName().equals("notkun")) {
//				String notkun = getNodeChildValueAsString(nProperty);
//				fastanr.setNotkun(notkun);
//			} else if (nProperty.getNodeName().equals("byggingarar")) {
//				String byggingarar = getNodeChildValueAsString(nProperty);
//				fastanr.setByggingarar(byggingarar);
//			} else if (nProperty.getNodeName().equals("flatarmalseining")) {
//				String flatarmalseining = getNodeChildValueAsString(nProperty);
//				fastanr.setFlatarmalseining(flatarmalseining);
//			} else if (nProperty.getNodeName().equals("flatarmal")) {
//				BigDecimal flatarmal = getNodeChildValueAsBigDecimal(nProperty);
//				fastanr.setFlatarmal(flatarmal);
//			} else if (nProperty.getNodeName().equals("thinglysingarandlag")) {
//				String thinglysingarandlag = getNodeChildValueAsString(nProperty);
//				fastanr.setThinglysingarandlag(thinglysingarandlag);
//			}
			
		}
		return result;
		
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
//
//	private BigDecimal getNodeChildValueAsBigDecimal(Node domNode) {
//		String str = getNodeChildValueAsString(domNode);
//		return new BigDecimal(str);
//	}
//
//	private Short getNodeChildValueAsShort(Node domNode) {
//		String str = getNodeChildValueAsString(domNode);
//		return new Short(str);
//	}

	private String getNodeChildValueAsString(Node domNode) {
		Node firstChild = domNode.getFirstChild();
		String str=null;
		if(firstChild!=null){
			str = firstChild.getNodeValue();
		}
		return str;
	}

//	private Integer getNodeChildValueAsInteger(Node domNode) {
//		String str = getNodeChildValueAsString(domNode);
//		return new Integer(str);
//	}

//	public Heiti getHeiti() {
//		// TODO Auto-generated method stub
//		return heiti;
//	}
	
	public List getRealEstateNumbers() {
		return listOfRealEstateNumbers;
	}
	
	public List getLandNumbers() {
		return listOfLandnumers;
	}

}
