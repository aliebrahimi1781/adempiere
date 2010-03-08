package org.eevolution.ui.gwt.client.view.wf;


import java.util.ArrayList;
import java.util.List;

import org.eevolution.ui.gwt.client.widget.Dialog;

import com.allen_sauer.gwt.dragdrop.client.DragController;
import com.allen_sauer.gwt.dragdrop.client.PickupDragController;
import com.allen_sauer.gwt.dragdrop.client.drop.BoundaryDropController;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Widget;
import pl.balon.gwt.diagrams.client.connection.Connection;
import pl.balon.gwt.diagrams.client.connection.StraightTwoEndedConnection;
import pl.balon.gwt.diagrams.client.connector.Connector;
import pl.balon.gwt.diagrams.client.connector.UIObjectConnector;


public class WFView extends Dialog {
	
	protected final DragController dragController;
	WFNode pnd = new WFNode("1");
	WFNode pnd2 = new WFNode("2");
	WFNode pnd3 = new WFNode("3");
	WFNode pnd4 = new WFNode("4");
	
	AbsolutePanel panel = new AbsolutePanel();
	List<String> StartWidget = new ArrayList<String>();
	List<String> EndWidget = new ArrayList<String>();
	
	public WFView()
	{
		
		System.out.println("Modifique aqui!!!");
		this.dragController = createDragController(panel);
		panel.setWidth("500px");
     	panel.setHeight("500px");
     	this.add(panel);
     	this.setText("Workflow (try)");
     	
        Connector c0 = UIObjectConnector.wrap(pnd);
        Connector c1 = UIObjectConnector.wrap(pnd2);
        Connector c2 = UIObjectConnector.wrap(pnd3);
        Connector c3 = UIObjectConnector.wrap(pnd4);

        Connection connection0 = new StraightTwoEndedConnection(c0, c1);
        StartWidget.add(pnd.getId());
        EndWidget.add(pnd2.getId());
        
        
        
        Connection connection1 = new StraightTwoEndedConnection(c1, c2);
        //Connection connection2 = new RectilinearConnection(c2, c3);
        Connection connection4 = new StraightTwoEndedConnection(c1, c3);

        connection0.appendTo(panel);
        connection1.appendTo(panel);
        //connection2.appendTo(panel);
        connection4.appendTo(panel);
        
        
        panel.add(pnd,0,0);
     	panel.add(pnd2,200,300);
     	panel.add(pnd3,300,200);
     	panel.add(pnd4,200,400);
        
        dragController.makeDraggable(pnd2,pnd2.getDrager());
        dragController.makeDraggable(pnd,pnd.getDrager());
        dragController.makeDraggable(pnd3,pnd3.getDrager());
        dragController.makeDraggable(pnd4,pnd4.getDrager());
        

        pnd.setToolTip("Con toolTip");
        
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
                                        // System.out.println("<<" + ((WFNode)draggable).getId() + ">>");
                                         
                                 }   
                                 
                                 public void onLeave(Widget draggable, DragController dragController) {
                                	 System.out.println("<<" + ((WFNode)draggable).getId() + ">>");
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
