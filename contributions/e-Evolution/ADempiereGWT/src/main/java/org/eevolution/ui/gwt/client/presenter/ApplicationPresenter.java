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
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.ApplicationView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT ApplicationPresenter
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: ApplicationPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=ApplicationView.class)
public class ApplicationPresenter extends BasePresenter<ApplicationPresenter.IApplicationView, ApplicationEventBus> {

	public interface IApplicationView {
		
		public void setTopBar(Widget widget);

		public void setContent(Widget widget);
		
		public void setTreeMenu(Widget widget);
		
	}
	
	public void onSetNorth(Widget w){
		// TODO Auto-generated method stub
	}
	
	public void onSetCenter(Widget w){
		// TODO Auto-generated method stub
		
	}

	public void onSetWest(Widget w){
		// TODO Auto-generated method stub
		
	}
}
