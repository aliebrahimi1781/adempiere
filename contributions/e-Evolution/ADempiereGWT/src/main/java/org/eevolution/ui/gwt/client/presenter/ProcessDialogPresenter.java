//TODO:Copyright message should go here

package org.eevolution.ui.gwt.client.presenter;


import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.ProcessDialogView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT ProcessDialogPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
 * @version $Id: ProcessDialogPresenter.java, v 1.0 Feb 19, 2010
 */

@Presenter(view=ProcessDialogView.class)
public class ProcessDialogPresenter extends BasePresenter<ProcessDialogPresenter.IProcessDialogView,ApplicationEventBus> {
	public interface IProcessDialogView{
		
		public boolean init();
		public boolean lockUI();
		public boolean unlockUI();
		public void startProcess();
		public void updateUI();
		public void afterProcess();
		public void printShipments();
		public void printInvoices();
		public Widget getViewWidget();
		
	}
	
	public void onInit()
	{
		// TODO Auto-generated method stub
	}
	
	public void onLockUI()
	{
		// TODO Auto-generated method stub
	}
	
	public void onUnLockUI()
	{
		// TODO Auto-generated method stub
	}
	
	public void onStartProcess()
	{
		// TODO Auto-generated method stub
	}
	
	public void onUpdateUi()
	{
		// TODO Auto-generated method stub
	}
	
	public void onPrintShipments()
	{
		// TODO Auto-generated method stub
	}
	
	public void onPrintInvoices()
	{
		// TODO Auto-generated method stub
	}
	
	public void onAfterProcess()
	{
		// TODO Auto-generated method stub
	}

}
