/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2007 e-Evolution,SC. All Rights Reserved.               *
 * Developer(s): Juan Carlos Perez www.e-evolution.com                        *
 *****************************************************************************/
package org.eevolution.ui.gwt.client.widget;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;


/**
 * ADempiere GWT TextBox
 * @author <a href="mailto:jperezcasanova@gmail.com">Juan Carlos Perez</a>
 * @version $Id: TextBox.java, v 1.0 Feb 5, 2010
 */
public class TextBox extends com.google.gwt.user.client.ui.TextBox {

//	private Obscure	m_obscure = null;

	private boolean m_infocus;


    public TextBox()
    {
        super();
        addFocusListener();
    }

    public TextBox(String value)
    {
        setValue(value);
        addFocusListener();
    }

    public void setEnabled(boolean enabled)
    {
        this.setEnabled(!enabled);
    }
    
    public void setObscureType(String obscureType)
    {
    	if (obscureType != null && obscureType.length() > 0)
		{
//			m_obscure = new Obscure ("", obscureType);
		}
    	else
    	{
//    		m_obscure = null;
    	}
    	setValue(getValue());
    }

    /**
     * method to ease porting of swing form
     * @param listener
     */
	public void addFocusListener() {
		addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				// TODO Auto-generated method stub
//				m_infocus = true;
//				if (m_obscure != null)
//					setValue(getValue());
				
			}
		});
		
		addBlurHandler(new BlurHandler() {
			@Override
			public void onBlur(BlurEvent event) {
				// TODO Auto-generated method stub
//				m_infocus = false;
//				if (m_obscure != null)
//					setValue(getValue());
			}
		});
	}

	
	@Override
	public String getValue() /*throws WrongValueException*/ {
		String value = super.getValue();
//		if (m_obscure != null && value != null && value.length() > 0)
//		{
//			if (value.equals(m_obscure.getObscuredValue()))
//				value = m_obscure.getClearValue();
//		}
		return value;
	}

	@Override
	public void setValue(String value) /*throws WrongValueException*/ {
//		if (m_obscure != null && !m_infocus)
//		{
//			super.setValue(m_obscure.getObscuredValue(value));
//		}
//		else
//		{
//			super.setValue(value);
//		}
	}


}
