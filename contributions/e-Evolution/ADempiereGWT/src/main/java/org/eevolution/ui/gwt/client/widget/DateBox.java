//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import java.util.Date;

import com.google.gwt.user.datepicker.client.DatePicker;

/**
 * ADempiere GWT DateBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: DateBox.java, v 1.0 Feb 5, 2010
 */
public class DateBox extends com.google.gwt.user.datepicker.client.DateBox {

	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * Identifier for enabled field
	 */
	private boolean enabled;
	
	/**
	 * 
	 */
	public DateBox() {
	}

	/**
	 * @param picker
	 * @param date
	 * @param format
	 */
	public DateBox(DatePicker picker, Date date, Format format) {
		super(picker, date, format);
	}


	public boolean isEnabled() {
		return this.enabled;
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		super.setEnabled(enabled);
	}
	

}
