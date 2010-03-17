package org.eevolution.service.impl;

import java.util.List;

import org.eevolution.dao.GenericDAOWithJPA;
import org.eevolution.domain.ADTree;
import  org.eevolution.service.ADTreeService;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * This is a service layer implementation for {@link AccountService}. Note that
 * most of these methods from the interface are implemented by
 * {@link GenericDAOWithJPA}.
 * 
 * This class also provides the functionality of the repository. More
 * 
 */
@Service("ADTreeService")
@Repository
public class ADTreeServiceImpl extends GenericDAOWithJPA<ADTree, Long> implements ADTreeService {
	
	// custom repository method
	public List<ADTree> findByName(String name) {
		return super.entityManager.createQuery("Select t from ADTree t where t.Name = :Name").setParameter("Name", name).getResultList();
	}

}
