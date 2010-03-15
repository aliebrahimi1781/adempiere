//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

/**
 * ADempiere GWT FilenameBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: FilenameBox.java, v 1.0 Feb 23, 2010
 */
public class FilenameBox extends BaseBoxEditor {

	/**
	 * 
	 */
	public FilenameBox() {
		// TODO Auto-generated constructor stub
	}
	
	public FilenameBox(String fileName)
    {
        super();
        box.setText(fileName);
    }

}
