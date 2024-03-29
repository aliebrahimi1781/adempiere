package org.eevolution.ui.gwt.server.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import net.sf.gilead.gwt.PersistentRemoteService;

/**
 * This class provides a generic default implementation for many functionalities
 * used in persistence mechanisms. It offers standard CRUD functions for JPA
 * applications plus count() and findInRange() functions as they are frequently
 * used in Web applications.
 * 
 * @param <T>
 *            the type to be persisted (i.e. CBParner.class)
 * @param <ID>
 *            the identifier type
 */
@SuppressWarnings("serial")
@Transactional
public abstract class GenericDAOWithJPA<T, ID extends Serializable> extends RemoteServiceServlet {

	private Class<T> persistentClass;

	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public GenericDAOWithJPA() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public T find(ID id) {
		return entityManager.find(persistentClass, id);
	}

	public void persist(T entity) {
		entityManager.persist(entity);
	}

	public void merge(T entity) {
		entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<T> findInRange(int firstResult, int maxResults) {
		return entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
	}

	public long count() {
		return (Long) entityManager.createQuery("Select count(t) from " + persistentClass.getSimpleName() + " t").getSingleResult();
	}
}
