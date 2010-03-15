//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

/**
 * ADempiere GWT BaseBoxEditor
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: BaseBoxEditor.java, v 1.0 Feb 23, 2010
 */
public class BaseBoxEditor extends Composite {

	protected TextBox box = new TextBox();
	protected Button btn = new Button();
	/**
	 * 
	 */
	public BaseBoxEditor() {
		super();
		btn.setWidth("15px");
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(1);
		hp.add(box);
		hp.add(btn);
		initWidget(hp);
	}
	
}
