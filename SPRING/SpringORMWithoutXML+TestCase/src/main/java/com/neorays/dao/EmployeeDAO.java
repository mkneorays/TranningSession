package com.neorays.dao;

import java.util.List;

import com.neorays.domain.EmpInsertBO;
import com.neorays.domain.LoginBO;
import com.neorays.dto.RegisterDTO;

public interface EmployeeDAO {

	public int  verify(String user,String pwd)throws Exception;
	public int loginInsert(LoginBO bo);
	public int loginInsert(RegisterDTO bo);//for testing purpose
	/*public int authentaction(LoginBO bo) throws Exception;
	public int insertEmp(EmpInsertBO bo);
	public List<EmpInsertBO> selectEmp();
	public int deleteEmp(int eid);
	public List<LoginBO> loginCred();*/
}//class
