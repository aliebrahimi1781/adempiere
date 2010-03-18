package org.eevolution.ui.gwt.client.view.wf;


import org.eevolution.ui.gwt.client.view.wf.WFNode.Rectangle;
import org.eevolution.ui.gwt.client.view.wf.WFNode.WFNodeUiBinder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;


public class WFPanel extends Composite {
	
	 interface WFPanelUiBinder extends UiBinder<Widget, WFPanel> {
	  }
	 private static WFPanelUiBinder uiBinder = GWT.create(WFPanelUiBinder.class);
	
	public WFPanel(){
		initWidget(uiBinder.createAndBindUi(this));
		
		try{
			jbInit();
		}
		catch(Exception e)
		{
			GWT.log(e.getMessage());
		}
		m_WindowNo = 0; //SessionManager.getAppDesktop().registerWindow(this);
	}
	 private int m_WindowNo = 0;
	 private WFNodeContainer nodeContainer = null; 
	 @UiField HorizontalPanel infoTextPane;
	 @UiField HorizontalPanel contentPanel;
	 @UiField Label message;
	 @UiField AbsolutePanel panel;
	 
	 private void jbInit() throws Exception 
	 {
		 nodeContainer = new WFNodeContainer(panel);
		 
	 }
	 
	 public void  load(int AD_Workflow_ID)
	 {
		 if(AD_Workflow_ID==0)
			 return;
		 //TODO: get WorkFlow model and fill nodeContainer
		 //m_wf = new MWorkflow (Env.getCtx(), AD_Workflow_ID, null);
		 
		 nodeContainer.removeAll();
		 nodeContainer.setWorkflow(); //m_wf;
		 
//			Add Nodes for Paint
			/*MWFNode[] nodes = m_wf.getNodes(true, AD_Client_ID);
			for (int i = 0; i < nodes.length; i++)
			{
				WFNode wfn = new WFNode (nodes[i]);
				nodeContainer.add (wfn);
				//	Add Lines
				MWFNodeNext[] nexts = nodes[i].getTransitions(AD_Client_ID);
				for (int j = 0; j < nexts.length; j++)
					nodeContainer.add (new WFLine (nexts[j]));
			}*/
		 

			
			nodeContainer.paint();
			try {
				contentPanel.add(panel);
			
				//image.addEventListener(Events.ON_CLICK, this);
				for(WFNode node : nodeContainer.getNodes()) {

					//Area area = new Area();
					Rectangle rect = node.getBounds();
					panel.setWidgetPosition(node, rect.x, rect.y);
					node.setId("WFN_"+node.getAD_WF_Node_ID());
					
					StringBuffer tooltip = new StringBuffer();
					String s = ""; //node.getNode().getDescription(true);
					if (s != null && s.trim().length() > 0)
						tooltip.append(s);
					String h = ""; //node.getNode().getHelp(true);
					if (h != null && h.trim().length() > 0) {
						if (tooltip.length() > 0)
							tooltip.append(". ");
						tooltip.append(h);
					}	
					node.setToolTip(tooltip.toString());
				}
			} catch (Exception e) {
				GWT.log(e.getLocalizedMessage());
			}
			
			//	Info Text
			StringBuffer msg = new StringBuffer("");
			//msg.append("<H2>").append(m_wf.getName(true)).append("</H2>");
			String s = ""; //m_wf.getDescription(true);
			if (s != null && s.length() > 0)
				msg.append("<B>").append(s).append("</B>");
			s = ""; //m_wf.getHelp(true);
			if (s != null && s.length() > 0)
				msg.append("<BR>").append(s);
			message.setText(msg.toString());
		 
	 }
	 
		public String toString()
		{
			StringBuffer sb = new StringBuffer("WorkflowPanel[");
			//if (m_wf != null)
			//	sb.append(m_wf.getAD_Workflow_ID());
			sb.append("]");
			return sb.toString();
		}	//	toString
		
		public void /*MWorkflow*/ getWorkflow() 
		{
			//return m_wf; //TODO: Return WorkFlow model
		}

		public void onEvent(WFNode node) throws Exception {
			String Id = node.getId();
				if (Id != null && Id.startsWith("WFN_")) {
					int id = Integer.valueOf(Id.substring(4));

						if (node.getAD_WF_Node_ID() == id) {
							start(node);
						}
				}
		}
		
		private void start(WFNode node) {
			//TODO: Find wath is this
			/*MWFNode wfn = node.getNode();
			if (wfn.getAD_Window_ID() > 0) {
				SessionManager.getAppDesktop().openWindow(wfn.getAD_Window_ID());
			} else if (wfn.getAD_Form_ID() > 0) {
				SessionManager.getAppDesktop().openForm(wfn.getAD_Form_ID());
			} else if (wfn.getAD_Process_ID() > 0) {
				SessionManager.getAppDesktop().openProcessDialog(wfn.getAD_Process_ID(), false);
			} else if (wfn.getAD_Task_ID() > 0) {
				SessionManager.getAppDesktop().openTask(wfn.getAD_Task_ID());
			} else if (wfn.getWorkflow_ID() > 0) {
				SessionManager.getAppDesktop().openWorkflow(wfn.getWorkflow_ID());
			} else {
	            throw new ApplicationException("Action not yet implemented: " + wfn.getAction());
	        }*/		
		}

}
