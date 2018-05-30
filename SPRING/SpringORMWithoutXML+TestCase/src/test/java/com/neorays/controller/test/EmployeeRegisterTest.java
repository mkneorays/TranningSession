package com.neorays.controller.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebResponse;
import com.neorays.cnfgs.ControllerConfiguration;
import com.neorays.cnfgs.PersistanceConfiguration;
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { ControllerConfiguration.class })
public class EmployeeRegisterTest {

	 private static WebConversation conversation;
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		conversation=new WebConversation();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
		conversation=null;
	}

	

	/*@Test
	public void testRegister() {
		WebResponse  response=null,response1=null;
		WebForm form=null;
		String actualOutput=null;
		try{
			//get Access to index.html page as response 
			//http://localhost:8095/SpringORM100/register.htm?name=reter&psw=ert&email=ertre@weter
			System.out.println("11111");
			response=conversation.getResponse("http://localhost:8095/SpringORM100/index.jsp");
			System.out.println("2");

			//get access to form page of index.html response page
			form=response.getForms()[0];
			//set request param values to form
			form.setParameter("name","raja");
			form.setParameter("pwd","rani");
			form.setParameter("email","raja@rani");
			System.out.println("3");
			//submit the form
			response1=form.submit();
			//get actual Output
			actualOutput=response1.getText().trim();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		assertEquals("test1", "<h1>Valid Credentials</h1>", actualOutput);*/
	@Test
	@Ignore
	public void testLoginAppWithValidCredentials() {
		WebResponse  response=null,response1=null;
		WebForm form=null;
		String actualOutput=null;
		try{
			//get Access to index.html page as response
			response=conversation.getResponse("http://localhost:8095/SpringORM100/index.jsp");
			//response=conversation.getResponse("http://localhost:2525/LoginApp-HttpUnit/index.html");
			//get access to form page of index.html response page
			form=response.getForms()[0];
			//set request param values to form
			form.setParameter("uname","raja");
			form.setParameter("pwd","rani");
			//submit the form
			response1=form.submit();
			//get actual Output
			actualOutput=response1.getText().trim();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		assertEquals("test1", "<h1>Valid Credentials</h1>", actualOutput);
		
		//not working
		
	}//method
}//class
