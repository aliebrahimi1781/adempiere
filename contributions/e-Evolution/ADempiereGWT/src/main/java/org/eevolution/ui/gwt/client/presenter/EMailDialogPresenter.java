//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;

import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT EMail Dialog Presenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: EMailDialogView.java, v 1.0 Feb 25, 2010
 */

public class EMailDialogPresenter extends BasePresenter<EMailDialogPresenter.IEMailDialogView,ApplicationEventBus>{
	public interface IEMailDialogView{
		public void cmd_Ok();
		public Widget getWitget();
	}

	public void onCmd_Ok(){
		
	}
	
}
