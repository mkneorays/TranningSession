package com.neorays.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neorays.command.Employee;
import com.neorays.util.JavatoJsonUtil;

@RestController
public class RegdController {

	@RequestMapping(value ="first.htm",method=RequestMethod.GET)
	public String employeeForm() {
		System.out.println("home method");
		return "employeeForm";
	}// employeeForm method	
	
	@RequestMapping(value = "/second.htm",  method=RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String saveEmployee(
			@ModelAttribute /*@Valid*/ Employee employee/*, BindingResult result*/) {
		System.out.println("process method = " + employee); 
		
		String json=JavatoJsonUtil.convertJavaToJson(employee);
		System.out.println("ssss  "+json);
		return json;
	}

}// class




/*@RequestMapping(value = "/second.htm", produces = { MediaType.APPLICATION_JSON_VALUE })
@ResponseBody
public EmployeeJsonRespone saveEmployee(
		@ModelAttribute @Valid Employee employee, BindingResult result) {
	System.out.println("process method = " + employee);
	EmployeeJsonRespone respone = new EmployeeJsonRespone();
	respone.setEmployee(employee); 
	if (result.hasErrors()) {
		// Get error message
		 Map<String, String> errors = result.getFieldErrors().stream()
		 .collect( Collectors.toMap(FieldError::getField,
		 FieldError::getDefaultMessage) );
		respone.setValidated(false);
		// respone.setErrorMessages(errors);
	} else {
		// Implement business logic to save employee into database
		// ..
		respone.setValidated(true);
		respone.setEmployee(employee);
	}
	
	
	return respone;
}*/
