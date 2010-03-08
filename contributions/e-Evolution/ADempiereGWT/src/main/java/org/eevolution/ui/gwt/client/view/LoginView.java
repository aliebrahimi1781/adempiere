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
package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.presenter.LoginPresenter.ILoginView;
import org.eevolution.ui.gwt.client.widget.Button;
import org.eevolution.ui.gwt.client.widget.Dialog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT LoginView
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: LoginView.java, v 1.0 Feb 16, 2010
 */
public class LoginView extends Dialog implements ILoginView {

	private static LoginViewUiBinder uiBinder = GWT
			.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField TabLayoutPanel tabs;
	@UiField ConfirmPanel confirmPanel;
	
	public LoginView() {
		setWidget(uiBinder.createAndBindUi(this));
		setText("Login");
	    setGlassEnabled(true);
	    confirmPanel.addClickHanler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Button btn = (Button)event.getSource();
				if(btn.getText().equals("Ok"))
					login();
			}
		});
	}

	@Override
	public Widget getViewWidget() {
		return this;
	}

	@Override
	public void login() {
		hide();
//		RootLayoutPanel.get().add( new ApplicationView());
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void authenticate() {
		// TODO Auto-generated method stub
		
	}

}
