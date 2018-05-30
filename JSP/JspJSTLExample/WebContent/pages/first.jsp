

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cluster"%>

<html>
<body bgcolor="orange">
	<cluster:set var="str" value="${param.name}" scope="session" />
	<h1>Value is ${str} <br>
	<cluster:out value="${str}" /> </h1>
	<cluster:remove var="str" scope="session" />
	
	
</body>
</html>



