
<%@ taglib  uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>
	<body bgcolor="wheat">
		<html:form action="/login">
			<table>
				<tr>
					<td><bean:message key="login.username"/></td>
					<td><html:text property="userName"/></td>
				</tr>
				<tr>
					<td><bean:message key="login.password"/></td>
					<td><html:password property="password"/></td>
				</tr>
			</table>
			<html:submit value="Enter"></html:submit>
		</html:form>
	</body>
</html:html>