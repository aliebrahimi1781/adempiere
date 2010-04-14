package org.eevolution.ui.gwt.client;

import java.util.List;

import org.eevolution.ui.gwt.client.domain.ADTree;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.code.gwt.remoteaction.client.RemoteActionService;


/**
 * This is a service layer interface (actually more of a simple facade). Note
 * that most of these methods are implemented by {@link GenericDAOWithJPA}.
 * The client side stub for the RPC service.
*/
@RemoteServiceRelativePath("springGwtServices/ADTreeService")
//@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
public interface ADTreeService extends RemoteService{

	//TODO:this does not work
	//@PostFilter("filterObject.owners.email == principal.username or hasRole('ROLE_ADMIN')")
	List<ADTree> findAll();
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional
	List<ADTree> findByName(String name);

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional
	void persist(ADTree entity);

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional
	void merge(ADTree entity);

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional
	void remove(ADTree entity);

	ADTree find(Long id);
}
