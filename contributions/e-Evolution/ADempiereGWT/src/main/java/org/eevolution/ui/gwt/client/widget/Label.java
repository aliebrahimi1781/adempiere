//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;




/**
 * ADempiere GWT Label
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: Label.java, v 1.0 Feb 5, 2010
 */
public class Label extends com.google.gwt.user.client.ui.Label {

	public enum HorizontalAlignment{
		CENTER,
		LEFT,
		RIGTH
	}
	
	 private boolean required;
	
	/**
	 * 
	 */
	public Label() {
	}

	/**
	 * @param text
	 */
	public Label(String text) {
		super(text);
	}
	
	
	/**
	 * @param text
	 */
	public Label(String text, HorizontalAlignment align) {
		super(text);
		if(align.equals(HorizontalAlignment.CENTER))
			setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		else if(align.equals(HorizontalAlignment.LEFT))
			setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		else
			setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
	}

	

	/**
	 * @param text
	 * @param wordWrap
	 */
	public Label(String text, boolean wordWrap) {
		super(text, wordWrap);
	}
	
	/**
	 * Method to set the label for
	 */
	public void setLabelFor(){
		//TODO: Implement this method
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}
	
	

}
