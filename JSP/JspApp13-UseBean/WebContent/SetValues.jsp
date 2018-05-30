<%@page import="com.nt.bean.StudentBean" %>

<!-- create or Locate Bean class obj -->
<jsp:useBean id="st"  class="com.nt.bean.StudentBean" scope="session"/>

<%-- <!-- set values bean properties -->
<jsp:setProperty name="st" property="sno"  value="101"/>
<jsp:setProperty name="st" property="sname"  value="raja"/>
<jsp:setProperty name="st" property="result"  value="pass"/> --%>

<%--  <!-- set request param values as bean property values -->
 <jsp:setProperty name="st"  property="sno"  param="stno"/>
 <jsp:setProperty name="st"  property="sname"  param="stname"/>
 <jsp:setProperty name="st"  property="result"  param="stresult"/> --%>
 
 <%-- Set request param values to bean properties --%>
 <jsp:setProperty name="st"  property="*"/>


<br><br>
  values are set to bean proeprties.






