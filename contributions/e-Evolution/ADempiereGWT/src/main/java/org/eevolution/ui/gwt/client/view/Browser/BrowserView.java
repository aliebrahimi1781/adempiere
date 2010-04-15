package org.eevolution.ui.gwt.client.view.Browser;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eevolution.ui.gwt.client.component.StatusBarPanel;
import org.eevolution.ui.gwt.client.view.interfaces.IBrowserView;
import org.eevolution.ui.gwt.client.widget.Button;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.ToggleButton;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;


/**
 * 
 * ADempiere GWT BrowserView
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: BrowserView.java, v 1.0 Apr 9, 2010
 */
public class BrowserView extends Dialog implements IBrowserView {
	
	
	
	interface BrowserViewUiBinder extends UiBinder<Widget,BrowserView>{
	}
	private  static  BrowserViewUiBinder  uiBinder = GWT.create( BrowserViewUiBinder.class);
	
	
	
	
	public BrowserView(boolean modal, int WindowNo, String value,
			/*MBrowse browse,*/ String keyColumn,
			boolean multiSelection, String whereClause)
		{
		
		setWidget(uiBinder.createAndBindUi(this));
		
		//m_Browse = browse;
		//m_View = browse.getAD_View();
		p_WindowNo = WindowNo;
		p_keyColumn = keyColumn;
		p_multiSelection = multiSelection;
		if (whereClause == null || whereClause.indexOf('@') == -1)
			p_whereClause = whereClause;
		else
		{
			p_whereClause = ""; //Env.parseContext(Env.getCtx(), p_WindowNo, whereClause, false, false);
			if (p_whereClause.length() == 0)
				GWT.log("Cannot parse context= " + whereClause);
		}
		
		setText("Browser"); //m_Browse.getName());
				

		initComponents();
		statInit();
		p_loadedOK = initBrowser();
		
		
		//
		//int no = detail.getRowCount();
		setStatusLine("",false); //Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(""); //Integer.toString(no));
		}



	//private MBrowse 	m_Browse = null;
	//private MView		m_View	= null;
	private static final int	WINDOW_WIDTH = 1024;	//	width of the window
	//private Info_Column[] m_generalLayout;
	private ArrayList<String> 	m_queryColumns = new ArrayList<String>();
	private ArrayList<String>	m_queryColumnsSql = new ArrayList<String>();
	//private ProcessParameterPanel parameterPanel;				
	private ArrayList <String> m_parameters;	
	private ArrayList <Object> m_values;
	//private MProcess m_process = null;
	//ProcessInfo m_pi = null;
	protected boolean	        p_loadedOK = false;
	private int                 m_keyColumnIndex = -1;
	private boolean			    m_ok = false;
	private boolean			    m_cancel = false;
	private ArrayList<Integer>	m_results = new ArrayList<Integer>(3);
	protected StatusBarPanel statusBar = new StatusBarPanel();
	//private Worker              m_worker = null;
	//protected Info_Column[]   p_layout;
	private String              m_sqlMain;
	private String              m_sqlCount;
	private String              m_sqlOrder;
	protected int				p_WindowNo;
	protected String            p_FromClause;
	protected String            p_keyColumn;
	protected boolean			p_multiSelection;
	protected String			p_whereClause = "";
	protected static final int        INFO_WIDTH = 800;
	
	private void statInit()
	{	
		/*searchPanel.setLayout(new ALayout());
		int cols = 0;
		int col = 2;
		int row = 0;
		for(MBrowseField field : m_Browse.getCriteriaFields())
		{
			M_Element element = new M_Element(m_Browse.getCtx(),field.getAD_Element_ID(), null);
			String title  = Msg.translate(Env.getCtx(), element.getColumnName());	
			String name  = field.getAD_View_Column().getAD_Column().getColumnName();
			addComponent(field, row, cols, field.getName(),title);
			cols = cols + col;
			
			if(field.isRange())
			{	
				title  = Msg.getMsg(Env.getCtx(), "To");
				addComponent(field, row, cols, field.getName()+"_To", title);
				cols = cols + col;
			}
			
			
			if(cols >= 4)
			{
				cols = 0;
				row ++;
			}
		}*/
	}
	
