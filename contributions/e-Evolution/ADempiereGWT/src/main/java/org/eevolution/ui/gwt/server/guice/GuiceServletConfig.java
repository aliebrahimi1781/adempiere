package org.eevolution.ui.gwt.server.guice;

import org.eevolution.ui.gwt.client.service.ADTreeService;
import org.eevolution.ui.gwt.server.impl.ADTreeServiceImpl;
import org.eevolution.ui.gwt.server.util.EntityManagerFactoryHelper;

import net.sf.gilead.core.IPersistenceUtil;
import net.sf.gilead.core.hibernate.jpa.HibernateJpaUtil;
import com.google.code.gwt.remoteaction.server.AbstractActionModule;
import com.google.code.gwt.remoteaction.server.ActionExecutionServiceWithGileadSupportImpl;
import com.google.code.gwt.remoteaction.server.RemoteActionWithGileadModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class GuiceServletConfig extends GuiceServletContextListener{

	
	
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {

			@Override
			protected void configureServlets() {
				serveRegex("(.)*/ActionExecutionService").with(
						ActionExecutionServiceWithGileadSupportImpl.class);

			}

		}, new RemoteActionWithGileadModule() {

			protected IPersistenceUtil provideActionExecutionIPersistenceUtil() {
				
					return new HibernateJpaUtil(EntityManagerFactoryHelper.getEntityManagerFactory());

			}

		}, new AbstractActionModule() {

			@Override
			protected void configure() {
				bindActionService(ADTreeService.class).to(
						ADTreeServiceImpl.class);
				

			}
		});
	}

	
	
}
