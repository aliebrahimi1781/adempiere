package org.eevolution.ui.gwt.client.view.wf;

import java.util.ArrayList;


import org.eevolution.ui.gwt.client.view.wf.WFNode.Rectangle;

import pl.balon.gwt.diagrams.client.connector.UIObjectConnector;

import com.allen_sauer.gwt.dragdrop.client.DragController;
import com.allen_sauer.gwt.dragdrop.client.PickupDragController;
import com.allen_sauer.gwt.dragdrop.client.drop.BoundaryDropController;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Widget;


/**
 * 
 * ADempiere GWT WFNodeContainer
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: WFNodeContainer.java, v 1.0 Mar 9, 2010
 */
public class WFNodeContainer {
	protected final DragController dragController;
	
	public  WFNodeContainer(AbsolutePanel panel){
		this.panel = panel;
		this.dragController = createDragController(this.panel);
		
	}
	
	private ArrayList<WFNode> m_nodes = new ArrayList<WFNode>();
	private ArrayList<WFLine> m_lines = new ArrayList<WFLine>();
	private AbsolutePanel panel = null;
	//private MWorkflow m_wf = null;
	
	public void setWorkflow ()//MWorkflow wf)
	{
		
		//m_wf = wf;
	}
	
	public void removeAll()
	{
		m_nodes.clear();
		m_lines.clear();
	}
	
	public void add (WFNode node)
	{
		m_nodes.add(node);
		dragController.makeDraggable(node, node.getDrager());
	}
	
	public void add(WFLine line)
	{
		m_lines.add(line);
	}

	protected void createLines()
	{
		for (int i = 0; i < m_lines.size(); i++)
		{
			WFLine line = (WFLine)m_lines.get(i);
			Widget from = findBounds (line.getAD_WF_Node_ID());
			Widget to = findBounds (line.getAD_WF_Next_ID());
			line.setFromTo(from, to);
		}
	}
	
	
	
	private Widget findBounds (int AD_WF_Node_ID)
	{
		for (int i = 0; i < m_nodes.size(); i++)
		{
			WFNode node = (WFNode)m_nodes.get(i);
			if (node.getAD_WF_Node_ID() == AD_WF_Node_ID)
				return node;
		}
		return null;
	}

	public ArrayList<WFNode> getNodes() {
		return m_nodes;
	}
	
	public void paint()
	{
		createLines();
//		Paint Lines
		for (int i = 0; i < m_lines.size(); i++)
		{
			WFLine line = (WFLine)m_lines.get(i);
			line.paint(panel);
		}
		
		for (int i = 0; i < m_nodes.size(); i++)
		{
			WFNode node = m_nodes.get(i);
			Rectangle rect = node.getBounds();
			panel.add(node,rect.x, rect.y); 			
		}	//	for all components
		
	}
	
	private void updateLayout(){
		int x = 5;
		int y = 5;
		for (int i=0; i< m_nodes.size();i++)
		{
			WFNode node = m_nodes.get(i);
			Rectangle rect = node.getBounds();
			node.setBounds(x, y, rect.width, rect.height);
			
		}
		//next pos
		if (x == 5)
			x = 230;
		else
		{
			x = 5;
			y += 100;
		}
	}
	
	private boolean needLayout ()
	{
		//	Go through all components
		for (int i = 0; i < m_nodes.size(); i++)
		{
			WFNode node = m_nodes.get(i);
			Rectangle rect = node.getBounds();
			if (rect.x == 0 && rect.y == 0)
			{
				return true;
			}
		}
		return false;
	}
	
	 protected DragController createDragController(final AbsolutePanel panel) {
         PickupDragController dragController = new PickupDragController(panel, true) {
                 public BoundaryDropController newBoundaryDropController(AbsolutePanel boundaryPanel, boolean allowDropping) {
                         return new BoundaryDropController(boundaryPanel, allowDropping) {
                                 public void onMove(Widget reference, Widget draggable, DragController dragController) {
                                         super.onMove(reference, draggable, dragController);

                                         UIObjectConnector c = UIObjectConnector.getWrapper(draggable);
                                         if (c != null) {
                                                 c.update();
                                         }                                         
                                 }   
                                 
                         };
                 }

                 public void makeDraggable(Widget widget) {
                         super.makeDraggable(widget);
                         DOM.setStyleAttribute(widget.getElement(), "position",
                                         "absolute");
                         DOM.setStyleAttribute(widget.getElement(), "zIndex", "100");
                 }
         };
         return dragController;
	 }
}
