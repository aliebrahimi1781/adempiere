//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.ImageDialogView;
import org.eevolution.ui.gwt.client.view.interfaces.IImageDialogView;


import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;



/**
 * ADempiere GWT Image Dialog Presenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: ImageDialogPresenter.java, v 1.0 Feb 23, 2010
 */
@Presenter(view=ImageDialogView.class)
public class ImageDialogPresenter extends BasePresenter<IImageDialogView,ADempiereEventBus> {
	
	
	
	public void onGetAD_Image_ID()
	{
		// TODO Auto-generated method stub
	}
	
	public void onOk(){
		// TODO Auto-generated method stub
	}
	
	public void onCancel(){
		// TODO Auto-generated method stub
	}
}