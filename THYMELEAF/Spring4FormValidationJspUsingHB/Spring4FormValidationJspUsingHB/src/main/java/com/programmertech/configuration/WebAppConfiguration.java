package com.programmertech.configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppConfiguration implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		ctx.setServletContext(servletContext);
		Dynamic dynamic = servletContext.addServlet("dispatcher",
				new DispatcherServlet(ctx));
		//servletContext.setInitParameter("responseEncodedHtmlEscape","true");
		/**
		 *  Below lines register spring CharacterEncodingFilter 
		 *  for UTF-8 form submit or handle request and response in UTF-8 encoding format.
		 */
		FilterRegistration.Dynamic fr = servletContext.addFilter("encodingFilter",  new CharacterEncodingFilter());
			   fr.setInitParameter("encoding", "UTF-8");
			   fr.setInitParameter("forceEncoding", "true");
			   fr.addMappingForUrlPatterns(null, true, "/*");
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}
}
