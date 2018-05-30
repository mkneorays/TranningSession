<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update page</title>
</head>
<body>
	<h1 style="text-align: center; color: red">Update EMPLOYEE DETAIL</h1>
	<form action="update1.do" method="get" style="text-align: center; color: blue" novalidate>
	
		EMP_ID: <input type="text" value=" ${employee.empId }"
			disabled="disabled"> &nbsp;  &nbsp;  &nbsp;  &nbsp;   <input type="text" name="id" value="${employee.empId }" readonly="readonly" > <br>
			
		<br>NAME: <input type="text" value=" ${employee.name }"
			disabled="disabled"> &nbsp;  &nbsp;  &nbsp;  &nbsp;<input type="text" name="ename"><br>
			
		<br> JOB: <input type="text" value=" ${employee.job }"
			disabled="disabled">  &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="text" name="ejob" autofocus ><br>
			
		<br>MGR: <input type="text" value=" ${employee.mgr }"
			disabled="disabled"> &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="text" name="emgr"><br>
			
		<br> HIREDATE: <input type="text" value=" ${employee.hiredate }"
			disabled="disabled">  &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="hidden" name="ehiredate" disabled="disabled"> <br>
			
		<br>SALARY: <input type="text" value=" ${employee.sal }"
			disabled="disabled">&nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="text" name="esalary"><br>
			
		<br> COMM: <input type="text" value=" ${employee.comm }"
			disabled="disabled">&nbsp;  &nbsp;  &nbsp;  &nbsp;  <input type="hidden" name="ecomm" disabled="disabled"><br>
			
		<br> DEPT_ID: <input type="text" value=" ${employee.deptId }"
			disabled="disabled"> &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type="hidden" name="edeptid" disabled="disabled"><br>
			
		<br> <input type="submit" value="SUBMIT">


	</form>
	
	<br>
	<br>
	<a href="jsp/home.jsp">home page</a>

</body>
</html>