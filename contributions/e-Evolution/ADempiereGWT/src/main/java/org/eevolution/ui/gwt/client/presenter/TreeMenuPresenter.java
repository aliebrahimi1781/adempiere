//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import java.util.List;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.service.ADTreeService;
import org.eevolution.ui.gwt.client.service.ADTreeServiceAsync;
import org.eevolution.ui.gwt.client.view.TreeMenuView;
import org.eevolution.ui.gwt.client.view.interfaces.ITreeView;
import org.eevolution.ui.gwt.domain.ADTree;

import com.google.code.gwt.remoteaction.client.ActionExecutionServiceAsync;
import com.google.code.gwt.remoteaction.client.ActionProxy;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.TreeItem;
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

	private final ADTreeServiceAsync adService = GWT.create(ADTreeService.class);
	
	public void onInitialize(){
	eventBus.setWest(view.getViewWidget());
		
	adService.findAll(new AsyncCallback<List<ADTree>>() {
			
			@Override
			public void onSuccess(List<ADTree> result) {
				for (ADTree adTree : result) {
//					Window.alert(adTree.getName());
					TreeItem item = new TreeItem(adTree.getName());
					((TreeMenuView)view).getTreeMenu().addItem(item);
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}
	
	@InjectService
	public void setService( ActionExecutionServiceAsync actionExecutionService ) { 
        ((ActionProxy) adService).setActionExecutor(actionExecutionService);
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
