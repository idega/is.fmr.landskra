/*
 * $Id: RealEstateAndLandParser.java,v 1.1 2007/11/13 16:27:38 thomas Exp $
 * Created on Oct 22, 2007
 *
 * Copyright (C) 2007 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.fmr.landskra;

import is.postur.Gata;
import is.postur.Gotuskra;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.axis.encoding.AnyContentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * 
 *  Last modified: $Date: 2007/11/13 16:27:38 $ by $Author: thomas $
 * 
 * @author <a href="mailto:thomas@idega.com">thomas</a>
 * @version $Revision: 1.1 $
 */
public class RealEstateAndLandParser {
	
	private static final String REAL_ESTATE_STREET_NODE_NAME = "gotuheiti";
	
	private static final String REAL_ESTATE_OWNER = "Eigandi";
	
	private static final String LAND_STREET_NODE_NAME = "heiti";
	
	private static final String LAND_OWNER = "Landeigandi";

	
	private static Logger getLogger() {
		return Logger.getLogger(FasteignaskraParser.class.getName());
	}
	
	SimpleDateFormat simpleDateFormat;
	
	private Pattern streetNumberRangePattern;
	
	public RealEstateAndLandParser() {
		// pattern like "12-144"
		streetNumberRangePattern = Pattern.compile("\\d+-\\d+");
	}

	public void parseLand(List fasteignaResult, AnyContentType anyContentType, String postnumer) throws Exception {
		parse(fasteignaResult, anyContentType, postnumer, LAND_STREET_NODE_NAME, LAND_OWNER);
	}
	
	public void parseRealEstate(List fasteignaResult, AnyContentType anyContentType, String postnumer) throws Exception {
		parse(fasteignaResult, anyContentType, postnumer, REAL_ESTATE_STREET_NODE_NAME, REAL_ESTATE_OWNER);
	}

