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

import org.eevolution.ui.gwt.client.presenter.TreeMenuPresenter.ITreeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT TreeView
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: TreeView.java, v 1.0 Feb 16, 2010
 */
public class TreeMenuView extends Composite implements ITreeView {

	private static TreeMenuViewUiBinder uiBinder = GWT
			.create(TreeMenuViewUiBinder.class);

	interface TreeMenuViewUiBinder extends UiBinder<Widget, TreeMenuView> {
	}

	public TreeMenuView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void changeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget getViewWidget() {
		return this;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openWindow() {
		// TODO Auto-generated method stub
		
	}

}
