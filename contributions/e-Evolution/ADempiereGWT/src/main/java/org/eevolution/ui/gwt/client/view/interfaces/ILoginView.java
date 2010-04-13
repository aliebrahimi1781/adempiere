//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ILoginView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ILoginView.java, v 1.0 Apr 13, 2010
 */
public interface ILoginView {

	public void login();
	
	public void authenticate();
	
	public void logout();
	
	public Widget getViewWidget();

}
