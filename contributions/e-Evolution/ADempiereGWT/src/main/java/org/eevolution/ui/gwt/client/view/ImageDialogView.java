//TODO:Copyright message should go here!

package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.presenter.ImageDialogPresenter.IImageDialogView;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.Label;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;


/**
 * ADempiere GWT ImageDialogView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: ImageDialogView.java, v 1.0 Feb 23, 2010
 */

public class ImageDialogView extends Dialog implements IImageDialogView {

	private static ImageDialogViewUiBinder uiBinder = GWT
	.create(ImageDialogViewUiBinder.class);
	interface ImageDialogViewUiBinder extends UiBinder<Widget, ImageDialogView> {
	}
	
	@UiField Label fileLabel;
	@UiField FileUpload fileButton;
	@UiField Image image;
	@UiField ConfirmPanel confirmPanel;
	@UiField FormPanel fp;
	private boolean cancel = false;
	
	public ImageDialogView()
	{
		
		setWidget(uiBinder.createAndBindUi(this));
		this.setText("Image Dialog"); //Msg.translate(Env.getCtx(), "AD_Image_ID")
		
		try
		{
			init();
		}
		catch(Exception ex)
		{
		
		}
		
	}
	
	@Override
	public Widget getViewWidget() {
		return this;
	}
	
	
	public void init()
	{
		fileLabel.setText("Select File:");
		image.setUrl("page.jpg");	
	}

	public boolean isCancel() {
		return cancel;
	}
	
	/**
	 *  Load file & display
	 */
	private void cmd_file()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void getAD_Image_ID() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Ok() {
		// TODO Auto-generated method stub
	}

}
