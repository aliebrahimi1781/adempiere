//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import java.util.List;

import org.eevolution.ui.gwt.client.ADTreeServiceAsync;
import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.domain.ADTree;
import org.eevolution.ui.gwt.client.view.TreeMenuView;
import org.eevolution.ui.gwt.client.view.interfaces.ITreeView;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mvp4g.client.annotation.InjectService;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT TreePresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TreePresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=TreeMenuView.class)
public class TreeMenuPresenter extends BasePresenter<ITreeView, ADempiereEventBus> {

	private ADTreeServiceAsync service;

	public void onInitialize(){
	eventBus.setWest(view.getViewWidget());
		
		service.findAll(new AsyncCallback<List<ADTree>>() {
			
			@Override
			public void onSuccess(List<ADTree> result) {
				for (ADTree adTree : result) {
					Window.alert(adTree.getName());
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}
	
	@InjectService
	public void setService( ADTreeServiceAsync service ) { 
        this.service = service; 
	}

	public void onOpenWindow(){
		// TODO Auto-generated method stub
	}

	public void onCloseWindow(){
		// TODO Auto-generated method stub
		
	}

	public void onChangeWindow(){
		// TODO Auto-generated method stub
	}
}