	private void addComponent(/*MBrowseField field,*/int row,int col,String name, String title) 
	{
		/*Component  data = null;
		CLabel label	= new CLabel(title);
			   label.setName("L_"+name);
		
		if(DisplayType.YesNo== field.getAD_Reference_ID())
		{
			data= new VCheckBox();
			data.setName(name);
			label.setLabelFor(data);
			data.setBackground(AdempierePLAF.getInfoBackground());
		}
		else if (DisplayType.String== field.getAD_Reference_ID())
		{
			data= new VString(name, false, false, true, 30, 30, "", null);
			data.setName(name);
			label.setLabelFor(data);
			data.setBackground(AdempierePLAF.getInfoBackground());
		}
		else if ( DisplayType.Number == field.getAD_Reference_ID() 
				|| DisplayType.Quantity == field.getAD_Reference_ID()
				|| DisplayType.CostPrice == field.getAD_Reference_ID()
				|| DisplayType.Integer == field.getAD_Reference_ID()
				|| DisplayType.Amount == field.getAD_Reference_ID())
		{
			data= new VNumber(name, false, false, true, field.getAD_Reference_ID(), title);
			data.setName(name);
			label.setLabelFor(data);
			data.setBackground(AdempierePLAF.getInfoBackground());
		}
		else if (DisplayType.Date== field.getAD_Reference_ID() 
			  || DisplayType.DateTime== field.getAD_Reference_ID())
		{
			data= new VDate();
			data.setName(name);
			label.setLabelFor(data);
			data.setBackground(AdempierePLAF.getInfoBackground());
		}
		else if (	DisplayType.TableDir== field.getAD_Reference_ID() 
				|| 	DisplayType.Table == field.getAD_Reference_ID() 
				||	DisplayType.ID == field.getAD_Reference_ID()
				||	DisplayType.List == field.getAD_Reference_ID()
				||	DisplayType.Search == field.getAD_Reference_ID())
		{
			data = (Component) getLookup(field);
			label.setLabelFor(data);
		}
		
		searchPanel.add(label	, new ALayoutConstraint(row,col));
		searchPanel.add(data	, new ALayoutConstraint(row,col+1));*/
	}
	
	private void /*Component*/ getLookup(/*MBrowseField field*/) 
	{
		/*		try 
		{
			MViewColumn column = field.getAD_View_Column();	
			//String name = field.getName()//column.getAD_Column().getColumnName();
				
			Language language = Language.getLoginLanguage();
			MLookup dataL = MLookupFactory.get(m_Browse.getCtx(), p_WindowNo,column.getAD_Column_ID(),
					field.getAD_Reference_ID(), language, column.getAD_Column().getColumnName() , field.getAD_Reference_Value_ID(), false,"");
	
			VLookup data = new VLookup(column.getAD_Column().getColumnName(), field.isMandatory(), false, true, dataL);
			data.setBackground(AdempierePLAF.getInfoBackground());
			data.addVetoableChangeListener(this);	
			data.setName(field.getName());
			return data;
		} 
		catch (Exception e) {
			log.log(Level.SEVERE, "Browser.init", e);
		}
		return null;*/
	}
	
	private boolean initBrowser ()
	{
		if (!initBrowserTable())
			return false;


		StringBuffer where = new StringBuffer(""); //m_View.getParentEntityAliasName()+".IsActive='Y'");

		if (p_whereClause.length() > 0)
		{
			where.append(p_whereClause);
		}
			
		/*prepareTable(m_generalLayout,
				     m_View.getFromClause(),
				     where.toString(),
					"2");

		if(m_Browse.getAD_Process_ID() > 0)
		{
			m_process = MProcess.get(Env.getCtx(), m_Browse.getAD_Process_ID());
			m_pi = new ProcessInfo(m_process.getName(), m_Browse.getAD_Process_ID());
			m_pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
			m_pi.setAD_Client_ID(Env.getAD_Client_ID(Env.getCtx()));
			parameterPanel = new ProcessParameterPanel(p_WindowNo, m_pi);
			parameterPanel.setMode(ProcessParameterPanel.MODE_HORIZONTAL);
			parameterPanel.init();
			processPanel.add(parameterPanel,BorderLayout.CENTER);
		}*/
		return true;
	}
	
