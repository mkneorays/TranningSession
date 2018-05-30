package com.neorays.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import com.neorays.dao.EmployeDAO;
import com.neorays.dao.EmployeeDAOImpl;
import com.neorays.form.EmployeeForm;

public class CurdAction extends DispatchAction {

	public ActionForward submit(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {
		EmployeDAO dao=null;
		//create dao object
		dao=new EmployeeDAOImpl();
		System.out.println("insert method");
		EmployeeForm dynaActionForm = (EmployeeForm) pForm;
		//get client data
		String name= dynaActionForm.getName();
		int age= dynaActionForm.getAge();
		String add=dynaActionForm.getAddress();
		//use dao
		int count=dao.insert(name, age, add);
		
		return pMapping.findForward("insert");
		
		
	}// insert method

	public ActionForward EmpDetails(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {
		System.out.println("select  method");
		List list=null;
		EmployeDAO dao=null;
		//create dao object
		dao=new EmployeeDAOImpl();
		//use dao method
		list=(List) dao.fetchEmp();
		//add response in request obj
	    pRequest.setAttribute("empList", list);
  System.out.println(list);
	    //forward view page

			return pMapping.findForward("select");
	}// select method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ActionForward update(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {
		System.out.println("delete method");
		DynaActionForm dynaActionForm = (DynaActionForm) pForm;

		
		
		return pMapping.findForward("update");
	}// update method

	public ActionForward delete(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {
		System.out.println("delete method");
		DynaActionForm dynaActionForm = (DynaActionForm) pForm;

		/*int intNumber1 = Integer.parseInt((String)dynaActionForm.get("number1"));
		int intNumber2 = Integer.parseInt((String)dynaActionForm.get("number2"));
		int intAddNo=intNumber1+intNumber2;
					
		pRequest.setAttribute("result",String.valueOf(intAddNo));
*/		
		
		return pMapping.findForward("delete");
	}// delete method

}
