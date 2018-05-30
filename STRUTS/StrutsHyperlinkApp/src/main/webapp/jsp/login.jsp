<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>

<html:html>
	<body bgcolor="yellow">
		
			<a href="../jsp/hello.jsp">forward with HTML hyperlink using href</a>
			<br> 
			<br>
			<html:link page="/jsp/hello.jsp">forward with Struts hyperlink customtag</html:link>
			<br> 
			<br>
			<html:link forward="hai">forward with global forward</html:link>
			<br>
			<html:link action="cluster">forward with FowardAction</html:link>
			
			
	</body>
</html:html>