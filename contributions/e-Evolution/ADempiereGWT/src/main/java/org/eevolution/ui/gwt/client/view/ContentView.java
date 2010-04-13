//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.view.interfaces.IContentView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT ContentView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: ContentView.java, v 1.0 Feb 16, 2010
 */
public class ContentView extends Composite implements IContentView {

	private static ContentViewUiBinder uiBinder = GWT
			.create(ContentViewUiBinder.class);

	interface ContentViewUiBinder extends UiBinder<Widget, ContentView> {
	}

	public ContentView() {
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

	@Override
	public void loadWindow() {
		// TODO Auto-generated method stub
		
	}

}
