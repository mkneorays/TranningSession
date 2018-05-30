package com.neorays.initilizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.neorays.cnfgs.RootAppConfiguration;
import com.neorays.cnfgs.WebAppConfiguration;


public class EmpInitilizer {/*extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// it will create and return parent container using ContextLoaderListener internally
		return new Class[] { RootAppConfiguration.class };
	}// method

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// it will create and return child container using DispatcherServlet internally
		return new Class[] { WebAppConfiguration.class };
	}// method

	@Override
	protected String[] getServletMappings() {
		// request mapping
		return new String[] { "*.htm" };
	}// method
*/
}//class
