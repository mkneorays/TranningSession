package com.neorays.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.neorays.command.EmpInsertCommand;
import com.neorays.command.LoginCommand;
import com.neorays.command.RegisternCommand;
import com.neorays.dto.EmpInsertDTO;
import com.neorays.dto.LoginDTO;
import com.neorays.dto.RegisterDTO;
import com.neorays.service.EmployeeService;

@Controller
public class EmpController {
	
	//@Autowired
	private EmployeeService service;

	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String loginPage(){
		
		//return logicalViewName
		return "login";
	}//loginPage
	
	
	@RequestMapping(value="/register.htm",method=RequestMethod.GET)
	public String register(Map<String,Object> map,@ModelAttribute RegisternCommand cmd) throws Exception{
		RegisterDTO dto=null;
		System.out.println(cmd);
		//create dto object
		dto=new RegisterDTO();
		//convert cmd obj to dto obj
		BeanUtils.copyProperties(cmd, dto);
		//use service class
		String result=service.registerEmp(dto);
		//set response in map
		map.put("data", result);
		return  "<h1>Valid Credentials</h1>";
		//return "login";
	}//process method
	
	
}//class
