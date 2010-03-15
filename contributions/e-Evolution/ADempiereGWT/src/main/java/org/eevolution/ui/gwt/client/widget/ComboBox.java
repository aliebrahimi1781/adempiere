//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import org.eevolution.ui.gwt.client.data.Lookup;


/**
 * ADempiere GWT ComboBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ComboBox.java, v 1.0 Feb 5, 2010
 */
public class ComboBox extends com.google.gwt.user.client.ui.ListBox{

	
	/**
	 * Value for Lookup
	 */
	private Lookup lookup = new Lookup();
	
	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * 
	 */
	public ComboBox() {
		super(false);
	}

	/**
	 * @param isMultipleSelect
	 */
	public ComboBox(boolean isMultipleSelect) {
		super(isMultipleSelect);
	}

	public Lookup getValue() {
		return lookup;
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public void setValue(Lookup value) {
		if(value != null){
			addItem(value.getKey(), value.getValue());
			lookup = value;
		}
	}

}
