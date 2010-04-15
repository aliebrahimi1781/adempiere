package org.eevolution.ui.gwt.client.presenter;


import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.Browser.BrowserView;
import org.eevolution.ui.gwt.client.view.interfaces.IBrowserView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * 
 * ADempiere GWT BrowserPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: BrowserPresenter.java, v 1.0 Apr 9, 2010
 */
@Presenter(view=BrowserView.class)
public class BrowserPresenter extends BasePresenter<IBrowserView, ADempiereEventBus> {
	
}