	private boolean initBrowserTable ()
	{
		/*Collection<MBrowseField> fields = m_Browse.getFields();
		ArrayList<Info_Column> list = new ArrayList<Info_Column>();
		for (MBrowseField field : fields)
		{
			MViewColumn vcol = field.getAD_View_Column();
			M_Element element = new M_Element(m_Browse.getCtx(),field.getAD_Element_ID(),null);
			String columnName= element.getColumnName();
			if(field.isQueryCriteria())
			{	
				m_queryColumns.add(columnName);
			}	
			m_queryColumnsSql.add(vcol.getColumnSQL());
			
			//String columnName =vcol.getColumnName();
			Language language = Language.getLanguage(Env.getAD_Language(m_Browse.getCtx()));
			int displayType = field.getAD_Reference_ID();
			boolean isKey = field.isKey();
			boolean isDisplayed = field.isDisplayed();
			// teo_sarca
			String columnSql = vcol.getColumnSQL() + " AS "+ vcol.getColumnName();
			if (columnSql == null || columnSql.length() == 0)
				columnSql = columnName;
			//  Default
			StringBuffer colSql = new StringBuffer(columnSql);
			Class colClass = null;
			if (isKey)
			{	
				colClass = IDColumn.class;
			}	
			else if (!isDisplayed)
				;
			else if (DisplayType.YesNo 		== displayType)
				colClass = Boolean.class;
			else if (DisplayType.Amount 	== displayType)
				colClass = BigDecimal.class;
			else if (DisplayType.Number 	== displayType || 
					 DisplayType.Quantity 	== displayType)
				colClass = Double.class;
			else if (DisplayType.Integer 	== displayType)					
				colClass = Integer.class;
			else if (DisplayType.TableDir 	== displayType || 
					 DisplayType.Search 	== displayType)
			{
				String alias = vcol.getAD_View_Definition().getTableAlias();
				colSql = new StringBuffer("(" + MLookupFactory.getLookup_TableDirEmbed(language, columnName , alias) + ") AS "+ vcol.getColumnName());
				colClass = String.class;
			}
			else if(DisplayType.Table 		== displayType)
			{
				String alias = vcol.getAD_View_Definition().getTableAlias();
				colSql = new StringBuffer("(" + MLookupFactory.getLookup_TableEmbed (language, columnName , alias ,field.getAD_Reference_Value_ID()) + ") AS "+ vcol.getColumnName());
				colClass = String.class;
			}	
			else if (DisplayType.String 	== displayType || 
					 DisplayType.Text 		== displayType || 
					 DisplayType.Memo 		== displayType)
				colClass = String.class;
			else if (DisplayType.isDate(displayType))
				colClass = Timestamp.class;
			else if (DisplayType.List		== displayType)
			{				
				colSql =new StringBuffer("(" + MLookupFactory.getLookup_ListEmbed(language, field.getAD_Reference_Value_ID(), vcol.getColumnSQL()) + ")");
				colClass = String.class;
			}
			if (colClass != null)
			{
				Info_Column infocol = new Info_Column(Msg.translate(Env.getCtx(), columnName), colSql.toString(), colClass);	
				list.add(infocol);
				log.finest("Added Column=" + columnName);
			}
			else
				log.finest("Not Added Column=" + columnName);
				
				
		String title = Msg.translate(Env.getCtx(), m_Browse.getName()); 
		setTitle(getTitle() + " " + title);
		
		if (list.size() == 0)
		{
			ADialog.error(p_WindowNo, this, "Error", "No Browse Fields");
			log.log(Level.SEVERE, "No Brwose for view=" + m_View.getName());
			return false;
		}
		log.finest("Browse Fields #" + list.size()); 

		//  Convert ArrayList to Array
		m_generalLayout = new Info_Column[list.size()];
		list.toArray(m_generalLayout);*/
		return true;
	}
	
