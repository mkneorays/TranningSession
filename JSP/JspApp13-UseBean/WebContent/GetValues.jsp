<%@page import="com.nt.bean.*" %>
<!-- create or locate Bean class object -->

<jsp:useBean id="st"  class="com.nt.bean.StudentBean"  scope="session"/>
<!--  read and display the bean property values -->
sno== <jsp:getProperty name="st"  property="sno"/><br>
sname== <jsp:getProperty name="st"  property="sname"/><br>
result== <jsp:getProperty name="st"  property="result"/><br>



