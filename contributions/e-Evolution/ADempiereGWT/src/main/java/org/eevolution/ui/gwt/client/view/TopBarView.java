//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.presenter.TopBarPresenter.ITopBarView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT TopBarView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TopBarView.java, v 1.0 Feb 16, 2010
 */
public class TopBarView extends Composite implements ITopBarView {

	private static TopBarViewUiBinder uiBinder = GWT
			.create(TopBarViewUiBinder.class);

	interface TopBarViewUiBinder extends UiBinder<Widget, TopBarView> {
	}

	@UiField Anchor preferenceLink;
	@UiField Anchor SystemLink;
	@UiField Anchor logoutLink;
	
	public TopBarView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Widget getViewWidget() {
		return this;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
