//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.PasswordTextBox;


/**
 * ADempiere GWT PasswordTextBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: PasswordTextBox.java, v 1.0 Feb 5, 2010
 */
public class PasswordTextField extends PasswordTextBox implements FieldEditor<String> {

	
	/**
	 * Identifier for required field
	 */
	private boolean required;

	/**
	 * 
	 */
	public PasswordTextField() {
	}

	@Override
	public String getDisplay() {
		return super.getValue();
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
