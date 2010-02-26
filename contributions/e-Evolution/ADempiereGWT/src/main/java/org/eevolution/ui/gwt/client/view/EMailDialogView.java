//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.component.ConfirmPanel;
import org.eevolution.ui.gwt.client.component.StatusBarPanel;
import org.eevolution.ui.gwt.client.presenter.EMailDialogPresenter.IEMailDialogView;
import org.eevolution.ui.gwt.client.widget.Dialog;
import org.eevolution.ui.gwt.client.widget.Label;
import org.eevolution.ui.gwt.client.widget.TextBox;
import org.eevolution.ui.gwt.client.widget.TextFieldArea;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT EMail Dialog View
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero, www.e-evolution.com</a>
 * @version $Id: EMailDialogView.java, v 1.0 Feb 25, 2010
 */

public class EMailDialogView extends Dialog implements IEMailDialogView {

	public static EMailDialogUiBinder uiBinder = GWT.create(EMailDialogUiBinder.class);
	interface EMailDialogUiBinder extends UiBinder <Widget,EMailDialogView>{
	}
	
	/**	Client				*/
	//private MClient	m_client = null;
	/** Sender				*/
	//private MUser	m_from = null;
	/** Primary Recipient	*/
	//private MUser	m_user = null;
	/** Cc Recipient	*/
	//private MUser	m_ccuser = null;
	//
	private String  m_to;
	private String  m_cc;
	private String  m_subject;
	private String  m_message;
	/**	File to be optionally attached	*/
	//private File	m_attachFile;
	
	
	@UiField TextBox fFrom;
	@UiField TextBox fTo;
	@UiField TextBox fCc;
	@UiField TextBox /*WSearchEditor*/ fUser;
	@UiField TextBox /*WSearchEditor*/ fCcUser;
	@UiField TextBox fSubject;
	@UiField Label lFrom;
	@UiField Label lTo;
	@UiField Label lCc;
	@UiField Label lSubject;
	@UiField Label lAttachment;
	@UiField TextBox fAttachment;
	@UiField TextFieldArea fMessage;
	@UiField ConfirmPanel confirmPanel;
	@UiField StatusBarPanel statusBar = new StatusBarPanel();
	
	public EMailDialogView(String title, /*MUser from,*/ String to, 
			String subject, String message/*, File attachment*/)
	{
		this.setText(title);
		setWidget(uiBinder.createAndBindUi(this));
		jbInit();
		set(/*from,*/ to, subject, message);
	}
	
	public Widget getWitget() {
		return this;
	}
	
	public void jbInit()
	{
		
		lFrom.setText("From:");
		lTo.setText("To:");
		lCc.setText("Cc:");
		lSubject.setText("Subject:");
		lAttachment.setText("Attachment:");
		
	}
	
	
	/**
	 *	Set all properties
	 */
	public void set (/*MUser from,*/ String to, String subject, String message)
	{
		//	Content
		//setFrom(from);
		setTo(to);
		setSubject(subject);
		setMessage(message);
		//
		statusBar.setStatusLine("localhost");//m_client.getSMTPHost());
	}	//	set

	/**
	 *  Set Address
	 */
	public void setTo(String newTo)
	{
		m_to = newTo;
		fTo.setText(m_to);
	}	//	setTo

	/**
	 *  Set CC Address
	 */
	public void setCc(String newCc)
	{
		m_cc = newCc;
		fCc.setText(m_cc);
	}	//	setCc

	/**
	 *  Get Address
	 */
	public String getTo()
	{
		m_to = fTo.getText();
		return m_to;
	}	//	getTo

	/**
	 *  Get CC Address
	 */
	public String getCc()
	{
		m_cc = fCc.getText();
		return m_cc;
	}	//	getCc

	/**
	 *  Set Sender
	 */
	public void setFrom()//MUser newFrom)
	{

	}	//	setFrom

	/**
	 *  Get Sender
	 */
	public void getFrom()
	{
	
	}	//	getFrom

	/**
	 *  Set Subject
	 */
	public void setSubject(String newSubject)
	{
		m_subject = newSubject;
		fSubject.setText(m_subject);
	}	//	setSubject

	/**
	 *  Get Subject
	 */
	public String getSubject()
	{
		m_subject = fSubject.getText();
		return m_subject;
	}	//	getSubject

	/**
	 *  Set Message
	 */
	public void setMessage(String newMessage)
	{
		m_message = newMessage;
		fMessage.setText(m_message);
//		fMessage.setCaretPosition(0);
	}   //  setMessage

	/**
	 *  Get Message
	 */
	public String getMessage()
	{
		m_message = fMessage.getText();
		return m_message;
	}   //  getMessage

	/**
	 *  Set Attachment
	 */
	public void setAttachment ()
	{

	}	//	setAttachment

	/**
	 *  Get Attachment
	 */
	public void getAttachment()
	{

	}	//	getAttachment
	
	public void cmd_Ok()
	{
		
	}
}
