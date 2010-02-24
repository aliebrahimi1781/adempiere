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
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
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
