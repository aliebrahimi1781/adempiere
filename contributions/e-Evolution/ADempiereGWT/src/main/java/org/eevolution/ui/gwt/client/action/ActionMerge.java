package org.eevolution.ui.gwt.client.action;

import org.eevolution.ui.gwt.client.domain.ADTree;

import com.google.code.gwt.remoteaction.client.Action;

public class ActionMerge implements Action{	
	private ADTree entity;
	
	private ActionMerge()
	{
	}
	
	public ActionMerge(ADTree entity)
	{
		this.entity = entity;
	}
	
	public ADTree getEntity()
	{
		return entity;
	}
	
}
