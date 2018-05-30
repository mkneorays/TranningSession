package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.bean.EmployeeBean;
import com.neorays.dao.EmployeDAO;
import com.neorays.dao.EmployeeDAOImpl;


public class EmployeeUpdate extends Action {
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
			System.out.println("update method");
	       int result=0;
	       int id=Integer.parseInt(pRequest.getParameter("id"));
	       //create dao class obj
	       EmployeDAO dao=new EmployeeDAOImpl();
	       //use dao
	      EmployeeBean emp=dao.selectOneEmp(id);
		//set data in request object
			pRequest.setAttribute("employee",emp);
		
		return pMapping.findForward("update");
	}//method
	 
}//class
