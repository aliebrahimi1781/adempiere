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


/**
 * ADempiere GWT AButton
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: AButton.java, v 1.0 Feb 2, 2010
 */
public class Button extends com.google.gwt.user.client.ui.Button{



	/**
	 * 
	 */
	public Button() {
		super();
	}

	/**
	 * @param html
	 * @param handler
	 */
	public Button(String html, ClickHandler handler) {
		super(html, handler);
	}

	/**
	 * @param html
	 */
	public Button(String html) {
		super(html);
	}
	

	public void addClickListener(ClickHandler handler) {
		addClickHandler(handler);
	}


}
