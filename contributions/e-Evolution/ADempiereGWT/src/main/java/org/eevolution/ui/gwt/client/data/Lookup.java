//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.data;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * ADempiere GWT Lookup
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: Lookup.java, v 1.0 Feb 5, 2010
 */
public class Lookup implements IsSerializable {

	/**
	 * Key attribute
	 * */
	private String key;
	
	/**
	 * Value attribute
	 * */
	private String value;
	
	/**
	 * 
	 */
	public Lookup() {
	}
	
	

	/**
	 * @param key
	 * @param value
	 */
	public Lookup(String key, String value) {
		this.key = key;
		this.value = value;
	}


	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	
	
}
