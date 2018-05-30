
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="com.neorays.bean.EmployeeBean"%>
	<%@ page import="java.util.ArrayList"%>

	<%!public static final String EMPLOYEE_DETAILS = "SELECT * FROM  EMP";
	static Connection con;
	static Statement st = null;
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
	}//getConnection() method

	%>
	<%
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		//get connection
		con = getConnection();
		st = con.createStatement();
		//fetch data
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
		}//while
			System.out.println();
		request.setAttribute("empList", list);
			
	%>
	
	<jsp:forward page="emp.jsp"/>
Doing url rewriting using expression<br>
<a href="<%=response.encodeUrl("emp_details.jsp") %>"> Click here for  Employee </a><br>
<%-- 
Doing url rewriting using JSTL<br>
<a href='<c:url value="emp_details.jsp"/>'>Click here for Emp</a> --%>
<!-- its not working -->


	<br>
	<br>
	<a href="../home.html">home</a>
</body>
</html>