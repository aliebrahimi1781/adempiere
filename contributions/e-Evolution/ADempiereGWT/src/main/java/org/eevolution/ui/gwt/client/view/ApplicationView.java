//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view;


import org.eevolution.ui.gwt.client.view.interfaces.IApplicationView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ApplicationView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ApplicationView.java, v 1.0 Feb 16, 2010
 */
public class ApplicationView extends Composite implements IApplicationView {

	private static ApplicationViewUiBinder uiBinder = GWT
			.create(ApplicationViewUiBinder.class);

	interface ApplicationViewUiBinder extends UiBinder<Widget, ApplicationView> {
	}
	
	@UiField SimplePanel topPanel;
	@UiField LayoutPanel treeMenu;
	@UiField LayoutPanel contentPanel;

	public ApplicationView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setContent(Widget widget) {
		contentPanel.clear();
		contentPanel.add(widget);
	}

	@Override
	public void setTopBar(Widget widget) {
		topPanel.clear();
		topPanel.add(widget);
	}

	@Override
	public void setTreeMenu(Widget widget) {
		treeMenu.clear();
		treeMenu.add(widget);
	}

}
