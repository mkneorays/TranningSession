package com.neorays.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neorays.bean.EmployeeBean;

public class EmployeeDAOImpl implements EmployeDAO {

	public static final String EMPLOYEE_DETAILS = "SELECT * FROM  EMP";
	public static final String EMPLOYEE_INSERT = "INSERT INTO EMPLOYEE VALUES (?,?,?)";
	public static final String EMPLOYEE_DELETE= "DELETE FROM EMP WHERE EMP_ID=?";
	public static final String EMPLOYEE_SELECT = "SELECT * FROM  EMP WHERE EMP_ID=?";
	public static final String EMPLOYEE_UPDATE= "UPDATE EMP SET "
			+ "EMP_NAME=?,EMP_JOB=?,EMP_MGR=?,EMP_SAL=?   WHERE EMP_ID=?";
	
	//UPDATE EMP SET EMP_NAME='MITHU',EMP_JOB='ENGG',EMP_MGR=1111,EMP_SAL=2222 
	//WHERE EMP_NAME='BLAKE'; 


	static Connection con;
	static Statement st ;
	static PreparedStatement ps;
	static ResultSet rs;

	public static Connection getConnection() {
				try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql:neorays",
					"postgres", "POSTGRASQL");
		} catch (SQLException sql) {
			sql.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}// getConnection() method

	public List fetchEmp() {
	
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		try {
			// get connection
			con = getConnection();

			st = con.createStatement();

			rs = st.executeQuery(EMPLOYEE_DETAILS);

			while (rs.next()) {
				EmployeeBean emp = new EmployeeBean();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setMgr(rs.getInt(4));
				emp.setHiredate(rs.getDate(5));
				emp.setComm(rs.getInt(6));
				emp.setDeptId(rs.getInt(7));
				list.add(emp);
			}// while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// fetch data
		return list;
	}// fetch method

	public int insert(String name, int age, String add) {
		int result=0;
		//get connection obj
		con=getConnection();
		//create  preparedStatement obj
		try {
			ps=con.prepareStatement( EMPLOYEE_INSERT );
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, add);
			//call execute method
		     result=ps.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return result;
	}//insert method
	
	public int update(String name, String job, int mgr, int sal,int id) {
		int result=0;
		//get connection obj
		con=getConnection();
		//create  preparedStatement obj
		try {
			ps=con.prepareStatement( EMPLOYEE_UPDATE );
			ps.setString(1, name);
			ps.setString(2, job);
			ps.setInt(3, mgr);
			ps.setInt(4,sal);
			ps.setInt(5,id);
			
			//call execute method
		     result=ps.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		System.out.println("update data  "+result);
		return result;
	}//insert method
	public int deleteEmp( int empNo){
		int delete = 0;
		// GET CONNECTION
		con=getConnection();
		if(con!=null)
			try {
				ps=con.prepareStatement(EMPLOYEE_DELETE);
				ps.setInt(1, empNo);
			 delete=ps.executeUpdate();
				
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
	  
		return delete;
	}//delete method
	
	public EmployeeBean selectOneEmp( int empNo){
		ResultSet rs= null;
		EmployeeBean emp=null;
		// GET CONNECTION
		con=getConnection();
		if(con!=null)
			try {
				ps=con.prepareStatement(EMPLOYEE_SELECT);
				ps.setInt(1, empNo);
			 rs=ps.executeQuery();
				if(rs!=null)
					while (rs.next()) {
					 emp = new EmployeeBean();
						emp.setEmpId(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setMgr(rs.getInt(4));
						emp.setHiredate(rs.getDate(5));
						emp.setComm(rs.getInt(6));
						emp.setDeptId(rs.getInt(7));
					
					}// while
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
	  
		return emp;
	}//delete method

}// class
