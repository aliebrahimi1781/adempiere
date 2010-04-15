package org.eevolution.ui.gwt.client.action;

import java.util.List;



import com.google.code.gwt.remoteaction.client.Action;

public class ActionFindAll implements Action{	
	
	private List<?> list;
	
	public ActionFindAll(){
		
	}
	
	public void setList(List<?> list){
		this.list = list;
	}
	
	public List<?> getList(){
		return list;
	}
	
}
