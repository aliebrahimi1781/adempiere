//TODO:Copyright message should go here

package org.eevolution.ui.gwt.client.view;




import java.util.Vector;
import org.eevolution.ui.gwt.client.presenter.FindPresenter.IFindView;
import org.eevolution.ui.gwt.client.widget.Button;
import org.eevolution.ui.gwt.client.widget.ComboBox;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.Label;
import org.eevolution.ui.gwt.client.widget.TextBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT Find View
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero</a>
 * @version $Id: FindView.java, v 1.0 Feb 24, 2010
 */

public class FindView extends Dialog implements IFindView {
	
	
	private static FindViewUiBinder uiBinder = GWT
	.create(FindViewUiBinder.class);
	interface FindViewUiBinder extends UiBinder<Widget,FindView>{
	}
	
	@UiField Label lblDocumentNo;
	@UiField Label lblDescription;
	@UiField Label lblName;
	@UiField Label lblValue;
	@UiField TextBox fieldDocumentNo;
	@UiField TextBox fieldDescription;
	@UiField TextBox fieldName;
	@UiField TextBox fieldValue;
	@UiField Button btnNew;
	@UiField Button btnOk;
	@UiField Button btnCancel;
	@UiField Button btnNewAdv;
	@UiField Button btnSaveAdv;
	@UiField Button btnDeleteAdv;
	@UiField ComboBox fQueryName;
    @UiField TabLayoutPanel tabs;
	
	
    
    private int             m_targetWindowNo;
    /** Table ID                    */
    private int             m_AD_Table_ID;
    /** Table Name                  */
    private String          m_tableName;
    /** Where                       */
    private String          m_whereExtended;
    
    private boolean         m_isCancel = false;
    
    private int             m_total;
    
    private boolean         hasValue = false;
    private boolean         hasDocNo = false;
    private boolean         hasName = false;
    private boolean         hasDescription = false;
    
    /** For Grid Controller         */
    public static final int     TABNO = 99;
    /** Length of Fields on first tab   */
    public static final int     FIELDLENGTH = 20;
	/** Reference ID for Yes/No	*/
	public static final int		AD_REFERENCE_ID_YESNO = 319;
	
	private int m_AD_Tab_ID = 0;
	
	private boolean m_createNew = false;

	/** Index ColumnName = 0		*/
	public static final int		INDEX_COLUMNNAME = 0;
	/** Index Operator = 1			*/
	public static final int		INDEX_OPERATOR = 1;
	/** Index Value = 2				*/
	public static final int		INDEX_VALUE = 2;
	/** Index Value2 = 3			*/
	public static final int		INDEX_VALUE2 = 3;

	private static final String FIELD_SEPARATOR = "<^>";
	private static final String SEGMENT_SEPARATOR = "<~>";
    
    
    public FindView(int targetWindowNo, String title,
            int AD_Table_ID, String tableName, String whereExtended,
            /*GridField[] findFields,*/ int minRecords, int adTabId)
	{
    	m_targetWindowNo = targetWindowNo;
        m_AD_Table_ID = AD_Table_ID;
        m_tableName = tableName;
        m_whereExtended = whereExtended;
        //m_findFields = findFields;
        m_AD_Tab_ID = adTabId;
        
    	setWidget(uiBinder.createAndBindUi(this));
    	initPanel();
        initFind();
        initFindAdvanced();
        if (m_total < minRecords)
        {
        	this.hide();
            return;
        }
		
		this.setText("LookUp Record");
		
	}
    
    private void initSimple()
    {
    	lblValue.setText("Key:");
		lblName.setText("Name:");
		lblDescription.setText("Description:");
		lblDocumentNo.setText("Document No:");
		fieldDocumentNo.setName("fieldDocumentNo");
		fieldDescription.setName("fieldDescription");
		btnNew.setText("New");
		btnCancel.setText("Cancel");
		btnOk.setText("OK");
    }
    
    private void initAdvanced()
    {
    	btnNewAdv.setText("New");
    	btnDeleteAdv.setText("Delete");
    	btnSaveAdv.setText("Save");
    	
    }
    
    
	private void initPanel() {
		initSimple();
		initAdvanced();
	}
	
	private void initFind() {
		// TODO Auto-generated method stub
		
	}
	
	private void initFindAdvanced() {
		// TODO Auto-generated method stub
		
	}

	private void createFields() {
		
    }
	
	private void setValues(){
		
	}
	
	 public void addSelectionColumn(){
		 
	 }
	 
	 public void parseUserQuery(){
		 
	 }
	 
	 private void parseString(){
		 
	 }
	 
	 private String getColumnName(){
		 return null;
	 }
	 private void getEditorCompQueryFrom(){
		 
	 }
	 private void getEditorCompQueryTo(){
		 
	 }
	 
	 private void addRowEditor(){
		 
	 }
	 
	 private void addOperators(){
		 
	 }
	 
	 public void getEditorComponent(){
		 
	 }
	 
	 public void getTargetMField (String columnName){
		 
	 }
	 
	 private int getNoOfRecords (){
		return 0;
		 
	 }
	 
	 private boolean isProductCategoryField(int columnId) {
		 return false;
	 }
	 
	 private String getSubCategoryWhereClause(int productCategoryId) {
		 return null;
	 }
	 
	 private String getSubCategoriesString(int productCategoryId, Vector<SimpleTreeNode> categories, int loopIndicatorId){
		 return null;
	 }
	 
	 private Object parseValue (){
		 return null;
	 }
	 
	 public void getQuery(){
		 
	 }
	 
	 public int getTotalRecords()
	 {
	        return m_total;
	 } 
	 
	 public void valueChange(){
		 
	 }
	 
	 public void OnPostVisible() {
		 
	 }
	 
		/**
	 *
	 * @return true if dialog cancel by user, false otherwise
	 */
	public boolean isCancel() {
		return m_isCancel;
	}

	/**
	 * @return true if user press the new button
	 */
	public boolean isCreateNew() {
		return m_createNew;
		
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			OnPostVisible();
		}
	}
	 
	 //Events!
			 
	 public void selectItem(){
		 
	 }
	 
	 public void cmd_save(boolean saveQuery){
		 
	 }
	 
	 public void refreshUserQueries(){
		 
	 }
	 
	 public void cmd_ok_Simple(){
		 
	 }
	 
	 public void cmd_ok_Advanced(){
		 
	 }
	 
	 public void cmd_save(){
		 
	 }
	 

	    private class SimpleTreeNode {

	        private int nodeId;

	        private int parentId;

	        public SimpleTreeNode(int nodeId, int parentId) {
	            this.nodeId = nodeId;
	            this.parentId = parentId;
	        }

	        public int getNodeId() {
	            return nodeId;
	        }

	        public int getParentId() {
	            return parentId;
	        }
	    }   //  SimpleTreeNode

}
