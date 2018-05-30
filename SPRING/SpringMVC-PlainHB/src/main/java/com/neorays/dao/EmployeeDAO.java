package com.neorays.dao;

import com.neorays.domain.LoginBO;

public interface EmployeeDAO {

	public int loginInsert(LoginBO bo) throws Exception;
	public int authentaction(LoginBO bo) throws Exception;
}//class
