package com.neorays.cnfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages="com.neorays.controller")
@Configuration
public class ControllerConfiguration {

	@Bean
	public ViewResolver createIRVR(){
		return new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
	}//method
}//class
