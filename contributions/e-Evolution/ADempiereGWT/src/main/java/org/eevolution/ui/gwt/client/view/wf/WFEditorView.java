package org.eevolution.ui.gwt.client.view.wf;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.view.wf.WFEditorPresenter.IWFEditorView;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.ListBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Widget;

public class WFEditorView extends Dialog implements IWFEditorView {

	
	@UiField ListBox workflowList;
	@UiField AbsolutePanel panel;
	@UiField ConfirmPanel confirmPanel;
	
	 interface WFEditorViewUiBinder extends UiBinder<Widget, WFEditorView> {
	  }
	 private static WFEditorViewUiBinder uiBinder = GWT.create(WFEditorViewUiBinder.class);
	 
	 public WFEditorView()
	 {
		 setWidget(uiBinder.createAndBindUi(this));
	 }
	 public void initForm()
	 {
						
			String sql = ""; /* MRole.getDefault().addAccessSQL(
					"SELECT AD_Workflow_ID, Name FROM AD_Workflow ORDER BY 2",
					"AD_Workflow", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);	//	all
				KeyNamePair[] pp = DB.getKeyNamePairs(sql, true);*/
			
			
			workflowList = new ListBox(); 
			//TODO: Load listbox items			
			//for (KeyNamePair knp : pp) {
			//	workflowList.addItem(knp);
			//}
			workflowList.addChangeHandler(new ChangeHandler(){
				@Override
				public void onChange(ChangeEvent event) {
					String item = workflowList.getItemText(workflowList.getSelectedIndex());
					//TODO: load workflow selected in listbox
					//KeyNamePair knp = item != null ? item.toKeyNamePair() : null;
					//if (knp != null && knp.getKey() > 0) {
					//	load(knp.getKey());
					//} else {
					//	Image dummy = null;
					//	imageMap.setContent(dummy);
					//}
				}
				
			});
			
			
			confirmPanel.addClickHanler(new ClickHandler(){

				@Override
				public void onClick(ClickEvent event) {
					detach();
					//TODO: Check wath button is pressed
					//if (event.getTarget().getId().equals(ConfirmPanel.A_CANCEL))
					//	this.detach();
					//else if (event.getTarget().getId().equals(ConfirmPanel.A_OK))
					//	this.detach();
				}
				
			});
			
		}
	 	
	 	public void detach()
	 	{
	 		this.hide();
	 	}


		public void load(int workflowId) {
			//TODO: complete method
			//	Get Workflow
			//MWorkflow wf = new MWorkflow (Env.getCtx(), workflowId, null);
			WFNodeContainer nodeContainer = new WFNodeContainer(panel);
			nodeContainer.setWorkflow(); //wf);
			
			//	Add Nodes for Paint
			//MWFNode[] nodes = wf.getNodes(true, Env.getAD_Client_ID(Env.getCtx()));
			//for (int i = 0; i < nodes.length; i++)
			//{
				WFNode wfn = new WFNode ();//nodes[i]);
				nodeContainer.add (wfn);
				//	Add Lines
				//MWFNodeNext[] nexts = nodes[i].getTransitions(Env.getAD_Client_ID(Env.getCtx()));
				//for (int j = 0; j < nexts.length; j++)
					nodeContainer.add (new WFLine ()); //nexts[j]));
			//}
			
			nodeContainer.paint();			
		}
}
