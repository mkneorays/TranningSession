package com.neorays.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.form.EmployeeForm;

public class EmployeeInsertAction extends Action {
	
	public EmployeeInsertAction() {
		System.out.println("EmployeeInsertAction obj created");
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm formm,
			ServletRequest request, ServletResponse response) throws Exception {
          
		
		System.out.println("execute method of insert operation");
		EmployeeForm loginForm = (EmployeeForm)formm;
		
		String strUserName = loginForm.getName();
		String strPassword = loginForm.getAge();
		String add=loginForm.getAddress();
		System.out.println("kumar"+add);
		
		return mapping.findForward("success");
	}//execute method
}//class
