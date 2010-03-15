//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client;

import org.eevolution.ui.gwt.client.view.ApplicationView;
import org.eevolution.ui.gwt.client.view.LoginView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.mvp4g.client.Mvp4gModule;

/**
 * ADempiere GWT ADempiereGWT
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ADempiereGWT.java, v 1.0 Feb 2, 2010
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ADempiereGWT implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		Mvp4gModule module = (Mvp4gModule) GWT.create(Mvp4gModule.class);
		module.createAndStartModule();
//		LoginView loginView = (LoginView)module.getStartView();
//		loginView.center();
//		loginView.show();
		
		ApplicationView appView = (ApplicationView)module.getStartView();
		RootLayoutPanel.get().add(appView);
		
	}

	
}