	protected String getSQLWhere()
	{
		
		StringBuffer sql = new StringBuffer(" AND "); // + m_Browse.getWhereClause());
		if(getParameters().size() > 0)
		{
			sql.append(" AND ");
		}
		
		Iterator <String> parameters = getParameters().iterator();
		while(parameters.hasNext())
		{
			String parameter = parameters.next();
			//MBrowseField field = m_Browse.getField(parameter);
			//MViewColumn column = field.getAD_View_Column();
			//sql.append(column.getColumnSQL()).append("=? ");
			if(parameters.hasNext())
			{	
				sql.append(" AND ");
			}
		}
		return sql.toString();
	}
	
	private void setParameters()
	{			
		/** Parameters **/
		m_parameters = new ArrayList();
		m_values = new ArrayList();
		
			/*for (Component c : searchPanel.getComponents())
			{	
				String name = c.getName();
				if(name == null || name.startsWith("L_"))
					continue;
				MBrowseField field = m_Browse.getField(name);
				if(field == null)
					continue;
				
				if(field.getName().equals(name))
				{	
					if(c instanceof VLookup)
					{	
						VLookup component = (VLookup) c;
						addParameter(component.getName(), component.getValue());
						continue;
					}	
					if(c instanceof VString)
					{	
						VString component  = (VString) c;
						addParameter(component.getName(), component.getValue());
						continue;
					}	
					if(c instanceof VCheckBox)
					{
						VCheckBox component  = (VCheckBox) c;
						addParameter(component.getName(), component.getValue());
						continue;
					}
					if(c instanceof VDate)
					{
						VDate component  = (VDate) c;
						addParameter(component.getName(), component.getValue());
						continue;
					}
				}	
			}*/
		
	}
	
	private void addParameter(String name , Object value)
	{
		if(value != null && value.toString().length() > 0)
		{
			m_parameters.add(name);
			m_values.add(value);
		}		
	}
	
	private ArrayList <String> getParameters()
	{
		return m_parameters;
	}

	private ArrayList <Object> getParametersValues()
	{
		return m_values;
	}
	
	private void addSQLWhere(StringBuffer sql, int index, String value)
	{
		if (!(value.equals("") || value.equals("%")) && index < m_queryColumns.size())
		{
			//sql.append(" AND UPPER(").append(m_queryColumnsSql.get(index).toString()).append(") LIKE '");
			sql.append(" UPPER(").append(m_queryColumnsSql.get(index).toString()).append(") LIKE '");
			sql.append(value);
			if (value.endsWith("%"))
				sql.append("'");
			else
				sql.append("%'");
		}
	}
	
	public void setStatusLine (String text, boolean error)
	{
		statusBar.setStatusLine(text, error);
		//Thread.yield();
	}	//	setStatusLine
	
	/**
	 *	Set Status DB
	 *  @param text text
	 */
	public void setStatusDB (String text)
	{
		statusBar.setStatusDB(text);
	}
	
	protected void executeQuery()
	{
		setParameters();
		//  ignore when running
		/*if (m_worker != null && m_worker.isAlive())
			return;
		//
		if (!testCount())
			return;

		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		setStatusLine(Msg.getMsg(Env.getCtx(), "StartSearch"), false);
		m_worker = new Worker();
		m_worker.start();*/
	}
	
	private void cmd_zoom()
	{
		
	}
	
