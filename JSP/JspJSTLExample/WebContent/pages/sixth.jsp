

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body bgcolor="orange">
	<strong>Student List</strong>
	<table>
		<c:forEach var="arl" items="${array}" >
			<tr>
				<c:forEach var="str" items="${arl}" >
				     <td>${str}</td>
				</c:forEach>
			</tr>	
		</c:forEach>
	</table>	
	</body>
</html>

