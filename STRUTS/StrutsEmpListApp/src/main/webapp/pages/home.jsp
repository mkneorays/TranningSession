
<%@ taglib  uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
  <h1 style="text-align: center;color: red">HOME PAGE</h1>
  
  
    <form action="insert.do" method="get">
 Name   <input type="text" name="name">
      Age  <input type="text" name="age">
  Address <input type="text" name="address">
      <input type="submit" value="submit">
      
      </form>
<%-- <html:html>
	<body bgcolor="wheat">
		<html:form action="insert" method="get">
			<table>
				<tr>
					<td><bean:message key="emp.name"/></td>
					<td><html:text property="name"/></td>
				</tr>
				<tr>
					<td><bean:message key="emp.age"/></td>
					<td><html:text property="age"/></td>
				</tr>
				<tr>
					<td><bean:message key="emp.address"/></td>
					<td><html:text property="address"/></td>
				</tr>
			</table>
			<html:submit value="Enter"></html:submit>
		</html:form>
	</body>
</html:html> --%>
<br><br><br>
<a href="select.do">Get Emp List</a><br>


