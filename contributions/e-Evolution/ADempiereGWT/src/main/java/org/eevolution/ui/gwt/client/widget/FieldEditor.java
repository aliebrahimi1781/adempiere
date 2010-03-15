//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

/**
 * ADempiere GWT AEditor
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: AEditor.java, v 1.0 Feb 5, 2010
 */
public interface FieldEditor<T> {
	
	/**
	 *	Enable Editor
	 *  @param enable true, if you can enter/select data
	 */
	public void setEnabled (boolean enable);

	/**
	 *	If it's possible to edit
	 *  @return true, if editable
	 */
	public boolean isEnabled();

	/**
	 *	Set Editor as requiered
	 *  @param required true, if you have to enter data
	 */
	public void setRequired (boolean required);

	/**
	 *	If Field is required
	 *  @return true, if required
	 */
	public boolean isRequired();

	/**
	 *  Set Background based on editable / mandatory / error
	 *  @param error if true, set background to error color, otherwise required/editable
	 */
	public void setBackground (boolean error);

	/**
	 *  Set Visible
	 *  @param visible true if field is to be shown
	 */
	public void setVisible (boolean visible);
	
	/**
	 *	If Field is visible
	 *  @return true, if required
	 */
	public boolean isVisible();

	/**
	 *	Set Editor to value
	 *  @param value value of the editor
	 */
	public void setValue (T value);

	/**
	 *	Return Editor value
	 *  @return current value
	 */
	public T getValue();

	/**
	 *  Return Display Value
	 *  @return displayed T value
	 */
	public T getDisplay();

}
