package com.neorays.dao;

import java.util.List;

import com.neorays.bean.EmployeeBean;

public interface EmployeDAO {

	public List fetchEmp() ;
	public int insert(String name,int age,String add);
	public int deleteEmp( int empNo);
	public EmployeeBean selectOneEmp( int empNo);
	public int update(String name, String job, int mgr, int sal,int id) ;

}// class
