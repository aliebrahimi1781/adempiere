package org.eevolution.ui.gwt.client.view.wf;

import org.eevolution.ui.gwt.client.ApplicationEventBus;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view=WFEditorView.class)
public class WFEditorPresenter extends BasePresenter<WFEditorPresenter.IWFEditorView, ApplicationEventBus>  {
	public interface IWFEditorView{
		public void load(int workflowid);
	}

	public void onLoad()
	{
		
	}
}
