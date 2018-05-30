package com.neorays.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neorays.command.LoginCommand;
import com.neorays.command.RegisternCommand;
import com.neorays.dto.LoginDTO;
import com.neorays.dto.RegisterDTO;
import com.neorays.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService service;

	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String loginPage(){
		System.out.println("login method");
		//return logicalViewName
		return "login";
	}//loginPage
	
	@RequestMapping(value="/register.htm",method=RequestMethod.GET)
	public String register(Map<String,Object> map,@ModelAttribute RegisternCommand cmd) throws Exception{
		System.out.println("register method");
		RegisterDTO dto=null;
		//create dto object
		dto=new RegisterDTO();
		//convert cmd obj to dto obj
		BeanUtils.copyProperties(cmd, dto);
		//use service class
		String result=service.registerEmp(dto);
	  System.out.println("bando"+result);
		//set response in map
		map.put("data", result);
		return "login";
	}//process method
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String login(Map<String,Object> map,@ModelAttribute LoginCommand cmd) throws Exception{
		 LoginDTO dto=null;
		//create dto object
		dto=new  LoginDTO();
		//convert cmd obj to dto obj
		BeanUtils.copyProperties(cmd, dto);
		//use service class
		String result=service.loginEmp(dto);
		//set response in map
		if(result=="fail"){
		map.put("authorise", "NOT REGISTERED PLEASE GO TO CREATE AN ACCOUBT");
		return "login";
		}
		else{
			map.put("login", "LOGIN SUCCESSFULLY");
		    return "home";
		}
	}//login method
	
	
}//class
