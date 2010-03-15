//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

/**
 * ADempiere GWT NumberBox
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: NumberBox.java, v 1.0 Feb 23, 2010
 */
public class NumberBox extends BaseBoxEditor implements HasValue<String> {


	private boolean valueChangeHandlerInitialized;
	
	/**
	 * 
	 */
	public NumberBox() {
		super();
	}

	@Override
	public String getValue() {
		return box.getText();
	}

	public void setValue(String value) {
		setValue(value, false);
	}

	public void setValue(String value, boolean fireEvents) {
		String oldValue =box.getText();
		box.setText(value);
		if (fireEvents) {
			ValueChangeEvent.fireIfNotEqual(this, oldValue, value);
		}
	}

	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<String> handler) {
		// Initialization code
		if (!valueChangeHandlerInitialized) {
			valueChangeHandlerInitialized = true;
			box.addChangeHandler(new ChangeHandler() {
				public void onChange(ChangeEvent event) {
					ValueChangeEvent.fire(NumberBox.this, box.getText());
				}
			});
		}
		return addHandler(handler, ValueChangeEvent.getType());
	}

}
