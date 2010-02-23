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
import com.google.gwt.event.shared.HandlerRegistration;



/**
 * ADempiere GWT CheckBox
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: CheckBox.java, v 1.0 Feb 5, 2010
 */
public class CheckBox extends com.google.gwt.user.client.ui.CheckBox {

	
	/**
	 * Default required value
	 * */
	private boolean required;

	/**
	 * 
	 */
	public CheckBox() {
	}

	/**
	 * @param label
	 */
	public CheckBox(String label) {
		super(label);
	}


	/**
	 * @param label
	 * @param asHTML
	 */
	public CheckBox(String label, boolean asHTML) {
		super(label, asHTML);
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return super.addClickHandler(handler);
	}

}