	private void parse(List fasteignaResult, AnyContentType anyContentType, String postnumer, String streetNodeName, String ownerNodeName) throws Exception {
		Element fasteignaskraElement = (Element) anyContentType.get_any()[1].getAsDOM().getFirstChild();
		Element eFasteign = (Element) fasteignaskraElement.getFirstChild();
		NodeList fasteignElements = eFasteign.getChildNodes();
		String landNumer = null;
		String gotuheiti = null;
		String husnumer = null;
		String ownerName = null;
		String ownerKennitala = null;
		Node nodeOwner = null;
		List nodeMatseiningList = new ArrayList(1);
		boolean landNrCheck = true;
		boolean gotuheitiCheck = true;
		boolean husnummerCheck = true;
		boolean eigandiCheck = true;
		boolean ownerNameCheck = true;
		boolean ownerKennitalaCheck = true;
		for (int i = 0; (i < fasteignElements.getLength()); i++) {
			Node nProperty = fasteignElements.item(i);
			if (nProperty.getNodeName().equals("Matseining")) {
				nodeMatseiningList.add(nProperty);
			}
			else if (landNrCheck && nProperty.getNodeName().equals("landnr")) {
				landNumer = getNodeChildValueAsString(nProperty);
				landNrCheck = false;
			} 
			else if (gotuheitiCheck && nProperty.getNodeName().equals(streetNodeName)) {
				gotuheiti = getNodeChildValueAsString(nProperty);
				gotuheitiCheck = false;
			} 
			else if (husnummerCheck && nProperty.getNodeName().equals("husnumer")) {
				husnumer = getNodeChildValueAsString(nProperty);
				husnummerCheck = false;
			} 
			else if (eigandiCheck && nProperty.getNodeName().equals(ownerNodeName)) {
				nodeOwner = nProperty;
				eigandiCheck = false;
			}
		}
		if (nodeOwner != null) {
			NodeList nodeElements = nodeOwner.getChildNodes();
			for (int i = 0; i < nodeElements.getLength() && (ownerKennitalaCheck || ownerNameCheck); i++) {
				Node nProperty = nodeElements.item(i);
				if (ownerKennitalaCheck && nProperty.getNodeName().equals("kennitala")) {
					ownerKennitala = getNodeChildValueAsString(nProperty);
					ownerKennitalaCheck = false;
				}
				else if (ownerNameCheck && nProperty.getNodeName().equals("nafn")) {
					ownerName = getNodeChildValueAsString(nProperty);
					ownerNameCheck = false;
				}
			}
		}
		// get gata
		// figure out street, replace
		// streetName = MyStreet 1-5 and streetNumber = 1R
		// to
		// streetName = MyStreet and streetNumber = 1-5
		String streetName = null;
		String gotuNumer = null;
		if (gotuheiti != null) {
			Matcher matcher = streetNumberRangePattern.matcher(gotuheiti);
			if (matcher.find()) {
				gotuNumer = matcher.group();
				streetName = matcher.replaceAll("");
			}
			else {
				gotuNumer = husnumer;
				streetName = gotuheiti;
			}
			streetName.trim();
		}
		Gata gata = null;
		if(postnumer!=null){
			gata = Gotuskra.getCached().getGataByNafnAndPostnumer(streetName, postnumer);
		}
		if (! nodeMatseiningList.isEmpty()) {
			Iterator iterator = nodeMatseiningList.iterator();
			while (iterator.hasNext()) {
				Fasteign fasteign = new Fasteign();
				fasteign.setGata(gata);
				fasteign.setGotuNumer(gotuNumer);
				fasteign.setOwnerName(ownerName);
				fasteign.setOwnerKennitala(ownerKennitala);
				Node nodeMatseining = (Node) iterator.next();
				boolean fastaNrCheck = true;
				boolean matseiningarnrCheck = true;
				boolean merkingCheck = true;
				boolean landCheck = true;
				boolean skyringCheck =true;
				boolean notkunCheck = true; 
				NodeList nodeElements = nodeMatseining.getChildNodes();
				for (int i = 0; i < nodeElements.getLength() &&
					(fastaNrCheck || matseiningarnrCheck || merkingCheck || landCheck || skyringCheck || notkunCheck); i++) {
					Node nProperty = nodeElements.item(i);
	
					if (fastaNrCheck && nProperty.getNodeName().equals("fastanr")) {
						String fastanr = getNodeChildValueAsString(nProperty);
						fasteign.setFastaNumer(fastanr);
						fastaNrCheck = false;
					}
					else if (matseiningarnrCheck && nProperty.getNodeName().equals("matseiningarnr")) {
						String matseiningarnr = getNodeChildValueAsString(nProperty);
						fasteign.setMatseiningNumer(matseiningarnr);
						matseiningarnrCheck = false;
					} 
					else if (merkingCheck && nProperty.getNodeName().equals("merking")) {
						String merking = getNodeChildValueAsString(nProperty);
						fasteign.setMerking(merking);
						merkingCheck = false;
					}
					else if (landCheck && nProperty.getNodeName().equals("landnr")) {
						String landNumerLocal = getNodeChildValueAsString(nProperty);
						fasteign.setLandnumer(landNumerLocal);
						landCheck = false;
					}
					else if (skyringCheck && nProperty.getNodeName().equals("skyring")) {
						String skyring = getNodeChildValueAsString(nProperty);
						fasteign.setSkyring(skyring);
						skyringCheck = false;
					} 
					else if (notkunCheck && nProperty.getNodeName().equals("notkun")) {
						String notkun = getNodeChildValueAsString(nProperty);
						fasteign.setNotkun(notkun);
						notkunCheck = false;
					}
				}
				fasteignaResult.add(fasteign);
			}
		}
		else {
			Fasteign fasteign = new Fasteign();
			fasteign.setGata(gata);
			fasteign.setGotuNumer(gotuNumer);
			fasteign.setOwnerName(ownerName);
			fasteign.setOwnerKennitala(ownerKennitala);
			fasteign.setLandnumer(landNumer);
			fasteignaResult.add(fasteign);
		}
	}

	private String getNodeChildValueAsString(Node domNode) {
		Node firstChild = domNode.getFirstChild();
		if(firstChild!=null){
			return firstChild.getNodeValue();
		}
		return null;
	}
}
