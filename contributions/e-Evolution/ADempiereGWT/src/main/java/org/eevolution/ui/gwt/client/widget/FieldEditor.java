/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2007 e-Evolution,SC. All Rights Reserved.               *
 * Developer(s): Juan Carlos Perez www.e-evolution.com                        *
 *****************************************************************************/
package org.eevolution.ui.gwt.client.widget;

/**
 * ADempiere GWT AEditor
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
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
