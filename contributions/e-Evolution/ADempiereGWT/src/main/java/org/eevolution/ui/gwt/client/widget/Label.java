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

import com.google.gwt.user.client.ui.HasHorizontalAlignment;




/**
 * ADempiere GWT Label
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
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
