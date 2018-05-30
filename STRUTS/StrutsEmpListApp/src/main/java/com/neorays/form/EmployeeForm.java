package com.neorays.form;

import org.apache.struts.action.ActionForm;

public class  EmployeeForm extends ActionForm {

	private String name;
	private String age;
	private String address;
	public EmployeeForm() {
	System.out.println("EmployeeForm obj created");
	}//constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
