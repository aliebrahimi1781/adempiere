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
package org.eevolution.ui.gwt.client;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.widget.CheckBoxField;
import org.eevolution.ui.gwt.client.widget.DateBoxField;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * ADempiere GWT ADempiereGWT
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: ADempiereGWT.java, v 1.0 Feb 2, 2010
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ADempiereGWT implements EntryPoint, ClickHandler {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		ConfirmPanel cp = new ConfirmPanel(true, true, false,false, false, false,false);
		cp.addClickHanler(this);
		RootPanel.get().add(cp);
		
	}

	@Override
	public void onClick(ClickEvent event) {
		Button button = (Button)event.getSource();
		if(button.getText().equals("Ok"))
			Window.alert("Ok was clicked!!!");
		else if(button.getText().equals("Cancel"))
			Window.alert("Cancel was clicked!!!");
		else if(button.getText().equals("Help"))
			Window.alert("Help was clicked!!!");
			
	}
}
