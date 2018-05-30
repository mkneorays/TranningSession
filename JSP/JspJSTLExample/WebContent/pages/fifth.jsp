
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
wwwwwtg
<body bgcolor="orange">
	Displaying arraylist using Using JSTL tags <br>
	<c:forEach var="str" items="${array}">
		${str}<br>
	</c:forEach>
</body>
</html>

