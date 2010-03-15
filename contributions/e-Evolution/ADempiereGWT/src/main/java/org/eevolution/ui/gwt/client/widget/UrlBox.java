//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

/**
 * ADempiere GWT UrlBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: UrlBox.java, v 1.0 Feb 23, 2010
 */
public class UrlBox extends BaseBoxEditor {

	/**
	 * 
	 */
	public UrlBox() {

	}

	public UrlBox(String url)
	{
		super();
		box.setText(url);
	}
}
