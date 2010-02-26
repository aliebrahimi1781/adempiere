//TODO:Copyright message should go here


package org.eevolution.ui.gwt.client.presenter;

import org.eevolution.ui.gwt.client.ApplicationEventBus;

import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT Find Presenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
 * @version $Id: FindPresenter.java, v 1.0 Feb 24, 2010
 */

public class FindPresenter extends BasePresenter<FindPresenter.IFindView, ApplicationEventBus> {
	public interface IFindView{

		 public void cmd_save(boolean saveQuery);
		 public void refreshUserQueries();
		 public void cmd_ok_Simple();
		 public void cmd_ok_Advanced();
		 public void cmd_save();		 
	}

	 public void onCmd_save(boolean saveQuery){
		 
	 }
	 public void onRefreshUserQueries(){
		 
	 }
	 public void onCmd_ok_Simple(){
		 
	 }
	 public void onCmd_ok_Advanced(){
		 
	 }
	 public void onCmd_save(){
		 
	 }
	 
}