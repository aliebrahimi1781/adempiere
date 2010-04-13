package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.interfaces.IWFEditorView;
import org.eevolution.ui.gwt.client.view.wf.WFEditorView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * 
 * ADempiere GWT WFEditorPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Aberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: WFEditorPresenter.java, v 1.0 Apr 13, 2010
 */

@Presenter(view=WFEditorView.class)
public class WFEditorPresenter extends BasePresenter<IWFEditorView, ADempiereEventBus>  {
	

	public void onLoad()
	{
		
	}
}