	protected void prepareTable (/*Info_Column[] layout,*/ String from, String staticWhere, String orderBy)
	{
		/*p_layout = layout;
		StringBuffer sql = new StringBuffer ("SELECT ");
		//  add columns & sql
		for (int i = 0; i < layout.length; i++)
		{
			if (i > 0)
				sql.append(", ");
			sql.append(layout[i].getColSQL());
			//  adding ID column
			if (layout[i].isIDcol())
				sql.append(",").append(layout[i].getIDcolSQL());
			//  add to model
			detail.addColumn(layout[i].getColHeader());
			if (layout[i].isColorColumn())
				detail.setColorColumn(i);
			if (layout[i].getColClass() == IDColumn.class)
				m_keyColumnIndex = i;
		}
		
		//  Table Selection (Invoked before setting column class so that row selection is enabled)
		detail.setRowSelectionAllowed(true);
		//detail.addMouseListener(this);
		detail.setMultiSelection(p_multiSelection);
		detail.setShowTotals(true);
		
		//  set editors (two steps)
		for (int i = 0; i < layout.length; i++)
			detail.setColumnClass(i, layout[i].getColClass(), layout[i].isReadOnly(), layout[i].getColHeader());

		sql.append( " FROM ").append(from);
		//
		sql.append(" WHERE ").append(staticWhere);
		m_sqlMain = sql.toString();
		m_sqlCount = "SELECT COUNT(*) FROM " + from + " WHERE " + staticWhere;
		//
		m_sqlOrder = "";
		if (orderBy != null && orderBy.length() > 0)
			m_sqlOrder = " ORDER BY " + orderBy;

		if (m_keyColumnIndex == -1)
			log.log(Level.SEVERE, "No KeyColumn - " + sql);*/
		

	}
	
	private boolean testCount()
	{
		/*long start = System.currentTimeMillis();
		String dynWhere = getSQLWhere();
		StringBuffer sql = new StringBuffer (m_sqlCount);
		if (dynWhere.length() > 0)
			sql.append(dynWhere);   //  includes first AND
		String countSql = Msg.parseTranslation(Env.getCtx(), sql.toString());	//	Variables
		countSql = MRole.getDefault().addAccessSQL(countSql, m_View.getParentEntityAliasName(), MRole.SQL_FULLYQUALIFIED, MRole.SQL_RO);
		log.finer(countSql);
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int no = -1;
		try
		{
			pstmt = DB.prepareStatement(countSql, null);
			if(getParametersValues().size() > 0)
				DB.setParameters(pstmt, getParametersValues());
			setParameters (pstmt, true);
			rs = pstmt.executeQuery();
			if (rs.next())
				no = rs.getInt(1);
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, countSql, e);
			no = -2;
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		log.fine("#" + no + " - " + (System.currentTimeMillis()-start) + "ms");
		MRole role = MRole.getDefault(); 		
		if (role.isQueryMax(no))
			return ADialog.ask(p_WindowNo, this, "InfoHighRecordCount", String.valueOf(no));*/
		return true;
	}
	
	protected void saveSelection ()
	{
		//	Already disposed
		//if (detail == null)
		//	return;


		if (!m_ok)      //  did not press OK
		{
			m_results.clear();
			//detail.removeAll();
			//detail = null;
			return;
		}

		//	Multi Selection
		if (p_multiSelection)
		{
			//m_results.addAll(getSelectedRowKeys());
		}
		else    //  singleSelection
		{
			//Integer data = getSelectedRowKey();
			//if (data != null)
			//	m_results.add(data);
		}

		//detail.removeAll();
		//detail= null;
	}
	
	public String getSelectedSQL()
	{
		//	No results
		/*Collection<Integer> keys = getSelectedKeys();
		if (keys == null || keys.size() == 0)
		{
			return "";
		}
		//
		StringBuffer sb = new StringBuffer(getKeyColumn());
		if (keys.size() > 1)
			sb.append(" IN (");
		else
			sb.append("=");

		//	Add elements
		for (Integer key : keys)
		{
			if (getKeyColumn().endsWith("_ID"))
				sb.append(key.toString()).append(",");
			else
				sb.append("'").append(key.toString()).append("',");
		}

		sb.replace(sb.length()-1, sb.length(), "");
		if (keys.size() > 1)
			sb.append(")");
		return sb.toString();*/
		return "";
	}
	
	
	protected String getKeyColumn()
	{
		return p_keyColumn;
	}   //  getKeyColumn
	
