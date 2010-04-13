//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.TreeMenuView;
import org.eevolution.ui.gwt.client.view.interfaces.ITreeView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT TreePresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TreePresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=TreeMenuView.class)
public class TreeMenuPresenter extends BasePresenter<ITreeView, ADempiereEventBus> {



	public void onInitialize(){
		eventBus.setWest(view.getViewWidget());
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
