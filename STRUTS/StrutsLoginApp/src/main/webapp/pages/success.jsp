
<%@ taglib  uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
	<body bgcolor="wheat">
		<h1>Hello <bean:write name="loginFormRavi" property="userName"/></h1><br>	
		<h1>Welcome To Cluster Software Solutions</h1>
		
		<a href="pages/login.jsp">login</a>
	</body>
</html>