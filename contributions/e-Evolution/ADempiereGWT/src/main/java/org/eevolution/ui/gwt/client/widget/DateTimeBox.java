//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;



/**
 * ADempiere GWT DateTimeBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: DateTimeBox.java, v 1.0 Feb 23, 2010
 */
public class DateTimeBox extends DateBox {

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
	public DateTimeBox() {
		super();
		DateTimeFormat dateFormat = DateTimeFormat.getFormat("MM/dd/yyyy h:mm");
	    setFormat(new DateBox.DefaultFormat(dateFormat));
	}

	/**
	 * @param picker
	 * @param date
	 * @param format
	 */
	public DateTimeBox(DatePicker picker, Date date, Format format) {
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
