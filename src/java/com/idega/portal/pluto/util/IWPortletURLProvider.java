/**
 * $Id: IWPortletURLProvider.java,v 1.2 2007/04/22 14:59:25 eiki Exp $
 * Created in 2006 by tryggvil
 *
 * Copyright (C) 2000-2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.portal.pluto.util;

import java.util.Map;
import javax.portlet.PortletMode;
import javax.portlet.WindowState;
import org.apache.pluto.spi.PortletURLProvider;


/**
 * <p>
 * TODO tryggvil Describe Type IWPortletURLProvider
 * </p>
 *  Last modified: $Date: 2007/04/22 14:59:25 $ by $Author: eiki $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.2 $
 */
public class IWPortletURLProvider implements PortletURLProvider {

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#clearParameters()
	 */
	public void clearParameters() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#setAction(boolean)
	 */
	public void setAction(boolean arg0) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#setParameters(java.util.Map)
	 */
	public void setParameters(Map arg0) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#setPortletMode(javax.portlet.PortletMode)
	 */
	public void setPortletMode(PortletMode mode) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#setSecure()
	 */
	public void setSecure() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.apache.pluto.spi.PortletURLProvider#setWindowState(javax.portlet.WindowState)
	 */
	public void setWindowState(WindowState state) {
		// TODO Auto-generated method stub
	}

	public boolean isSecureSupported() {
		// TODO Auto-generated method stub
		return false;
	}
}