	protected Integer getSelectedRowKey()
	{
		ArrayList<Integer> selectedDataList = getSelectedRowKeys();
		if (selectedDataList.size() == 0)
		{
			return null;
		}
		else
		{
			return selectedDataList.get(0);
		}
	
	}
	
	 protected ArrayList<Integer> getSelectedRowKeys()
	    {
	        ArrayList<Integer> selectedDataList = new ArrayList<Integer>();
	        
	        if (m_keyColumnIndex == -1)
	        {
	            return selectedDataList;
	        }
	        
	        if (p_multiSelection)
	        {
	        	//int rows = detail.getRowCount();
	            //for (int row = 0; row < rows; row++)
	            //{
	             //   Object data = detail.getModel().getValueAt(row, m_keyColumnIndex);
	             //   if (data instanceof IDColumn)
	             //   {
	             //       IDColumn dataColumn = (IDColumn)data;
	             //       if (dataColumn.isSelected())
	             //       {
	             //           selectedDataList.add(dataColumn.getRecord_ID());
	             //       }
	             //   }
	             //}
	        }
	        
	        if (selectedDataList.size() == 0)
	        {
	        	//int row = detail.getSelectedRow();
	    		/*if (row != -1 && m_keyColumnIndex != -1)
	    		{
	    			Object data = detail.getModel().getValueAt(row, m_keyColumnIndex);
	    			if (data instanceof IDColumn)
	    				selectedDataList.add(((IDColumn)data).getRecord_ID());
	    			if (data instanceof Integer)
	    				selectedDataList.add((Integer)data);
	    		}*/
	        }
	      
	        return selectedDataList;
	    }   //  getSelectedRowKeys
	
	protected void saveSelectionDetail()          {}
	
	
	public Collection getSelectedKeys()
	{
		if (!m_ok || m_results.size() == 0)
			return null;	
		return m_results;
	}	//	getSelectedKeys;
	
	public Object getSelectedKey()
	{
		if (!m_ok || m_results.size() == 0)
			return null;
		return m_results.get(0);
	}	//	getSelectedKey
	
	public void dispose(boolean ok)
	{
		
		m_ok = ok;

		//  End Worker
		/*if (m_worker != null)
		{
			//  worker continues, but it does not block UI
			if (m_worker.isAlive())
				m_worker.interrupt();
			log.config("Worker alive=" + m_worker.isAlive());
		}
		m_worker = null;
		//
		saveSelection();
		removeAll();
		super.dispose();
		
		if(m_Browse.getAD_Process_ID() <= 0)
			return;
		
		MPInstance instance = new MPInstance(Env.getCtx(), m_Browse.getAD_Process_ID(), 0);
		instance.saveEx();
		
		DB.createT_Selection(instance.getAD_PInstance_ID(), getSelectedKeys(), null);
		//call process
		m_pi.setAD_PInstance_ID (instance.getAD_PInstance_ID());
		parameterPanel.saveParameters();
		//	Execute Process
		ProcessCtl worker = new ProcessCtl(this, Env.getWindowNo(this), m_pi, null);
		worker.start();     //  complete tasks in unlockUI / generateShipments_complete
		*/
	}
	
	public void setupToolBar()
	{
		
	}
	
