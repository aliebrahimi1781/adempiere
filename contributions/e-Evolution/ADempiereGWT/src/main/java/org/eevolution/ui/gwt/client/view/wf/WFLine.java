package org.eevolution.ui.gwt.client.view.wf;



import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Widget;
import pl.balon.gwt.diagrams.client.connection.Connection;
import pl.balon.gwt.diagrams.client.connection.StraightTwoEndedConnection;
import pl.balon.gwt.diagrams.client.connector.Connector;
import pl.balon.gwt.diagrams.client.connector.UIObjectConnector;

/**
 * 
 * ADempiere GWT WFLine
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: WFLine.java, v 1.0 Mar 9, 2010
 */
public class WFLine {

	private Widget          m_from = null;
	private Widget          m_to = null;
	private Connector		co_from = null;
	private Connector		co_to = null;
	private Connection      m_line = null;
	private String 			m_description = null;
	private boolean			m_visited = false;
	
	public Widget getFrom()
	{
		return m_from;
	}

	public Widget getTo()
	{
		return m_to;
	}

	public void setFromTo (Widget from, Widget to)
	{
		m_from = from;
		m_to = to;
		co_from = UIObjectConnector.wrap(m_from);
        co_to = UIObjectConnector.wrap(m_to);
	}
	

	
	public int getAD_WF_Node_ID()
	{
		return 0; //m_next.getAD_WF_Node_ID();	//	Node ->
	}	//	getAD_WF_Node_ID

	public int getAD_WF_Next_ID()
	{
		return 0; // m_next.getAD_WF_Next_ID();	//	-> Next
	}	//	getAD_WF_Next_ID


	public void setVisited (boolean visited)
	{
		m_visited = visited;
	}
	
	public void paint(AbsolutePanel panel)
	{
		if (m_from == null || m_to == null)
			return;
		
		m_line = new StraightTwoEndedConnection(co_from, co_to);
		m_line.appendTo(panel);
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer("WFLine[");
		sb.append(getAD_WF_Node_ID()).append("->").append(getAD_WF_Next_ID());
		sb.append("]");
		return sb.toString();
	}
	
}
