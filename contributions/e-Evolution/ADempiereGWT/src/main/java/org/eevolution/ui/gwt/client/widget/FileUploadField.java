//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.FileUpload;

/**
 * ADempiere GWT FileUploadField
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: FileUploadField.java, v 1.0 Feb 5, 2010
 */
public class FileUploadField extends FileUpload implements FieldEditor<String> {


	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * 
	 */
	public FileUploadField() {
	}


	@Override
	public String getDisplay() {
		return super.getFilename();
	}

	@Override
	public String getValue() {
		return super.getFilename();
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

	@Override
	public void setValue(String value) {

	}

}
