
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body bgcolor="orange">
<h1>I am before catch</h1><br>

<c:catch>
<%int x=10/0; %>
Value of x ix<%=x %><br>
<h1>I am inside catch</h1>
</c:catch>
 
<h1>I am after catch</h1>
</body>
</html>
