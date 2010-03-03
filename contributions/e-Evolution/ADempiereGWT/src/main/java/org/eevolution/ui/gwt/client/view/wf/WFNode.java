//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view.wf;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * ADempiere GWT WFNode
 * @author <a href="alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: WFNode.java, v 1.0 Mar 3, 2010
 */

public class WFNode extends Composite {

  interface WFNodeUiBinder extends UiBinder<Widget, WFNode> {
  }

  private static WFNodeUiBinder uiBinder = GWT.create(WFNodeUiBinder.class);
  @UiField Label header;
  @UiField HorizontalPanel m_bounds;
  @UiField Image icon;
  private String Id="";
  
  
  public WFNode(String Id) { //TODO: build with MWFNode
	  
	this.Id=Id;
	initWidget(uiBinder.createAndBindUi(this));
    header.setText("WFNode");
    m_bounds.setHeight("50px");
    m_bounds.setWidth("100px");
  }

  public Widget getDrager() {
    return header;
  }
  
  public String getId(){
	  return Id;
  }
  
  public void setBounds(int width, int height) {
		m_bounds.setWidth(width + "px");
		m_bounds.setHeight(height + "px");
  }
  
  public void setToolTip(String toolTip)
  {
	  m_bounds.setTitle(toolTip);
  }
  
  public int getAD_WF_Node_ID() {
		return 0; //TODO: return Node ID
  }
  
  public void getNode() {
		//TODO: return node
  }

}
