//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ITreeView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ITreeView.java, v 1.0 Apr 13, 2010
 */
public interface ITreeView{

	public void initialize();

	public void openWindow();

	public void closeWindow();

	public void changeWindow();

	public Widget getViewWidget();
}
