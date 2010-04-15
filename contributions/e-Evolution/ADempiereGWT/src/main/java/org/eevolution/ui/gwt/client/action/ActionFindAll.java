package org.eevolution.ui.gwt.client.action;

import java.util.List;

import org.eevolution.ui.gwt.domain.ADTree;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionFindAll implements Action{	
	
	private List<ADTree> list;
	
	public ActionFindAll(){
		
	}
	
	public void setList(List<ADTree> list){
		this.list = list;
	}
	
	public List<ADTree> getList(){
		return list;
	}
	
}
