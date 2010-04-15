package org.eevolution.ui.gwt.server.util;

import javax.persistence.EntityManagerFactory;

public class EntityManagerFactoryHelper {
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(
			EntityManagerFactory entityManagerFactory) {
		EntityManagerFactoryHelper.entityManagerFactory = entityManagerFactory;
	}
	
}
