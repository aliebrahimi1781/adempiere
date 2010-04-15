package org.eevolution.ui.gwt.client.action;

import org.eevolution.ui.gwt.domain.ADTree;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionRemove implements Action{	
	private ADTree entity;
	
	private ActionRemove()
	{
	}
	
	public ActionRemove(ADTree entity)
	{
		this.entity = entity;
	}
	
	public ADTree getEntity()
	{
		return entity;
	}
	
}
