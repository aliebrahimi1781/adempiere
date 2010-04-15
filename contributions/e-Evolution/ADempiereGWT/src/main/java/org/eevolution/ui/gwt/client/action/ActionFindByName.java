package org.eevolution.ui.gwt.client.action;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionFindByName implements Action{	
	private String name;
	
	private ActionFindByName()
	{
	}
	
	public ActionFindByName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
}
