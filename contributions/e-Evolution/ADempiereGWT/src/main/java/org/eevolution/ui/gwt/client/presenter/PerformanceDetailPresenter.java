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
 * Developer(s): Alberto Juarez Caballero www.e-evolution.com                 *
 *****************************************************************************/

package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.PerformanceDetailView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;


/**
 * ADempiere GWT PerformanceDetailPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
 * @version $Id: PerformanceDetailPresenter.java, v 1.0 Feb 19, 2010
 */

@Presenter(view = PerformanceDetailView.class)
public class PerformanceDetailPresenter extends BasePresenter<PerformanceDetailPresenter.IPerformanceDetailView,ApplicationEventBus>{

	public interface IPerformanceDetailView{
		
	}
}
