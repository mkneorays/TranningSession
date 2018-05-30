package com.neorays.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.dao.EmployeDAO;
import com.neorays.dao.EmployeeDAOImpl;

public class EmployeeSelectAction extends Action {
	
	public EmployeeSelectAction() {
		System.out.println("EmployeeSelectAction obj created");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("execute method of select operation");
		List list=null;
		EmployeDAO dao=null;
		//create dao object
		dao=new EmployeeDAOImpl();
		//use dao method
		list=(List) dao.fetchEmp();
		//add response in request obj
	     request.setAttribute("empList", list);
	     //forward view page
		return  mapping.findForward("success");
	}//execute method
	
}//class
