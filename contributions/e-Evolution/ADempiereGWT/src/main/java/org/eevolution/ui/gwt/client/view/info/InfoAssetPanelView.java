package org.eevolution.ui.gwt.client.view.info;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.component.StatusBarPanel;
import org.eevolution.ui.gwt.client.widget.Label;
import org.eevolution.ui.gwt.client.widget.TextBox;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;



/**
 * 
 * ADempiere GWT InfoAssetPanelView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: InfoAssetPanelView.java, v 1.0 Mar 24, 2010
 */



//import org.eevolution.ui.gwt.client.view.info.ColumnInfo;

public class InfoAssetPanelView extends InfoPanelView {
	
	interface InfoAssetPanelViewUiBinder extends UiBinder<Widget, InfoAssetPanelView> {
	  }
	 private static InfoAssetPanelViewUiBinder uiBinder = GWT.create(InfoAssetPanelViewUiBinder.class);
	
	
	private static String s_assetFROM = "A_ASSET a"
		+ " LEFT OUTER JOIN M_Product p ON (a.M_Product_ID=p.M_Product_ID)"
		+ " LEFT OUTER JOIN C_BPartner bp ON (a.C_BPartner_ID=bp.C_BPartner_ID)"
		+ " LEFT OUTER JOIN AD_User u ON (a.AD_User_ID=u.AD_User_ID)";

	
	/*private static final ColumnInfo[] s_assetLayout = {
		new ColumnInfo(" ", "a.A_Asset_ID", IDColumn.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Value"), "a.Value", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Name"), "a.Name", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "M_Product_ID"), "p.Name", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "C_BPartner_ID"), "bp.Name",  String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "AD_User_ID"), "u.Name", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "AssetServiceDate"), "a.AssetServiceDate", Timestamp.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "GuaranteeDate"), "a.GuaranteeDate", Timestamp.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "VersionNo"), "a.VersionNo", String.class)
	};*/

	
	@UiField TextBox fieldValue;
	@UiField TextBox fieldName;
	
	@UiField TextBox /*WEditor*/ fBPartner_ID;
	@UiField TextBox /*WEditor*/ fProduct_ID;

	@UiField Label labelValue;
	@UiField Label labelName;
	@UiField Label lBPartner_ID;
	@UiField Label lProduct_ID;
	
	@UiField ConfirmPanel confirmPanel;
	@UiField StatusBarPanel statusBar;
	
	
	public InfoAssetPanelView(int WindowNo, int A_Asset_ID, String value,
			boolean multiSelection, String whereClause) {
		
		super (WindowNo, "a", "A_Asset_ID", multiSelection, whereClause);
		this.setWidget(uiBinder.createAndBindUi(this));
		setText("Asset Info");  //Msg.getMsg(Env.getCtx(), "InfoAsset"));

		statInit();
		initInfo(value, A_Asset_ID, whereClause);

		//int no = contentPanel.getRowCount();
		setStatusLine("0", false); //Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB("0"); //Integer.toString(no));
		
		//	AutoQuery
		if (value != null && value.length() > 0)
			executeQuery();
		
		p_loadedOK = true;
		
	}

	private void statInit()
	{
		fieldValue.setWidth("100%");
		fieldName.setWidth("100%");
		
		labelValue.setText("Key"); //Msg.getMsg(Env.getCtx(), "Value"));
		//fieldValue.addEventListener(Events.ON_CHANGE, this);
		
		labelName.setText("Name"); //Msg.getMsg(Env.getCtx(), "Name"));
		//fieldName.addEventListener(Events.ON_CANCEL, this);
		// From A_Asset.
		/*fBPartner_ID = new WSearchEditor(
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 8065, DisplayType.Search), 
				Msg.translate(Env.getCtx(), "C_BPartner_ID"), "", false, false, true);
		fBPartner_ID.addValueChangeListener(this);
		
		fProduct_ID = new WSearchEditor(
				MLookupFactory.get (Env.getCtx(), p_WindowNo, 0, 8047, DisplayType.Search), 
				Msg.translate(Env.getCtx(), "M_Product_ID"), "", false, false, true);
		fProduct_ID.addValueChangeListener(this);*/
		
		
	}
	
	private void initInfo (String value, int A_Asset_ID, String whereClause)
	{
		//	Create Grid
		StringBuffer where = new StringBuffer();
		where.append("a.IsActive='Y'");
		
		if (whereClause != null && whereClause.length() > 0)
			where.append(" AND ").append(whereClause);
		
		//prepareTable(s_assetLayout, s_assetFROM, where.toString(), "a.Value");

		if (value == null)
			value = "%";
		
		if (!value.endsWith("%"))
			value += "%";
	} 
	
	

	@Override
	protected String getSQLWhere() {
		StringBuffer sql = new StringBuffer();
		
		//	=> Value
		
		String value = fieldValue.getText().toUpperCase();
		
		if (!(value.equals("") || value.equals("%")))
			sql.append(" AND UPPER(a.Value) LIKE ?");
		
		//	=> Name
		
		String name = fieldName.getText().toUpperCase();
		
		if (!(name.equals("") || name.equals("%")))
			sql.append (" AND UPPER(a.Name) LIKE ?");
		
		//	C_BPartner_ID
		
		Integer C_BPartner_ID = null;
		
		if (fBPartner_ID.getText() != "")
			C_BPartner_ID = Integer.parseInt(fBPartner_ID.getText()); //TODO: get C_BPartner_ID
		
		if (C_BPartner_ID != null)
			sql.append (" AND a.C_BPartner_ID=").append(C_BPartner_ID); 

		//	M_Product_ID
		
		Integer M_Product_ID = null;
		
		if (fProduct_ID.getText() != "")
			M_Product_ID = Integer.parseInt(fProduct_ID.getText());
		
		if (M_Product_ID != null)
			sql.append (" AND a.M_Product_ID=").append(M_Product_ID); //TODO: get M_Product_ID

		return sql.toString();
	}



	protected void setParameters() {
		// TODO Auto-generated method stub
	}
	
	public void saveSelectionDetail()
	{
		// TODO Auto-generated method stub
	}

	protected void showHistory()
	{
		GWT.log( "InfoAsset.showHistory");
	}
	
	protected boolean hasHistory()
	{
		return false;
	}
	
	public void zoom()
	{
		// TODO Auto-generated method stub
	}
	
	protected boolean hasZoom()
	{
		return true;
	}
	
	protected void customize()
	{
		GWT.log( "InfoAsset.customize");
	}
	
	protected boolean hasCustomize()
	{
		return false;
	}

}
