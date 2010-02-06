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

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;

/**
 * ADempiere GWT ToggleButton
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: ToggleButton.java, v 1.0 Feb 5, 2010
 */
public class ToggleButton extends com.google.gwt.user.client.ui.ToggleButton implements FieldEditor<String> {

	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * 
	 */
	public ToggleButton() {
	}

	/**
	 * @param upImage
	 */
	public ToggleButton(Image upImage) {
		super(upImage);
	}

	/**
	 * @param upText
	 */
	public ToggleButton(String upText) {
		super(upText);
	}

	/**
	 * @param upImage
	 * @param handler
	 */
	public ToggleButton(Image upImage, ClickHandler handler) {
		super(upImage, handler);
	}

	/**
	 * @param upImage
	 * @param downImage
	 */
	public ToggleButton(Image upImage, Image downImage) {
		super(upImage, downImage);
	}

	/**
	 * @param upText
	 * @param handler
	 */
	public ToggleButton(String upText, ClickHandler handler) {
		super(upText, handler);
	}

	/**
	 * @param upText
	 * @param downText
	 */
	public ToggleButton(String upText, String downText) {
		super(upText, downText);
	}

	/**
	 * @param upImage
	 * @param downImage
	 * @param handler
	 */
	public ToggleButton(Image upImage, Image downImage, ClickHandler handler) {
		super(upImage, downImage, handler);
	}

	@Override
	public String getDisplay() {
		return super.getText();
	}

	@Override
	public String getValue() {
		return super.getText();
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
		super.setText(value);
		
	}

}
