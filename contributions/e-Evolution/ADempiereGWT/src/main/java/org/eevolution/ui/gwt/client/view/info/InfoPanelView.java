package org.eevolution.ui.gwt.client.view.info;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.component.StatusBarPanel;
import org.eevolution.ui.gwt.client.widget.Dialog;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
//import org.eevolution.ui.gwt.client.view.info.ColumnInfo;

/**
 * 
 * ADempiere GWT InfoPanelView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Cabalero, www.e-evolution.com</a>
 * @version $Id: InfoPanelView.java, v 1.0 Mar 19, 2010
 */
public abstract class InfoPanelView extends Dialog implements ClickHandler {

	private final static int PAGE_SIZE = 100;
	
	public InfoPanelView create(int WindowNo,
            String tableName, String keyColumn, String value,
            boolean multiSelection, String whereClause)
	{
		
		InfoPanelView info = null;
        if (tableName.equals("C_BPartner"))
            ;//info = new InfoBPartnerPanel (value,WindowNo, !Env.getContext(Env.getCtx(),"IsSOTrx").equals("N"), multiSelection, whereClause);
        else if (tableName.equals("M_Product"))
            ;//info = new InfoProductPanel ( WindowNo,  0,0, multiSelection, value,whereClause);
        else if (tableName.equals("C_Invoice"))
            ;//info = new InfoInvoicePanel ( WindowNo, value, multiSelection, whereClause);
        else if (tableName.equals("A_Asset"))
            ;//info = new InfoAssetPanel (WindowNo, 0, value, multiSelection, whereClause);
        else if (tableName.equals("C_Order"))
            ;//info = new InfoOrderPanel ( WindowNo, value, multiSelection, whereClause);
        else if (tableName.equals("M_InOut"))
            ;//info = new InfoInOutPanel (WindowNo, value, multiSelection, whereClause);
        else if (tableName.equals("C_Payment"))
            ;//info = new InfoPaymentPanel (WindowNo, value, multiSelection, whereClause);
        else if (tableName.equals("C_CashLine"))
           ;//info = new InfoCashLinePanel (WindowNo, value, multiSelection, whereClause);
        else if (tableName.equals("S_ResourceAssigment"))
            ;//info = new InfoAssignmentPanel (WindowNo, value, multiSelection, whereClause);
        else
            ;//info = new InfoGeneralPanel (value, WindowNo, tableName, keyColumn, multiSelection, whereClause);
		return info;
	}
	

	public static void showBPartner (int WindowNo)
	{
		InfoPanelView infoBPanel = null;
		//InfoBPartnerPanel infoBPanel = new InfoBPartnerPanel ( "", WindowNo,  
		//	!Env.getContext(Env.getCtx(),"IsSOTrx").equals("N"),false, "");
		infoBPanel.show();
	}   //  showBPartner


	public static void showAsset (int WindowNo)
	{
		InfoPanelView info = null; // new InfoAssetPanel (WindowNo, 0, "", false, "");
		info.show();
	} 

	public static void showProduct (int WindowNo)
	{
		InfoPanelView info = null; //new InfoProductPanel(WindowNo, 
				//Env.getContextAsInt(Env.getCtx(), WindowNo, "M_Warehouse_ID"),
				//Env.getContextAsInt(Env.getCtx(), WindowNo, "M_PriceList_ID"),
				//false, "", "");
		info.show();
	} 
	

	public static void showOrder (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoOrderPanel(WindowNo, "", false, "");
		info.show();
	} 


	public static void showInvoice (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoInvoicePanel(WindowNo, "", false, "");
		info.show();
	} 


