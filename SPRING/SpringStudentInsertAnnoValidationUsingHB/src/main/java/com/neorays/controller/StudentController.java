package com.neorays.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neorays.command.StudentCommand;

@Controller
public class StudentController {

	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String homeForm(@ModelAttribute("StudentCmd")  StudentCommand st){
		System.out.println("home page");
		return "home";
	}//homeForm method
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String insert(Map<String,Object> map, @Valid @ModelAttribute("StudentCmd")  StudentCommand st,BindingResult errors){
		//validations logic
		if(errors.hasErrors()){
			System.out.println("validation");
			return "home";
		}
		
		
		System.out.println(st);
		return "insert";
	}//insert method
	
	
}//class
