<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spring jquery ajax</title>

<style type="text/css">
  span.error{
    color: red;
    margin-left: 5px;
  }
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
var data="";
$(function() {
   /*  Submit form using Ajax */
   $('button[type=submit]').click(function(e) {
      
      //Remove all errors
     // $('input').next().remove();
      
      $.post({
         url : '/SpringJQueryAjax/second.htm',
         type: "POST",
         data : $('form[name=employeeForm]').serialize(),
         /* success : function(son) {
             alert("hi ajax");
        	 data=son;
              alert(data);
              //document.getElementById("demo").innerHTML = "Hello World";
         } */
         success : function(result) {
				//if(result.status == "Done"){
			$("#demo").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"---> Customer's Info: FirstName = " + 
										result.firstName + " ,LastName = " + result.lastName + "</p>");
				/* }else{
					$("#demo").html("<strong>Error</strong>");
				} */
				alert(result);
			}
      })
   });
});
</script>
</head>
<body>
  <h1>Employee Input Form</h1>
  <hr />

  <form  name="employeeForm">
    <table>
      <tr>
        <td>First Name</td>
        <td><input name="firstName" type="text" /></td>
      </tr>
      <tr>
        <td>Last Name</td>
        <td><input name="lastName" type="text" /></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input name="email" type="text" /></td>
      </tr>
      <tr>
        <td>Designation</td>
        <td><input name="designation" type="text" /></td>
      </tr>
      <tr>
        <td></td>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form>

<!-- Result Container    style="display: none;"  -->
  Result JsonData::<div id="demo">
  
  </div>
</body>
</html>