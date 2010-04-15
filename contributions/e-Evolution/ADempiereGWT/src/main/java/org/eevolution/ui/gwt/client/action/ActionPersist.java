package org.eevolution.ui.gwt.client.action;

import org.eevolution.ui.gwt.domain.ADTree;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionPersist implements Action{	
	private ADTree entity;
	
	public ActionPersist()
	{
	}
	
	public ActionPersist(ADTree entity)
	{
		this.entity = entity;
	}
	
	public ADTree getEntity()
	{
		return entity;
	}
}
