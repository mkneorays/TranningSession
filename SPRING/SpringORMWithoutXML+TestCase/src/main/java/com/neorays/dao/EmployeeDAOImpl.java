/*package com.neorays.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neorays.domain.EmpInsertBO;
import com.neorays.domain.LoginBO;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String NATIVE_SQL_LOGIN_QUERY="SELECT * FROM LOGIN_EMP WHERE NAME=:user";
	private static final String HQL_GET_EMP_DETAILS="FROM EmpInsertBO";
	private static final String HQL_DELETE_EMP_DETAILS="DELETE FROM  EmpInsertBO WHERE eid=?";
	//private static final String HQL_UPDATE_EMPLOYEE = "UPDATE SpStudentHLO SET sadd=? WHERE sno=?";
	
	@Autowired
	SessionFactory factory;

	
	public int loginInsert(LoginBO bo) {
		//get session obj
		Session ses=factory.getCurrentSession();
		//save the object
		int count=(Integer) ses.save(bo);
		System.out.println(bo+"   "+count);
        return count;
	}// loginInsert

}// class







*/