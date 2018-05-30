package com.neorays.cnfgs;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.neorays.controller")
@EnableWebMvc
public class WebAppConfiguration {

		
    // for creating InternalResourceViewResolver class obj
	@Bean
	public InternalResourceViewResolver createInternalResourceViewresolver() {
		InternalResourceViewResolver irvr = null;
	
		// create object
		irvr = new InternalResourceViewResolver();
		//set suffix and prefix
		irvr.setSuffix(".jsp");
		irvr.setPrefix("/WEB-INF/pages/");
		return irvr;
	}// method
}// class