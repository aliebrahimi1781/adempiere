package org.eevolution.ui.gwt.client;

import java.util.List;

import org.eevolution.ui.gwt.client.domain.ADTree;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ADTreeServiceAsync {

	void find(Long id, AsyncCallback<ADTree> callback);

	void findAll(AsyncCallback<List<ADTree>> callback);

	void findByName(String name, AsyncCallback<List<ADTree>> callback);

	void merge(ADTree entity, AsyncCallback<Void> callback);

	void persist(ADTree entity, AsyncCallback<Void> callback);

	void remove(ADTree entity, AsyncCallback<Void> callback);

}
