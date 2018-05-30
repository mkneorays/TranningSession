package com.neorays.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class EmployeeForm extends ActionForm 
{
	private String name;
	private Integer age;
	private String address;
	
	public EmployeeForm()
	{
		System.out.println("EmployeeForm  constructor");
		
	}//constructor



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


/*
	public ActionErrors validate(ActionMapping am, HttpServletRequest req)
	{
		System.out.println("inside validate method");
		ActionErrors errors = new ActionErrors();
		
		if(name==null || name.length()==0)
		{
			
			errors.add("name",new ActionMessage("msg1"));
		}
		else if(age==null || age==0)
		{
		
			errors.add("age",new ActionMessage("msg2"));
		}
		else	if(address==null || address.length()==0)
		{
			errors.add("address",new ActionMessage("msg3"));
		}
		return errors;
	}
	
	public void reset(ActionMapping am, HttpServletRequest req) 
	{
		System.out.println("inside reset method");
		//default value will come in this box
		name="";
	}*/
}
