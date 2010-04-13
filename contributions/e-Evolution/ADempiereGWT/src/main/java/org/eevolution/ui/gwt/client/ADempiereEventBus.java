//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client;

import org.eevolution.ui.gwt.client.presenter.ApplicationPresenter;
import org.eevolution.ui.gwt.client.presenter.ContentPresenter;
import org.eevolution.ui.gwt.client.presenter.LoginPresenter;
import org.eevolution.ui.gwt.client.presenter.TopBarPresenter;
import org.eevolution.ui.gwt.client.presenter.TreeMenuPresenter;
import org.eevolution.ui.gwt.client.view.ApplicationView;
import org.eevolution.ui.gwt.client.view.LoginView;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

/**
 * ADempiere GWT ApplicationEventBus
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ApplicationEventBus, v 1.0 Feb 16, 2010
 */
@Events(startView=ApplicationView.class)
public interface ADempiereEventBus extends EventBus {
	
	@Event(handlers=LoginPresenter.class)
	public void login();

//	@Start
	@Event(handlers=LoginPresenter.class)
	public void authenticate();
	
	@Event(handlers=LoginPresenter.class)
	public void logout();
	
	@Event(handlers=ApplicationPresenter.class)
	public void setNorth(Widget w);

	@Event(handlers=ApplicationPresenter.class)
	public void setCenter(Widget w);

	@Event(handlers=ApplicationPresenter.class)
	public void setWest(Widget w);

	@Start
	@Event(handlers={TopBarPresenter.class, TreeMenuPresenter.class, ContentPresenter.class})
	public void initialize();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void openWindow();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void closeWindow();
	
	@Event(handlers=TreeMenuPresenter.class)
	public void changeWindow();
	
	@Event(handlers=ContentPresenter.class)
	public void loadWindow();
}
