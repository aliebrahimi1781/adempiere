//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;



/**
 * ADempiere GWT CheckBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: CheckBox.java, v 1.0 Feb 5, 2010
 */
public class CheckBox extends com.google.gwt.user.client.ui.CheckBox {

	
	/**
	 * Default required value
	 * */
	private boolean required;

	/**
	 * 
	 */
	public CheckBox() {
	}

	/**
	 * @param label
	 */
	public CheckBox(String label) {
		super(label);
	}


	/**
	 * @param label
	 * @param asHTML
	 */
	public CheckBox(String label, boolean asHTML) {
		super(label, asHTML);
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return super.addClickHandler(handler);
	}

}
