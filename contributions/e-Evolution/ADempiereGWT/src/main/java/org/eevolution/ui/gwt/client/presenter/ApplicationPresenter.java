//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.ApplicationView;
import org.eevolution.ui.gwt.client.view.interfaces.IApplicationView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT ApplicationPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ApplicationPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=ApplicationView.class)
public class ApplicationPresenter extends BasePresenter<IApplicationView, ADempiereEventBus> {

	
	
	public void onSetNorth(Widget w){
		view.setTopBar(w);
	}
	
	public void onSetCenter(Widget w){
		view.setContent(w);
		
	}

	public void onSetWest(Widget w){
		view.setTreeMenu(w);
		
	}
}
