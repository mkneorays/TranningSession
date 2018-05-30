<%@page import="com.neoray.bean.*" %>
<!-- create or locate Bean class object -->

<jsp:useBean id="st"  class="com.neoray.bean.StudentBean"  scope="session"/>
<!--  read and display the bean property values -->
sno== <jsp:getProperty name="st"  property="sno"/><br>
sname== <jsp:getProperty name="st"  property="sname"/><br>
result== <jsp:getProperty name="st"  property="result"/><br>



