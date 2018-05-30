package com.neorays.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neorays.dao.EmployeeDAO;
import com.neorays.domain.LoginBO;
import com.neorays.dto.LoginDTO;
import com.neorays.dto.RegisterDTO;
@Service
public class EmployeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	
	public String registerEmp(RegisterDTO dto) throws Exception {
		
		LoginBO bo=null;
		//create bo obj
		bo=new LoginBO();
		//copy data dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao class
		int count=dao.loginInsert(bo);
		//bussiness logic
		if(count!=0)
			return "REGSTERED SUCCESSFULL GO TO LOGIN";
		else
		return "NOT REGISTERED, PLEASE TRY AGAIN";
	}//registerEmp method


	public String loginEmp(LoginDTO dto) throws Exception {
		LoginBO bo=null;
		//create bo obj
		bo=new LoginBO();
		//copy data dto to bo
		bo.setName(dto.getUser());
		bo.setPsw(dto.getPsw());
		//use dao class
		int count=dao.authentaction(bo);
		//bussiness logic
		if(count==0)
			return "fail";
		else
		return "success";
		
	}//loginEmp method

	
}//class
