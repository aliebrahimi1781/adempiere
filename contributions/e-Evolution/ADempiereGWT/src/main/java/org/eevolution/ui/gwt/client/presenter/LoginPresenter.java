//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ADempiereEventBus;
import org.eevolution.ui.gwt.client.view.LoginView;
import org.eevolution.ui.gwt.client.view.interfaces.ILoginView;

import com.google.gwt.user.client.Window;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT LoginPresenter
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: LoginPresenter.java, v 1.0 Feb 16, 2010
 */
@Presenter(view=LoginView.class)
public class LoginPresenter extends BasePresenter<ILoginView, ADempiereEventBus> {


	
	public void onLogin(){
		// TODO Auto-generated method stub
		Window.alert("onLogin");
	}

	public void onAuthenticate(){
		Window.alert("onAuthenticate");
		// TODO Auto-generated method stub
	}
	
	public void onLogout(){
		Window.alert("onLogout");
		// TODO Auto-generated method stub
	}
}
