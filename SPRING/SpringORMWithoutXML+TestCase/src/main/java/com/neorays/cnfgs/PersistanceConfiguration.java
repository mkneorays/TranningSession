package com.neorays.cnfgs;



import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.neorays.domain.LoginBO;

@ComponentScan(basePackages="com.neorays.dao")
@PropertySource(value = { "classpath:database.properties" })
@Configuration
@EnableTransactionManagement
public class PersistanceConfiguration {

	@Autowired
	private Environment env;
	@Bean
	public DataSource createDataSource(){
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setPassword(env.getProperty("jdbc.password"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setInitialSize(5);
		return ds;
		
	}//createDS()
	@Bean
	public LocalSessionFactoryBean createLSFB(){
		//create LSFB class obj work as configuration file
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		Properties props=new Properties();
		//set dataSource
		lsfb.setDataSource(createDataSource());
		//set annotated class work as mapping fil
		lsfb.setAnnotatedClasses(LoginBO.class);
		//set properties key and value
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		props.put("hibernate.hbm2ddl.auto", "update");  //its working.
		//set hibernate properties
	   lsfb.setHibernateProperties(props);
		return  lsfb;
	}//createLSFB()
	
	
	@Bean
	public HibernateTransactionManager createHTM(){
		HibernateTransactionManager htm=new HibernateTransactionManager(createLSFB().getObject());

		return htm;
	}//creteHTM() method

}//class
