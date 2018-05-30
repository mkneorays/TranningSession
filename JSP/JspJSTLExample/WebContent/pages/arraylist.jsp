

<%@page import="java.util.*"%>
<html>
<body bgcolor="wheat">
Using java code to display arraylist
<%
/* 	Object ob = request.getAttribute("ARL");
	if (ob instanceof ArrayList) {
		if (ob != null) {
			ArrayList al = (ArrayList) ob;
			Iterator it = al.iterator();
			while (it.hasNext()) {
				out.println(it.next());
			}
		}
	} */
	 ArrayList al=new ArrayList();
	al.add(3);
	al.add(1);
	al.add(9);
	al.add(2);
	al.add(7);
	
	request.setAttribute("array", al);
	pageContext.setAttribute("aaa", al);
	
	
%>
<jsp:forward page="fifth.jsp"/>
<%-- <jsp:forward page="sixt.jsp"/> --%>
</body>
</html>