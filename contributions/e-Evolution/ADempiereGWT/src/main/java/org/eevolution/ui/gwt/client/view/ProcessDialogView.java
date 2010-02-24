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

package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.presenter.ProcessDialogPresenter.IProcessDialogView;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.Label;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ProcessDialogPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
 * @version $Id: ProcessDialogPresenter.java, v 1.0 Feb 19, 2010
 */

public class ProcessDialogView extends Dialog implements IProcessDialogView {
	
	private static ProcessDialogViewUiBinder uiBinder = GWT
	.create(ProcessDialogViewUiBinder.class);
	interface ProcessDialogViewUiBinder extends UiBinder<Widget, ProcessDialogView> {
	}
	
	
	private int 		    m_AD_Process_ID;
	private int			    m_WindowNo;
	private String		    m_Name = null;
	private boolean		    m_IsReport = false;
	private int[]		    m_ids = null;
	private boolean	        m_isLocked = false;
	private StringBuffer	m_messageText = new StringBuffer();
	private String          m_ShowHelp = null;
	private boolean isResult;
	private String initialMessage;
	private boolean valid = true;
	
	@UiField Label message;
	@UiField Button bOk;
	@UiField Button btn;
	

	
	public ProcessDialogView(int AD_Process_ID, boolean isSOTrx)
	{
		m_AD_Process_ID = AD_Process_ID;
		
		
		setWidget(uiBinder.createAndBindUi(this));
	    setGlassEnabled(true);
	    try
		{
			init();
		}
		catch(Exception ex)
		{
			
		}
	    
	   
	}
	

	public Widget getViewWidget(){
		return this;
	}

	@Override
	public boolean init() {
		
		setText("Process Dialog");
		btn.setText("Cancel");
		bOk.setText("Start");
		message.setText("Prueba de mensaje del Process Dialog");
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lockUI() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlockUI() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void printShipments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUI() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public boolean isUILocked() {
		return m_isLocked;
	}

	@Override
	public void afterProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printInvoices() {
		// TODO Auto-generated method stub
		
	}
}