	 private void initComponents() {

	        //toolsBar = new javax.swing.JToolBar();

	        //detail = new MiniTable();

	        
	        setupToolBar();

	        //toolsBar.setRollover(true);

	        bPrint.setText("Print");
	        
	        bPrint.addClickHandler(new ClickHandler(){
				public void onClick(ClickEvent event) {
					bPrintActionPerformed(event);
				}
	        });
	        

	        bZoom.setText("Zoom");
	        bZoom.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					bZoomActionPerformed(event);
				}
			});
	        

	        bExport.setText("Export");
	        bExport.addClickHandler(new ClickHandler(){
	        	public void onClick(ClickEvent event){
	        		bExportActionPerformed(event);
	        	}
	        });
	        

	        bDelete.setText("Delete");
	        bDelete.addClickHandler(new ClickHandler(){
	        	public void onClick(ClickEvent event)
	        	{
	        		bDeleteActionPerformed(event);
	        	}
	        });
	        
	        

	        bFind.setText("Find");
	        bFind.addClickHandler(new ClickHandler(){
	        	public void onClick(ClickEvent event)
	        	{
	        		bFindActionPerformed(event);
	        	}
	        });
	        
	        bSearch.setText("Search");
	       	bSearch.addClickHandler(new ClickHandler(){
				public void onClick(ClickEvent event) {
					bSearchActionPerformed(event);
				}
	        });
	       	
	       	bCancel.setText("Cancel");
	       	bCancel.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					bCancelActionPerformed(event);
				}
			});
	       	
	       	bOk.setText("Ok");
	       	bOk.addClickHandler(new ClickHandler(){
	       		public void onClick(ClickEvent event)
	       		{
	       			bOkActionPerformed(event);
	       		}
	       	});
	       
	       	
	       	
	       	
	       /* 

	       

	      
	        centerPanel.setViewportView(detail);


	        processPanel.setLayout(new java.awt.BorderLayout());
	        
	        footPanel.add(processPanel, java.awt.BorderLayout.CENTER);

	        searchTab.add(footPanel, java.awt.BorderLayout.SOUTH);

	        tabsPanel.addTab("Search", searchTab);

	        graphPanel.setLayout(new java.awt.BorderLayout());
	        tabsPanel.addTab("Graph", graphPanel);

	        getContentPane().add(tabsPanel, java.awt.BorderLayout.CENTER);
	        */
	    }
	
	 private void bZoomActionPerformed(ClickEvent event) {//GEN-FIRST:event_bZoomActionPerformed
	        // TODO add your handling code here:
	    	cmd_zoom();
	    }//GEN-LAST:event_bZoomActionPerformed

	    private void bOkActionPerformed(ClickEvent event) {                                    
	     dispose(true);
	    }   
	    
	    private void bCancelActionPerformed(ClickEvent event) {                                    
	        // TODO add your handling code here:
	    	//dispose();
	    }   
	    
	    private void bSearchActionPerformed(ClickEvent event) {//GEN-FIRST:event_bSearchActionPerformed
	        // TODO add your handling code here:
	       	executeQuery();
	    }//GEN-LAST:event_bSearchActionPerformed

	    private void bFindActionPerformed(ClickEvent event) {                                      
	        // TODO add your handling code here:
	    }                                                
	    
	    private void bExportActionPerformed(ClickEvent event) {                                        
	        // TODO add your handling code here:
	    }                                          
	    private void bDeleteActionPerformed(ClickEvent event) {                                        
	        // TODO add your handling code here:
	    }                                        

	    private void bPrintActionPerformed(ClickEvent event) {                                       
	        // TODO add your handling code here:
	    }
	 
	// Variables declaration - do not modify//GEN-BEGIN:variables
    @UiField HorizontalPanel toolsBar;
    @UiField ToggleButton bDelete;
    @UiField ToggleButton bExport;
    @UiField ToggleButton bFind;
    @UiField ToggleButton bPrint;
    @UiField ToggleButton bZoom;
    @UiField Button bCancel;
    @UiField Button bOk;
    @UiField TabLayoutPanel tabsPanel;
    @UiField Button bSearch;
    @UiField VerticalPanel searchPanel;
    @UiField VerticalPanel parameterPanel;
    @UiField VerticalPanel graphPanel;
    
    private VerticalPanel buttonSearchPanel;
    private ScrollPanel centerPanel;
    //private MiniTable detail;
    private VerticalPanel footButtonPanel;
    private VerticalPanel footPanel;
    
    private VerticalPanel processPanel;
    private VerticalPanel searchTab;
    
   
    private HorizontalPanel topPanel;
    // End of variables declaration//GEN-END:variables

	@Override
	public Widget getViewWidget() {
		return this;
	}
	
	public int getAD_Browse_ID()
	{
		 return 0; //m_Browse.getAD_Browse_ID();
	}
	
}
