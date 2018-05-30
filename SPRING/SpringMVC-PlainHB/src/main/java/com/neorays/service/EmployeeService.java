package com.neorays.service;

import com.neorays.command.LoginCommand;
import com.neorays.dto.LoginDTO;
import com.neorays.dto.RegisterDTO;

public interface EmployeeService {

	public String registerEmp(RegisterDTO dto) throws Exception; 
	public String loginEmp(LoginDTO dto) throws Exception; 
}
