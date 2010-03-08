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

import org.eevolution.ui.gwt.client.presenter.ApplicationPresenter;
import org.eevolution.ui.gwt.client.presenter.ContentPresenter;
import org.eevolution.ui.gwt.client.presenter.LoginPresenter;
import org.eevolution.ui.gwt.client.presenter.TopBarPresenter;
import org.eevolution.ui.gwt.client.presenter.TreeMenuPresenter;
import org.eevolution.ui.gwt.client.view.ApplicationView;
import org.eevolution.ui.gwt.client.view.LoginView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

/**
 * ADempiere GWT ApplicationEventBus
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: ApplicationEventBus, v 1.0 Feb 16, 2010
 */
@Events(startView=ApplicationView.class)
public interface ApplicationEventBus extends EventBus {
	
//	@Start
	@Event(handlers=LoginPresenter.class)
	public void login();

	@Event(handlers=LoginPresenter.class)
	public void authenticate();
	
	@Event(handlers=LoginPresenter.class)
	public void logout();
	
	@Event(handlers=ApplicationPresenter.class)
	public void setNorth(Widget w);

	@Event(handlers=ApplicationPresenter.class)
	public void setCenter(Widget w);

	@Event(handlers=ApplicationPresenter.class)
	public void setWest(Widget w);

	@Start
	@Event(handlers={TopBarPresenter.class, TreeMenuPresenter.class, ContentPresenter.class})
	public void initialize();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void openWindow();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void closeWindow();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void changeWindow();
	
	@Event(handlers=ContentPresenter.class)
	public void loadWindow();
}
