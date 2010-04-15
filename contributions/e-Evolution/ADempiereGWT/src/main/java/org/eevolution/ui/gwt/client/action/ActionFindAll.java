package org.eevolution.ui.gwt.client.action;

import java.util.List;

import org.eevolution.ui.gwt.client.domain.ADTree;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionFindAll implements Action{	
	
	private List<ADTree> list;
	
	public ActionFindAll()
	{}
	

	
	public List<ADTree> getList()
	{
		return list;
	}
	
}
