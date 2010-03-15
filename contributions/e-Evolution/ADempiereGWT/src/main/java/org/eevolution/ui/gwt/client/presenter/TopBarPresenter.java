//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.TopBarView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT TopBarPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TopBarPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=TopBarView.class)
public class TopBarPresenter extends BasePresenter<TopBarPresenter.ITopBarView, ApplicationEventBus> {

	public interface ITopBarView{
		
		public void initialize();
		
		public Widget getViewWidget();
	}
	
	public void onInitialize(){
		eventBus.setNorth(view.getViewWidget());
	}
}
