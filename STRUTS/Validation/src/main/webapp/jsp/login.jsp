<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html>
	<body>
		<html:form action="/search">
			<table>
				<tr>
					<td><bean:message key="login.searchstudent"/></td>
					<td><html:text property="sid"/></td>
				</tr>
			</table>
		<html:submit value="Enter"/>
		</html:form>
		<html:errors/>
	</body>
</html:html>