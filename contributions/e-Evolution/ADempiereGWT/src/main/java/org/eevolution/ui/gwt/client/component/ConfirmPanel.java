//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.component;

import org.eevolution.ui.gwt.client.widget.Button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ConfirmPanel
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ConfirmPanel.java, v 1.0 Feb 2, 2010
 */
public class ConfirmPanel extends Composite {

	interface ConfirmPanelUiBinder extends UiBinder<Widget, ConfirmPanel> {}
	private static ConfirmPanelUiBinder uiBinder = GWT.create(ConfirmPanelUiBinder.class);

	@UiField Button cancelButton;
	@UiField Button okButton;
	
	@UiField Button helpButton;
	@UiField Button refreshButton;
	@UiField Button resetButton;
	@UiField Button customizeButton;
	@UiField Button historyButton;
	@UiField Button zoomButton;

	public ConfirmPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/**
	 * 
	 * @param withCancelButton
	 * @param withHelpButton
	 * @param withRefreshButton
	 * @param withResetButton
	 * @param withCustomizeButton
	 * @param withHistoryButton
	 * @param withZoomButton
	 */
	public @UiConstructor ConfirmPanel(boolean withCancelButton,
			boolean withHelpButton, 
			boolean withRefreshButton, 
			boolean withResetButton,
			boolean withCustomizeButton, 
			boolean withHistoryButton, 
			boolean withZoomButton){
		this();

		cancelButton.setVisible(withCancelButton);
		helpButton.setVisible(withHelpButton);
		refreshButton.setVisible(withRefreshButton);
		resetButton.setVisible(withResetButton);
		customizeButton.setVisible(withCustomizeButton);
		historyButton.setVisible(withHistoryButton);
		zoomButton.setVisible(withZoomButton);
	}
	

	public void addClickHanler(ClickHandler  handler){
		
		cancelButton.addClickHandler(handler);
		okButton.addClickHandler(handler);
		helpButton.addClickHandler(handler);
		refreshButton.addClickHandler(handler);
		resetButton.addClickHandler(handler);
		customizeButton.addClickHandler(handler);
		historyButton.addClickHandler(handler);
		zoomButton.addClickHandler(handler);
		
	}
}
