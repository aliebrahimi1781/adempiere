//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.TopBarView;
import org.eevolution.ui.gwt.client.view.interfaces.ITopBarView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT TopBarPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TopBarPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=TopBarView.class)
public class TopBarPresenter extends BasePresenter<ITopBarView, ADempiereEventBus> {

	
	public void onInitialize(){
		eventBus.setNorth(view.getViewWidget());
	}
}
