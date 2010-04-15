package org.eevolution.ui.gwt.client;

import java.util.List;

import org.eevolution.ui.gwt.client.action.ActionFindAll;
import org.eevolution.ui.gwt.client.action.ActionFindByName;
import org.eevolution.ui.gwt.client.action.ActionMerge;
import org.eevolution.ui.gwt.client.action.ActionPersist;
import org.eevolution.ui.gwt.client.action.ActionRemove;
import org.eevolution.ui.gwt.client.action.ActionFind;
import org.eevolution.ui.gwt.domain.ADTree;
import org.eevolution.ui.gwt.server.dao.GenericDAOWithJPA;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

import com.google.code.gwt.remoteaction.client.RemoteAction;
import com.google.code.gwt.remoteaction.client.RemoteActionService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * This is a service layer interface (actually more of a simple facade). Note
 * that most of these methods are implemented by {@link GenericDAOWithJPA}.
 * The client side stub for the RPC service.
*/
@RemoteServiceRelativePath("ADTreeService")
//@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
public interface ADTreeService extends RemoteActionService{

	//TODO:this does not work
	//@PostFilter("filterObject.owners.email == principal.username or hasRole('ROLE_ADMIN')")
	@RemoteAction(ActionFindAll.class)
	public List<ADTree> findAll();
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Transactional
	@RemoteAction(ActionFindByName.class)
	public List<ADTree> findByName(String name);

//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Transactional
	@RemoteAction(ActionPersist.class)
	public void persist(ADTree entity);

//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Transactional
	@RemoteAction(ActionMerge.class)
	public void merge(ADTree entity);

//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Transactional
	@RemoteAction(ActionRemove.class)
	public void remove(ADTree entity);
	
	@RemoteAction(ActionFind.class)
	public ADTree find(Long id);
}
