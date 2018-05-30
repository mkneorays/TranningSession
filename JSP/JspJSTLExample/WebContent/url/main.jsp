

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body bgcolor="wheat">
<h1>This is hello jsp</h1> 
Doing url rewriting using expression<br>
<a href="<%=response.encodeUrl("first.jsp") %>"> Click here for ABC </a><br>

Doing url rewriting using JSTL<br>
<a href="<c:url value="second.jsp"/>">Click here for XYZ</a>
</body>
</html>
