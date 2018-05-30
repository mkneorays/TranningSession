package com.neorays.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neorays.dao.EmployeeDAO;
import com.neorays.domain.EmpInsertBO;
import com.neorays.domain.LoginBO;
import com.neorays.dto.EmpInsertDTO;
import com.neorays.dto.LoginDTO;
import com.neorays.dto.RegisterDTO;
@Service
public class EmployeServiceImpl implements EmployeeService {

	//@Autowired
	private EmployeeDAO dao;
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public String authenticate(String user, String pwd) throws Exception {
		int count=0;
		if(user.equalsIgnoreCase("") || pwd.equalsIgnoreCase(""))
			throw new IllegalArgumentException("provide inputs");
		//use DAO
		System.out.println("count=="+count);
		count=dao.verify(user, pwd);
		System.out.println("count=="+count);
		if(count==0)
			return "InValid Crendetials";
		else
			return "Valid Crendetials";
	}
	public String registerEmp(RegisterDTO dto){
		
		LoginBO bo=null;
		int count=0;
		//create bo obj
		bo=new LoginBO();
		if(dto==null)
			throw new IllegalArgumentException("provide inputs boss");
		//copy data dto to bo
		BeanUtils.copyProperties(dto, bo);
		System.out.println("service bo "+bo);
		//use dao class
		 count=dao.loginInsert(dto);
		//bussiness logic
		if(count==0)
			return "fail";
			//return "REGSTERED SUCCESSFULL GO TO LOGIN";
		else
			return "pass";
			//return "NOT REGISTERED, PLEASE TRY AGAIN";
	}//registerEmp method

	
	
}//class
