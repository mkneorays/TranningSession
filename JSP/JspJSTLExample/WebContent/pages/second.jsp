<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
ffff

	<c:set var="a" value="33" />
	<br>
      ${a }
      
      <c:out  value="${a }"   />
      <br>
	<c:if test="${a%2 == 0}">
    	Given number is Even<br>
	</c:if>
	<c:if test="${a%2 != 0}">
    	Given number is Odd<br>
	</c:if>


	<c:if test="${a%2 eq '0'}">
    	Given number is Even<br>
	</c:if>
	<c:if test="${a%2 ne '0'}">
    	Given number is Odd<br>
	</c:if>
</body>
</html>