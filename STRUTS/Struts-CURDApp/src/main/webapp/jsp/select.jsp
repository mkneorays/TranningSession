<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h1 style="text-align: center; color: red">EMPLOYEE LIST DETAILS</h1>
   
	    <c:choose>
	<c:when test="${!empty empList }">
		<table border="2" align="center">

			<tr style="te">
				<th><font color="red">EMP_ID</font></th>
				<th><font color="red">NAME</font></th>
				<th><font color="red">JOB</font></th>
				<th><font color="red">MGR</font></th>
				<th><font color="red">HIREDATE</font></th>
				<th><font color="red">SALARY</font></th>
				<th><font color="red">COMM</font></th>
				<th><font color="red">DEPT_ID</font></th>
				<th><font color="black">DELETE</font></th>
				<th><font color="black">UPDATE</font></th>
			</tr>

			<c:forEach var="emp" items="${empList }">
				<tr>
					<td  style="color:green;">${emp.empId }</td>
					<td  style="color:green;">${emp.name }</td>
					<td  style="color:green;">${emp.job }</td>
					<td  style="color:green;">${emp.mgr }</td>
					<td  style="color:green;">${emp.hiredate }</td>
					<td  style="color:green;">${emp.sal }</td>
					<td  style="color:green;">${emp.comm }</td>
					<td  style="color:green;">${emp.deptId }</td>
					<td ><a href="update.do?id=${emp.empId }" style="color:blue;">update</a></td>
					<td><a href="delete.do?id=${emp.empId }" style="color:red;">delete</a></td>
					
						</tr>	
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
   DATA NOT FOUND
   </c:otherwise>
     </c:choose> 


	<br>
	<br>
	<br>
	<br>
	<a href="jsp/home.jsp">home page</a>

</body>
</html>