
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body bgcolor="orange">
	<c:set var="color" value="555" />

	<c:choose>
		<c:when test="${color == 'red' or color eq 'RED'}">
			Your favorite color is RED
		</c:when>
	
		<c:when test="${color eq 'green' || color eq 'GREEN'}">
			Your favorite color is GREEN
		</c:when>
	
		<c:when test="${color eq 'blue'  || color eq 'BLUE'}">
			Your favorite color is BLUE
		</c:when>
	
		<c:otherwise>
			Unknown	Colorxx
		</c:otherwise>
	</c:choose>
</body>
</html>