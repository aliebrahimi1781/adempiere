//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;


/**
 * ADempiere GWT PAttributeBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: PAttributeBox.java, v 1.0 Feb 23, 2010
 */
public class PAttributeBox extends BaseBoxEditor {

	/**
	 * 
	 */
	public PAttributeBox() {
		// TODO Auto-generated constructor stub
	}

	/**
     * @param description
     */
	public PAttributeBox(String description)
    {
        super();
        box.setText(description);
    }
}
