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

import java.util.Date;

import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;

/**
 * ADempiere GWT DateBoxField
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: DateBoxField.java, v 1.0 Feb 5, 2010
 */
public class DateBoxField extends DateBox implements FieldEditor<Date> {

	/**
	 * Identifier for required field
	 */
	private boolean required;
	
	/**
	 * Identifier for enabled field
	 */
	private boolean enabled;
	
	/**
	 * 
	 */
	public DateBoxField() {
	}

	/**
	 * @param picker
	 * @param date
	 * @param format
	 */
	public DateBoxField(DatePicker picker, Date date, Format format) {
		super(picker, date, format);
	}

	@Override
	public Date getDisplay() {
		return getValue();
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
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
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		super.setEnabled(enabled);
	}
	
	

}