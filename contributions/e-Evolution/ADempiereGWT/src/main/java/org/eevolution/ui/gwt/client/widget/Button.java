//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.event.dom.client.ClickHandler;


/**
 * ADempiere GWT AButton
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: AButton.java, v 1.0 Feb 2, 2010
 */
public class Button extends com.google.gwt.user.client.ui.Button{



	/**
	 * 
	 */
	public Button() {
		super();
	}

	/**
	 * @param html
	 * @param handler
	 */
	public Button(String html, ClickHandler handler) {
		super(html, handler);
	}

	/**
	 * @param html
	 */
	public Button(String html) {
		super(html);
	}
	

	public void addClickListener(ClickHandler handler) {
		addClickHandler(handler);
	}


}
