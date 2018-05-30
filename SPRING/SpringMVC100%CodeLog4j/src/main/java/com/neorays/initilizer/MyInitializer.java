package com.neorays.initilizer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.neorays.cnfgs.RootAppConfiguration;
import com.neorays.cnfgs.WebAppConfiguration;


public class MyInitializer  implements WebApplicationInitializer {

	public void onStartup(ServletContext sc) throws ServletException {
AnnotationConfigWebApplicationContext parentctx=null,childctx=null;
	
		ContextLoaderListener cll=null;
		DispatcherServlet ds=null;
		ServletRegistration.Dynamic regd=null;
		//create root application context container
		parentctx=new AnnotationConfigWebApplicationContext();
		parentctx.register(RootAppConfiguration.class);
		
		//create web application context container
		childctx=new AnnotationConfigWebApplicationContext();
		childctx.register(WebAppConfiguration.class);
		
		//create parent ioc container with support ContextLoaderListener
		cll=new ContextLoaderListener(parentctx);
		//map in servletContext obj
		sc.addListener(cll);
		//create child ioc container with the support of DispatcherServlet
		ds=new DispatcherServlet(childctx);
		//register DispatcherServlet class obj
		regd=sc.addServlet("dispatcher", ds);
		regd.addMapping("*.htm");
		regd.setLoadOnStartup(2);
	}

/*	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext parentctx=null,childctx=null;
		
		ContextLoaderListener cll=null;
		DispatcherServlet ds=null;
		ServletRegistration.Dynamic regd=null;
		//create root application context container
		parentctx=new AnnotationConfigWebApplicationContext();
		parentctx.register(RootAppConfiguration.class);
		
		//create web application context container
		childctx=new AnnotationConfigWebApplicationContext();
		childctx.register(WebMvcAppConfiguration.class);
		
		//create parent ioc container with support ContextLoaderListener
		cll=new ContextLoaderListener(parentctx);
		//map in servletContext obj
		sc.addListener(cll);
		//create child ioc container with the support of DispatcherServlet
		ds=new DispatcherServlet(childctx);
		//register DispatcherServlet class obj
		regd=sc.addServlet("dispatcher", ds);
		regd.addMapping("*.htm");
		regd.setLoadOnStartup(2);
	}//onStartup method
*/
}//class