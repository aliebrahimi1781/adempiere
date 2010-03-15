//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;
import org.eevolution.ui.gwt.client.view.LoginView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT LoginPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: LoginPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=LoginView.class)
public class LoginPresenter extends BasePresenter<LoginPresenter.ILoginView, ApplicationEventBus> {

	public interface ILoginView {

		public void login();
		
		public void authenticate();
		
		public void logout();
		
		public Widget getViewWidget();

	}
	
	public void onLogin(){
		// TODO Auto-generated method stub
	}

	public void onAuthenticate(){
		// TODO Auto-generated method stub
	}
	
	public void onLogout(){
		// TODO Auto-generated method stub
	}
}
