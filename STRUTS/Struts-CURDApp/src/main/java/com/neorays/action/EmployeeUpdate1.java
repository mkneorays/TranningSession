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


public class EmployeeUpdate1 extends Action {
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest req, 
			HttpServletResponse pResponse)throws Exception {
			System.out.println("update1 method");
			String name=req.getParameter("ename");
			int sal=Integer.parseInt(req.getParameter("esalary"));
			String job=req.getParameter("ejob");
			int mgr=Integer.parseInt(req.getParameter("emgr"));
			int id=Integer.parseInt(req.getParameter("id"));
			System.out.println(name+"   "+sal+"  "+job+ " "+mgr);
	       int result=0;
	     
	       //create dao class obj
	       EmployeDAO dao=new EmployeeDAOImpl();
	       //use dao
	      result=dao.update(name,job,mgr,sal,id);
		//set data in request object
			req.setAttribute("employee","RECORD UPDATED SUCESSFULLY");
		
		return pMapping.findForward("update");
	}//method
	 
}//class
