<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>

<h1 style="color:red;text-align:center">Registration page </h1>

                   
<form  method="post" style="text-align: center; color: red">
  <spring:message code="reg.label1"/> : <input type="text" name="t1"><br><br>
  <spring:message code="reg.label2"/> : <input type="text" name="t2"><br><br>
  <spring:message code="reg.label3"/> : <input type="text" name="t3"><br><br>
  <input type="submit"  value="register"/>
</form>
<br><br><br><br><br><br>

&nbsp;&nbsp;&nbsp; <a href="?language=de">German</a>
  &nbsp;&nbsp;&nbsp;            <a href="?language=fr" style="text-decoration: none">French</a>
   &nbsp;&nbsp;&nbsp;                <a href="?language=hi" style="text-decoration: none">Hindi</a>
     &nbsp;&nbsp;&nbsp;              <a href="?language=en" style="text-decoration: none">English</a>
      &nbsp;&nbsp;&nbsp;              <a href="?language=cn" style="text-decoration: none">Chinese</a>
     

    