	public static void showInOut (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoInOutPanel (WindowNo, value,
			//false, "");
		info.show();
	}   //  showInOut


	public static void showPayment (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoPaymentPanel (WindowNo, value,
			//false, "");
		info.show();
	}   //  showPayment


	public static void showCashLine (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoCashLinePanel (WindowNo, value,
			//false, "");
		info.show();
	}   //  showCashLine


	public static void showAssignment (int WindowNo, String value)
	{
		InfoPanelView info = null; // new InfoAssignmentPanel (WindowNo, value,
			//false, "");
		info.show();
	}   //  showAssignment
	
	
	static final int        INFO_WIDTH = 800;
	
	public InfoPanelView(int WindowNo,
			String tableName, String keyColumn,boolean multipleSelection,
			 String whereClause)
	{
		
		p_WindowNo = WindowNo;
		p_tableName = tableName;
		p_keyColumn = keyColumn;
        p_multipleSelection = multipleSelection;
		
		if (whereClause == null || whereClause.indexOf('@') == -1)
			p_whereClause = whereClause;
		else
		{
			p_whereClause = ""; //Env.parseContext(Env.getCtx(), p_WindowNo, whereClause, false, false);
		}
		init();
	}
	
	public void init(){
		
		confirmPanel = new ConfirmPanel(); // true, true, false, true, true, true); <- va en el xml
        confirmPanel.addClickHanler(this);
        
        
       
		//confirmPanel.getButton(ConfirmPanel.A_CUSTOMIZE).setVisible(hasCustomize());
		//confirmPanel.getButton(ConfirmPanel.A_HISTORY).setVisible(hasHistory());
		//confirmPanel.getButton(ConfirmPanel.A_ZOOM).setVisible(hasZoom());
        
        //this.addEventListener(Events.ON_OK, this);


	}  //  init
	
	protected ConfirmPanel confirmPanel;
	protected int				p_WindowNo;
	protected String            p_tableName;
	protected String            p_keyColumn;
	protected boolean			p_multipleSelection;
	protected String			p_whereClause = "";
	protected StatusBarPanel statusBar = new StatusBarPanel();
    private List<Object> line;
	private boolean			    m_ok = false;
	private boolean			    m_cancel = false;
	private ArrayList<Integer>	m_results = new ArrayList<Integer>(3);
    
    //private ListModelTable model;

	//protected ColumnInfo[]     p_layout;

	private String              m_sqlMain;
	private String              m_sqlCount;
	private String              m_sqlOrder;
	private String              m_sqlUserOrder;

    //private ArrayList<ValueChangeListener> listeners = new ArrayList<ValueChangeListener>();

	protected boolean	        p_loadedOK = false;
	private int					m_SO_Window_ID = -1;
	private int					m_PO_Window_ID = -1;
	
	
	//protected WListbox contentPanel = new WListbox();
	//protected Paging paging;
	protected int pageNo;
	private int m_count;
	private int cacheStart;
	private int cacheEnd;
	private boolean m_useDatabasePaging = false;
	
	private static final String[] lISTENER_EVENTS = {};
	
	public boolean loadedOK()
	{
		return p_loadedOK;
	} 
	
	public void setStatusLine (String text, boolean error)
	{
		statusBar.setStatusLine(text, error);
	}
	
	public void setStatusDB (String text)
	{
		statusBar.setStatusDB(text);
	}
	
	public void prepareTable()
	{
		
	}
	
	protected void executeQuery()
	{
		
	}
	
	private void readData()//ResultSet rs) 
	{
		
	}
	
	protected void renderItems()
    {
		
    }
	
	private List<Object> readLine(int start, int end) {
		return line;
	}
	
    
	public void insertPagingComponent()
	{
		
	}
	
    public Vector<String> getColumnHeader()//ColumnInfo[] p_layout)
    {
    	return null;
    }
    
    public boolean testCount()
    {
    	return true;
    }
    
    protected void saveSelection()
    {
    	
    }
    
    public void getSelectedRow()
    {
    	
    }
    
    protected ArrayList<Integer> getSelectedRowKeys()
    {
        ArrayList<Integer> selectedDataList = new ArrayList<Integer>();
        return selectedDataList;
    }
	
    public Object[] getSelectedKeys()
	{
		if (!m_ok || m_results.size() == 0)
			return null;
		return m_results.toArray(new Integer[0]);
	}
    
	public Object getSelectedKey()
	{
		if (!m_ok || m_results.size() == 0)
			return null;
		return m_results.get(0);
	}
	
	public boolean isCancelled()
	{
		return m_cancel;
	}
	
	public String getSelectedSQL()
	{
		Object[] keys = getSelectedKeys();
		if (keys == null || keys.length == 0)
		{
			GWT.log("No Results - OK=" 
				+ m_ok + ", Cancel=" + m_cancel);
			return "";
		}

		StringBuffer sb = new StringBuffer(getKeyColumn());
		if (keys.length > 1)
			sb.append(" IN (");
		else
			sb.append("=");

		for (int i = 0; i < keys.length; i++)
		{
			if (getKeyColumn().endsWith("_ID"))
				sb.append(keys[i].toString()).append(",");
			else
				sb.append("'").append(keys[i].toString()).append("',");
		}

		sb.replace(sb.length()-1, sb.length(), "");
		if (keys.length > 1)
			sb.append(")");
		return sb.toString();
	}

		

	protected String getTableName()
	{
		return p_tableName;
	}  


	protected String getKeyColumn()
	{
		return p_keyColumn;
	} 
	
	public String[] getEvents()
    {
        return InfoPanelView.lISTENER_EVENTS;
    }
	
	protected void enableButtons ()
	{
		boolean enable = true; // (contentPanel.getSelectedCount() == 1);
		//confirmPanel.getOKButton().setEnabled(contentPanel.getSelectedCount() > 0);
		
		if (hasHistory())
			;//confirmPanel.getButton(ConfirmPanel.A_HISTORY).setEnabled(enable);
		if (hasZoom())
			;//confirmPanel.getButton(ConfirmPanel.A_ZOOM).setEnabled(enable);
	}   //  enableButtons

	protected abstract String getSQLWhere();
	
	protected abstract void setParameters (); //PreparedStatement pstmt, boolean forCount) throws SQLException;

	protected void showHistory()					{}
	
	protected boolean hasHistory()				{return false;}
	
	protected void customize()					{}
	
	protected boolean hasCustomize()				{return false;}
	
	protected boolean hasZoom()					{return false;}
	
	protected void saveSelectionDetail()          {}
	
	protected int getAD_Window_ID (String tableName, boolean isSOTrx)
	{
		if (!isSOTrx && m_PO_Window_ID > 0)
			return m_PO_Window_ID;
		if (m_SO_Window_ID > 0)
			return m_SO_Window_ID;
		//
		String sql = "SELECT AD_Window_ID, PO_Window_ID FROM AD_Table WHERE TableName=?";
		
			//TODO: query Windows ID 
		
		if (!isSOTrx && m_PO_Window_ID > 0)
			return m_PO_Window_ID;
		return m_SO_Window_ID;
	}	//	getAD_Window_ID
	
	
	public void onClick(ClickEvent event) {
		/*
	    if  (event!=null)
	    {
	        if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_OK)))
	        {
	            onOk();
	        }
	        else if (event.getTarget() == contentPanel && event.getName().equals(Events.ON_DOUBLE_CLICK))
	        {
	        	onOk();
	        }
	        else if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_REFRESH)))
	        {
	            executeQuery();
	            renderItems();
	        }
	        else if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_CANCEL)))
	        {
	        	m_cancel = true;
	            dispose(false);
	        }
	        // Elaine 2008/12/16
	        else if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_HISTORY)))
	        {
	        	if (!contentPanel.getChildren().isEmpty() && contentPanel.getSelectedRowKey()!=null)
	            {
	        		showHistory();
	            }
	        }
			else if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_CUSTOMIZE)))
			{
	        	if (!contentPanel.getChildren().isEmpty() && contentPanel.getSelectedRowKey()!=null)
	            {
	        		customize();
	            }
			}
	        //
	        else if (event.getTarget().equals(confirmPanel.getButton(ConfirmPanel.A_ZOOM)))
	        {
	            if (!contentPanel.getChildren().isEmpty() && contentPanel.getSelectedRowKey()!=null)
	            {
	                zoom();
	                this.detach();
	            }
	        }
	        else if (event.getTarget() == paging)
	        {
	        	int pgNo = paging.getActivePage();
	        	if (pageNo != pgNo) 
	        	{
	        	
	        		contentPanel.clearSelection();
				
	        		pageNo = pgNo;
	        		int start = pageNo * PAGE_SIZE;
	        		int end = start + PAGE_SIZE;
	        		List<Object> subList = readLine(start, end);
	    			model = new ListModelTable(subList);
	    			model.setSorter(this);
		            model.addTableModelListener(this);
		            contentPanel.setData(model, null);
		            
					contentPanel.setSelectedIndex(0);
				}
	        }
	        
	        else
	        {
	        	executeQuery();
	            renderItems();
	        }
	    }*/
	}  //  onEvent
	
	private void onOk() 
	{
	
	}
	
	public void tableChanged()//WTableModelEvent event)
	{
		enableButtons();
	}
	
	public void zoom()
	{
	
	}
	
	public void addValueChangeListener()//ValueChangeListener listener)
	{
	
	}
	    
	public void fireValueChange()//ValueChangeEvent event)
	{
	
	}
	/**
	 *  Dispose and save Selection
	 *  @param ok OK pressed
	 */
	public void dispose(boolean ok)
	{
		
	
	    m_ok = ok;
	    saveSelection();
	    this.hide();
	
	} 
	    
	public void sort()//Comparator cmpr, boolean ascending) 
	{
	
	}

}
