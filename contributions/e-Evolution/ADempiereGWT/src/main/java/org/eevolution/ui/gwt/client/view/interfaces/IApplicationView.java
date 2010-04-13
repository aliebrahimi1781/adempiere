//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT IApplicationView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: IApplicationView.java, v 1.0 Apr 13, 2010
 */
public interface IApplicationView {
	
	public void setTopBar(Widget widget);

	public void setContent(Widget widget);
	
	public void setTreeMenu(Widget widget);
	
}
