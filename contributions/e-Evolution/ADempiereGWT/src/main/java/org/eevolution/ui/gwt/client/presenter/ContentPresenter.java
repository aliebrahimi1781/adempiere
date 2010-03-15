//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.ContentView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT ContentPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ContentPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=ContentView.class)
public class ContentPresenter extends BasePresenter<ContentPresenter.IContentView, ApplicationEventBus> {

	public interface IContentView{
		
		public void initialize();
		
		public void loadWindow();
		
		public Widget getViewWidget();
	}
	
	public void onInitialize(){
		eventBus.setCenter(view.getViewWidget());
	}
	
	public void onLoadWindow(){
		// TODO Auto-generated method stub
		
	}
}
