//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.TextArea;


/**
 * ADempiere GWT TextArea
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TextArea.java, v 1.0 Feb 5, 2010
 */
public class TextFieldArea extends TextArea implements FieldEditor<String>{

	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * 
	 */
	public TextFieldArea() {
	}

	@Override
	public String getDisplay() {
		return getValue();
	}

	@Override
	public boolean isRequired() {
		return this.required;
	}

	@Override
	public void setBackground(boolean error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRequired(boolean required) {
		this.required = required;
	}


}
