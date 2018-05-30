package com.neorays.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import com.neorays.domain.LoginBO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String NATIVE_SQL_LOGIN_QUERY="SELECT * FROM LOGIN_EMP WHERE NAME=:user";
	
	
	
	
	public int loginInsert(LoginBO bo) throws Exception {
		System.out.println("data _"+bo);
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		LoginBO details=null;
		Transaction tx=null;
		int idVal=0;
		
		//activate Hibernate framework (BootStrapping hibernate)
		cfg=new Configuration();
		
		//load and read xml file
		cfg=cfg.configure("/com/neorays/cnfgs/hibernate-cfg.xml");
		
		//build SessionFactory
	factory=cfg.buildSessionFactory();
		//open Session
		ses=factory.openSession();
			//prepare Domain class obj having data
		details=new LoginBO();
		
		try{
		//begin Transaction
			tx=ses.beginTransaction(); //internally uses  con.setAutoCommit(false)
			  //save object
			 idVal=(Integer)ses.save(bo);
			 System.out.println("Generated Id Value::"+idVal);
			//commit Transaction
			tx.commit();  //internally uses con.commit();
			System.out.println("Object saved (insert record)");
		}
		catch(Exception e){
			tx.rollback(); //internally uses con.rollback()
			System.out.println("obj not saved(record not inserted)");
		}
		
  		//close objs
		ses.close();
		factory.close();
		
		
		
        return 0;
	}// loginInsert

	
	public int authentaction(LoginBO bo) throws Exception {
		
	/*	final String username=bo.getName();
		final String pwd=bo.getPsw();
		int count=0;
		
		count=ht.execute(new HibernateCallback<Integer>() {

			public Integer doInHibernate(Session ses) throws HibernateException {
				SQLQuery query=null;
				Query query1=null;
				 LoginBO bo=null;
				List<LoginBO> list1=null;
				query=ses.createSQLQuery(NATIVE_SQL_LOGIN_QUERY);
				query.setString("user", username);
				//map with Entity class
				 query.addEntity(LoginBO.class);
				 //execute the query
				 list1=query.list();
		 
				 if(list1.isEmpty()==true){
				
				 return 0;
				 }//outer if
				 else{
					 bo=list1.get(0);
					 if(username.equals(bo.getName()) && pwd.equals(bo.getPsw()))
			    	 return 1;
					 else
						 return 0;
				 }//outer else
			   
			}//doInHibernate(-)
		});
		
		return count;*/
		return 0;
	}//authentataction method

}// class



