
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	
	
	Print numbers from 1 to 100 using forEach tag<br><br>
	<c:forEach begin="1" end="100" var="x">
	<c:out value="${x}"/>
	</c:forEach>
	<br><br><br><br>
	
	Print numbers from 100 to 200 incrementing every print by 5<br><br>
	
	<c:forEach  var="x" begin="100" end="200" step="5">
	<c:out value="${x}"/>
	</c:forEach>	
	</body>
</html>

