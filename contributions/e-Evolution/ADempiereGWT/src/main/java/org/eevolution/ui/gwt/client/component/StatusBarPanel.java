//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.component;

import org.eevolution.ui.gwt.client.widget.Label;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT Status Bar Panel
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: StatusBarPanel.java, v 1.0 Feb 25, 2010
 */

public class StatusBarPanel extends Composite {
	interface StatusBarPanelUiBinder extends UiBinder<Widget,StatusBarPanel>{}
	public static StatusBarPanelUiBinder uiBinder = GWT.create(StatusBarPanelUiBinder.class);
	
	@UiField Label statusDB;
	@UiField Label infoLine;
	@UiField Label statusLine;
	private String m_text;
	private String popupStyle;
	private boolean embedded;
	
	public StatusBarPanel(){
		this(false);
	}
	
	public StatusBarPanel(boolean embedded)
	{
		initWidget(uiBinder.createAndBindUi(this));
		this.embedded=embedded;
		
	}
	
	 public void setStatusDB (String text)
	 {
		 if (text == null || text.length() == 0)
	        {
	            statusDB.setText("");
	        }
	        else
	        {
	            StringBuffer sb = new StringBuffer (" ");
	            sb.append(text).append(" ");
	            statusDB.setText(sb.toString());
	        }
	        m_text = text;
	 }
	 
	 /**
	     * @param text
	     */
	    public void setStatusLine (String text)
	    {
	        setStatusLine(text, false);
	    }

	    /**
	     * @param text
	     * @param error
	     */
	    public void setStatusLine (String text, boolean error)
	    {
	    	setStatusLine(text, error, error);
	    }

	    /**
	     * @param text
	     * @param error
	     * @param showPopup ignore for embedded
	     */
	    public void setStatusLine (String text, boolean error, boolean showPopup)
	    {
	    	statusLine.setText(text);
	    	if (error)
	    		;//statusLine.setStyle("color: red");
	    	else
	    		;//statusLine.setStyle("color: black");
	    	statusLine.setTitle(text);

	    	//TODO: PopUp and Styles when error flag is true
	    }
	    
	    private void createPopup() {
	    	
	    }
	    
	    private void showPopup() {
	    	
	    }
	    
	    public final void addStatusComponent(){
	    	
	    }
	    
	    /**
		 *	Set Info Line
		 *  @param text text
		 */
		public void setInfo (String text)
		{
			if (!embedded)
			{
				infoLine.setText(text != null ? text : "");
				infoLine.setTitle(text);
				if (text == null || text.trim().length() == 0)
					infoLine.setVisible(false);
				else
					infoLine.setVisible(true);
			}
		}	//	setInfo
	

}
