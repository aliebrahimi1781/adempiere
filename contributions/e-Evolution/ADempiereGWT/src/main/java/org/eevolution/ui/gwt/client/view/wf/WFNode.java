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
  
  class Rectangle{
	  int x = 0;
	  int y = 0;
	  int height = 0;
	  int width = 0;
	  public Rectangle(int x, int y, int width, int height)
	  {
		  this.x = x;
		  this.y = y;
		  this.width = width;
		  this.height = height;
	  }
  }

  
  @UiField Label header;
  @UiField HorizontalPanel panel;
  @UiField Image icon;
  
  String Id = "";
  Rectangle m_bounds = new Rectangle(0,0,100,50);
  
  public WFNode() { //TODO: build with MWFNode
	  

	initWidget(uiBinder.createAndBindUi(this));
    header.setText("WFNode");
    panel.setHeight("50px");
    panel.setWidth("100px");
  }

  public Widget getDrager() {
    return header;
  }
  
  public void setBounds(int x, int y, int width, int height) {
	  	m_bounds = new Rectangle(x, y, width, height);
		panel.setWidth(width + "px");
		panel.setHeight(height + "px");
  }
  
public Rectangle getBounds() {
	return m_bounds;
}
  
  public void setToolTip(String toolTip)
  {
	  panel.setTitle(toolTip);
  }
  
  public int getAD_WF_Node_ID() {
		return 0; //TODO: return Node ID
  }
  
  public void setId(String Id)
  {
	  this.Id = Id;
  }
  
  public String getId()
  {
	  return Id;
  }
  
  public void getNode() {
		//TODO: return node
  }

}
