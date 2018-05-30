<html>
	<body bgcolor="wheat">
		<h1>Data Inserted Sucessfully</h1>
		<%
		String result = (String)request.getAttribute("result");
		System.out.println(result);
		%>
		<br>
	<br>
	<br>
	<br>
	<a href="jsp/home.jsp">home page</a>
	</body>
</html>