package org.eevolution.ui.gwt.server.impl;

import java.util.List;

import org.eevolution.ui.gwt.client.service.ADTreeService;
import org.eevolution.ui.gwt.domain.ADTree;
import org.eevolution.ui.gwt.server.dao.GenericDAOWithJPA;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is a service layer implementation for {@link AccountService}. Note that
 * most of these methods from the interface are implemented by
 * {@link GenericDAOWithJPA}.
 * 
 * This class also provides the functionality of the repository. More
 * 
 */
@Configurable(autowire=Autowire.BY_TYPE)
@SuppressWarnings("serial")
public class ADTreeServiceImpl extends GenericDAOWithJPA<ADTree, Long> implements ADTreeService {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ADTree> findByName(String name) {
		return entityManager.createQuery("Select t from ADTree t where t.Name = :Name").setParameter("Name", name).getResultList();
	}

}
