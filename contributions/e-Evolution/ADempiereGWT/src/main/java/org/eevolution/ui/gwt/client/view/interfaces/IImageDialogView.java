package org.eevolution.ui.gwt.client.view.interfaces;

import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * ADempiere GWT IImageDialogView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Aberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: IImageDialogView.java, v 1.0 Apr 13, 2010
 */
public interface IImageDialogView{
	public void getAD_Image_ID();
	public void Ok();
	public void Cancel();
	
	public Widget getViewWidget();
}
