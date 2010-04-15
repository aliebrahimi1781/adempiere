package org.eevolution.ui.gwt.client.action;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionFind implements Action{	

	private Long id;
	
	private ActionFind()
	{
	}
	
	public ActionFind(Long id)
	{
		this.id = id;
	}
	
	public Long getId()
	{
		return id;
	}
	
}
