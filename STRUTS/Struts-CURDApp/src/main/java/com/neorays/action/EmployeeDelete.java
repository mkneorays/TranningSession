package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.dao.EmployeDAO;
import com.neorays.dao.EmployeeDAOImpl;


public class EmployeeDelete extends Action {
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
			System.out.println("delete method");
	       int result=0;
	       int id=Integer.parseInt(pRequest.getParameter("id"));
	       //create dao class obj
	       EmployeDAO dao=new EmployeeDAOImpl();
	       //use dao
	       result=dao.deleteEmp(id);
		if(result==0)
			pRequest.setAttribute("delete","Record Not Deleted Successfully");
		else 
			pRequest.setAttribute("delete","Record  Deleted Successfully");
		return pMapping.findForward("select");
	}//method
	 
}//class
