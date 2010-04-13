package org.eevolution.ui.gwt.client.view.interfaces;

/**
 * 
 * ADempiere GWT IFindView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Aberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: IFindView.java, v 1.0 Apr 13, 2010
 */
public interface IFindView{

	 public void cmd_save(boolean saveQuery);
	 public void refreshUserQueries();
	 public void cmd_ok_Simple();
	 public void cmd_ok_Advanced();
	 public void cmd_save();		 
}