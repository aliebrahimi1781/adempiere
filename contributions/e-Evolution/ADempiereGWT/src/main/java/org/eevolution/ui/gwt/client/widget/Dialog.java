//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.DialogBox;

/**
 * ADempiere GWT Dialog
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: Dialog.java, v 1.0 Feb 5, 2010
 */
public class Dialog extends DialogBox {

	/**
	 * 
	 */
	public Dialog() {
	}

	/**
	 * @param autoHide
	 */
	public Dialog(boolean autoHide) {
		super(autoHide);
	}

	/**
	 * @param autoHide
	 * @param modal
	 */
	public Dialog(boolean autoHide, boolean modal) {
		super(autoHide, modal);
	}

}
