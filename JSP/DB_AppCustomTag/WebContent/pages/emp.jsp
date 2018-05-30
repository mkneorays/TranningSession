

<%-- ${empList} --%>

  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1  style="text-align: center ;color :BLUE">Employee Details</h1>

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
				<th><font color="red">dEPT_ID</font></th>
			</tr>

			<c:forEach var="emp" items="${empList }">
				<tr style="color:green;">
					<td>${emp.empId }</td>
					<td>${emp.name }</td>
					<td>${emp.job }</td>
					<td>${emp.mgr }</td>
					<td>${emp.hiredate }</td>
					<td>${emp.sal }</td>
					<td>${emp.comm }</td>
					<td>${emp.deptId }</td>
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
<a href="../home.html">home</a>
