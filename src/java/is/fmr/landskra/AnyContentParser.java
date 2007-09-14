/*
 * $Id: AnyContentParser.java,v 1.1 2007/09/14 10:39:51 thomas Exp $
 * Created on Sep 13, 2007
 *
 * Copyright (C) 2007 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.fmr.landskra;

import org.apache.axis.encoding.AnyContentType;

import fasteignaskra.landskra_wse.FasteignaskraFasteign;


/**
 * 
 *  Last modified: $Date: 2007/09/14 10:39:51 $ by $Author: thomas $
 * 
 * @author <a href="mailto:thomas@idega.com">thomas</a>
 * @version $Revision: 1.1 $
 */
public interface AnyContentParser {
	
	FasteignaskraFasteign parse(AnyContentType anyContentType) throws Exception;
}
