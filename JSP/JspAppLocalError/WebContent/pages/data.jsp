<%@page errorPage="err.jsp" %>
<b>from main.jsp</b>
<% int a=Integer.parseInt("40"); %>
Value  iddd is:: <%=a %>
<br><br>
<%
   //String name=request.getParameter("name");
  int name=Integer.parseInt(request.getParameter("name"));
  out.println(name);
%>
<br><br>
<a href="../home.html">home</a>
