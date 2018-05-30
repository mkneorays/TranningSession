<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
	<body bgcolor="wheat">
		<h1>Name: <%= request.getAttribute("a") %></h1>
		<h1>Email: <%= request.getAttribute("b") %></h1>
		<h1>Phone: <%= request.getAttribute("c") %></h1>
	</body>
</html:html>