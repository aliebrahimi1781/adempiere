//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT IContentView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: IContentView.java, v 1.0 Apr 13, 2010
 */
public interface IContentView{
	
	public void initialize();
	
	public void loadWindow();
	
	public Widget getViewWidget();
}
