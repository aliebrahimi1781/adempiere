//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.ImageDialogView;


import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view=ImageDialogView.class)

/**
 * ADempiere GWT Image Dialog Presenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: ImageDialogPresenter.java, v 1.0 Feb 23, 2010
 */

public class ImageDialogPresenter extends BasePresenter<ImageDialogPresenter.IImageDialogView,ApplicationEventBus> {
	
	public interface IImageDialogView{
		public void getAD_Image_ID();
		public void Ok();
		public void Cancel();
		
		public Widget getViewWidget();
	}
	
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