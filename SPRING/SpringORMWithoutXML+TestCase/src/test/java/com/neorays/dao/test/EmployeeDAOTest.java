package com.neorays.dao.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import com.neorays.cnfgs.PersistanceConfiguration;
import com.neorays.dao.EmployeeDAO;
import com.neorays.domain.LoginBO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistanceConfiguration.class })
public class EmployeeDAOTest {

	@Resource
	EmployeeDAO dao;
	static LoginBO bo=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		bo=new LoginBO();
	}//setUp method

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
		bo=null;
	}//tearDown method

	@Test
	@Ignore
	public void testLoginInsert() {
		//sst data in bo obj
		bo.setName("mithilesh");bo.setPsw("kumar");bo.setEmail("mk@gmail.com");
		//call test method
		assertEquals(87, dao.loginInsert(bo));
		
		//fail("Not yet implemented");
	}//test method

}//class
