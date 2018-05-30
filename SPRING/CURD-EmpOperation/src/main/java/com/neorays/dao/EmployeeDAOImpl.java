package com.neorays.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neorays.domain.EmpInsertBO;
import com.neorays.domain.LoginBO;

@Repository("mithu")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String NATIVE_SQL_LOGIN_QUERY="SELECT * FROM LOGIN_EMP WHERE NAME=:user";
	private static final String HQL_GET_EMP_DETAILS="FROM EmpInsertBO";
	private static final String HQL_DELETE_EMP_DETAILS="DELETE FROM  EmpInsertBO WHERE eid=?";
	//private static final String HQL_UPDATE_EMPLOYEE = "UPDATE SpStudentHLO SET sadd=? WHERE sno=?";
	@Resource
	HibernateTemplate ht;
	@Resource
	SessionFactory factory;

	@Transactional(readOnly=false)
	public int loginInsert(LoginBO bo) throws Exception {
		
		//use hibernateTemplate
		int count=(Integer) ht.save(bo);
        return count;
	}// loginInsert

	
	public int authentaction(LoginBO bo) throws Exception {
		
		final String username=bo.getName();
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
		
		return count;
	}//authentataction method

	@Transactional(readOnly=false)
	public int insertEmp(EmpInsertBO bo) {
		//ht.setCheckWriteOperations(false);
		/* ANY ONE U HV TO USE EITHER @Transactional annotaion or this method
		 *  bcoz of above statement org.springframework.dao.InvalidDataAccessApiUsageException:
			Write operations are not allowed in read-only mode (FlushMode.MANUAL):
				Turn your Session into FlushMode.COMMIT/AUTO or remove 'readOnly' marker from transaction definition.
		*/
          //use HibernateTemplate
		int count=(Integer) ht.save(bo);
		
		return count;
	}//insertEmp method


	public List<EmpInsertBO> selectEmp() {
	
		List<EmpInsertBO> list=null;
		//use HibernateTemplate
		list=(List<EmpInsertBO>) ht.find(HQL_GET_EMP_DETAILS);
		
		return list;
	}//selectEmp method


	public int deleteEmp(int eid) {
	      //use hibernate template
		ht.setCheckWriteOperations(false);
		int count=ht.bulkUpdate(HQL_DELETE_EMP_DETAILS, eid);
		return count;
	}//deleteEmp method

	@Transactional  //this is requried otherwise org.hibernate.HibernateException:
	    //Could not obtain transaction-synchronized Session for current thread at 
	public List<LoginBO> loginCred() {
		Session ses=factory.getCurrentSession();
		System.out.println("method start");
		Criteria cr=null;
		List<LoginBO> list=null;
		//get criteria obj
		cr=ses.createCriteria(LoginBO.class);
		list=cr.list();
		System.out.println("method end"+list);
		return list;
	}//loginCred
	
	/*@Override
	public int update(int sno, String newAddrs) {
		int count = 0;
		ht.setCheckWriteOperations(false);
		count = ht.bulkUpdate(HQL_UPDATE_STUDENT, newAddrs, sno);
		return count;
	}*/
	

}// class









    /*dont see below*/


/*
public int deleteStudentsByAddrs(String addrs) {
	int count=0;
	count=ht.execute(new HibernateCallback<Integer>() {

		@Override
		public Integer doInHibernate(Session ses) throws HibernateException {
			Query query=null;
			int cnt=0;
			query=ses.getNamedQuery("DELETE_STUDENTS_BY_ADDRS");
			query.setString("addrs", addrs);
			cnt=query.executeUpdate();
			return cnt;
		}//doInHibernate(-)
	});
	return count;

	int count=0;
	count=ht.execute(ses->{
		Query query=null;
		int cnt=0;
		query=ses.getNamedQuery("DELETE_STUDENTS_BY_ADDRS");
		query.setString("addrs", addrs);
		cnt=query.executeUpdate();
		return cnt;
	 });
	 return count;
	}//method
*/
/*
 * this is for select operation
private static final String HQL_GET_STUDENTS_BY_ADDRS = "FROM SpStudentHLO WHERE sadd=:city";
@Override
public List<SpStudentHLO> findStudentsByAddrs(String addrs) {
	List<SpStudentHLO> listHLO = null;
	listHLO = (List<SpStudentHLO>) ht.findByNamedParam(HQL_GET_STUDENTS_BY_ADDRS, new String[] { "city" },
			new String[] { addrs });

	return listHLO;
}*/

/*public List getAllDetails() throws Exception {
	int count=0;
	
	count=ht.execute(new HibernateCallback<Integer>() {

		public Integer doInHibernate(Session ses) throws HibernateException {
			SQLQuery query=null;
			Query query1=null;
		
			List<LoginBO> list1=null;
			int cnt=0;
			query=ses.createSQLQuery("SELECT * FROM LOGIN_EMP");
			
			//map with Entity class
			 query.addEntity(LoginBO.class);
			 //execute the query
			 list1=query.list();
			 for(LoginBO bo:list1){
				 System.out.println(bo.getId()+"  "+bo.getName()+"  "+bo.getPsw()+" "+bo.getEmail());
				 
			 }
		   
			return cnt;
		}//doInHibernate(-)
	});
	System.out.println(count);
	return count;
}//authentataction method


*/

/* 
for this type of query=select count(*) from emp;
 query.addScalar("count(*)",StandardBasicTypes.INTEGER);
list2=query.list();
 cnt=list2.get(0);*/


/*
 * Session ses=null; ses=HibernateUtil.getSession(); Transaction tx=null;
 * boolean flag=false; int idVal=0; try{ tx=ses.beginTransaction(); //save objs
 * idVal=(Integer) ses.save(bo); flag=true; }//try catch(HibernateException he){
 * flag=false; throw he; } catch(Exception e){ flag=false; throw e; } finally{
 * if(flag){ tx.commit();
 * 
 * } else{ tx.rollback(); } //close Session HibernateUtil.closeSession();
 * }//finally return idVal;
 */