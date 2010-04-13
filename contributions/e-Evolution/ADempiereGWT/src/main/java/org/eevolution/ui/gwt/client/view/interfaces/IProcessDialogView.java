package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * ADempiere GWT IProcessDialogView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Aberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: IProcessDialogView.java, v 1.0 Apr 13, 2010
 */
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
