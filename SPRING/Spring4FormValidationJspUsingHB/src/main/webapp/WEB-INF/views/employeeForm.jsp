<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<style type="text/css">
#skills label {
	font-weight: normal;
	margin: 5px 10px 5px 3px;
	cursor: pointer;
}

#skills span {
	width: 10%;
}
</style>

</head>
<body class="container-fluid">
	<div class="row">
		<div class="col-sm-12 col-lg-7">
			<div class="panel panel-primary">
				<div class="panel-body">
					<h3><spring:message code="Label.formName" text="Employee Form"/></h3>
					<form:form modelAttribute="employee" name="employeeForm" id="employeeForm" method="post" action="saveEmployee" accept-charset="UTF-8">
						<spring:bind path="department.deptId">
							<div class="form-group  ${status.error ? 'has-error':'' }">
								<form:select path="department.deptId" class="form-control" items="${department}">
								</form:select>
								<form:errors path="department.deptId" class="help-block"  />
							</div>
						</spring:bind>
						<spring:bind path="firstName">
							<div class="form-group ${status.error ? 'has-error':'' }">
								<spring:message code="Label.firstName" var="firstNameLabel" text="FirstName" />
								<form:input type="text" path="firstName" placeholder="${firstNameLabel}" class="form-control" />
								<form:errors path="firstName" class="help-block" />
							</div>
						</spring:bind>
						<spring:bind path="lastName">
							<div class="form-group ${status.error ? 'has-error':'' }">
								 <spring:message code="Label.lastName" var="lastNameLabel" text="LastName" />
								<form:input type="text" path="lastName" placeholder="${lastNameLabel}" class="form-control" />
								<form:errors path="lastName" class="help-block" />
							</div>
						</spring:bind>
						<spring:bind path="dob">
							<div class="form-group ${status.error ? 'has-error':'' }">
								<spring:message code="Label.dob" var="dobLabel" text="Date Of birth" />
								<form:input type="text" path="dob" placeholder="${dobLabel}" class="form-control" />
								(mm/dd/yyyy)
								<form:errors path="dob" class="help-block" />
							</div>
						</spring:bind>
						<spring:bind path="email">
							<div class="form-group ${status.error ? 'has-error':'' }">
								<spring:message code="Label.email" var="emailLabel" text="Email" />
								<form:input type="text" path="email" placeholder="${emailLabel}" class="form-control" />
								<form:errors path="email" class="help-block" />
							</div>
						</spring:bind>
						<spring:bind path="gender">
								<div class="form-group ${status.error ? 'has-error':'' }">
									<label><spring:message code="Label.gender" text="Gender"/></label>
									<label class="radio-inline"> 
										<form:radiobutton path="gender" value="M"/><spring:message code="Label.gender.Male" text="Male" />
									</label> 
									<label class="radio-inline"> 
										<form:radiobutton path="gender" value="F"/><spring:message code="Label.gender.Female" text="Female" />
									</label>
									<form:errors path="gender" class="help-block"/>
								</div>
						</spring:bind>
						
						<c:forEach var="addresses" items="${employee.addresses}" varStatus="stat">
							<fieldset>
								<legend><c:out value="${addresses.addressType}"/></legend>
								<form:hidden path="addresses[${stat.index}].addressType"/>
								<spring:bind path="addresses[${stat.index}].addressLine">
									<div class="form-group ${status.error ? 'has-error':'' }">
										<label><spring:message code="Label.addressLine" text="AddressLine" /></label>
										<form:textarea path="addresses[${stat.index}].addressLine" class="form-control" />
										<form:errors path="addresses[${stat.index}].addressLine" class="help-block"/>
									</div>
								</spring:bind>
								<spring:bind path="addresses[${stat.index}].city">
									<div class="form-group ${status.error ? 'has-error':'' }">
										<label><spring:message code="Label.city" text="City" /></label>
										<form:input path="addresses[${stat.index}].city" class="form-control"/>
										<form:errors path="addresses[${stat.index}].city"  class="help-block"/>
									</div>
								</spring:bind>
								<spring:bind path="addresses[${stat.index}].zip">
									<div class="form-group ${status.error ? 'has-error':'' }">
										<label><spring:message code="Label.zip" text="Zip" /></label>
										<form:input path="addresses[${stat.index}].zip" class="form-control"/>
										<form:errors path="addresses[${stat.index}].zip"  class="help-block"/>
									</div>
								</spring:bind>
								<spring:bind path="addresses[${stat.index}].state">
									<div class="form-group ${status.error ? 'has-error':'' }">
										<label><spring:message code="Label.state" text="State" /></label>
										<form:input path="addresses[${stat.index}].state" class="form-control" />
										<form:errors path="addresses[${stat.index}].state"  class="help-block"/>
									</div>
								</spring:bind>
								<spring:bind path="addresses[${stat.index}].country">
									<div class="form-group ${status.error ? 'has-error':'' }">
										<label><spring:message code="Label.country" text="Country" /></label>
										<form:input path="addresses[${stat.index}].country" class="form-control" />
										<form:errors path="addresses[${stat.index}].country"  class="help-block"/>
									</div>
								</spring:bind>
							</fieldset>
							<c:if test="${stat.index==0}">
								<div class="form-group">
									<input type="checkbox" id="adressSame" onchange="copyAddress(this)"/>&nbsp;<spring:message code="Mesage.SameAddress"></spring:message>
								</div>
							</c:if>
						</c:forEach>
						
						<spring:bind path="skillSet">
							<div class="form-group ${status.error ? 'has-error':'' }">
								<label><spring:message code="Label.skillSet" text="State" /></label>
								<div id="skills">
									<form:checkboxes items="${skillSet}" path="skillSet" />
								</div>
								<form:errors path="skillSet"  class="help-block"/>
							</div>
						</spring:bind>
						<spring:bind path="hireDate">
								<div class="form-group  ${status.error ? 'has-error':'' }">
									<spring:message code="Label.hireDate" var="hireDateLabel" text="Hire Date" />
									<form:input type="text" path="hireDate" placeholder="${hireDateLabel}" class="form-control" />(mm/dd/yyyy)
									<form:errors path="hireDate"  class="help-block"/>
								</div>
						</spring:bind>
						<spring:bind path="salary">
							<div class="form-group ${status.error ? 'has-error':'' }">
								<spring:message code="Label.salary" var="salaryLabel" text="Salary" />
								<form:input type="text" path="salary" placeholder="${salaryLabel}" class="form-control" />
								<form:errors path="salary"  class="help-block"/>
							</div>
						</spring:bind>
						<div class="form-group">
							<button type="submit" class="btn btn-primary"><spring:message code="Label.save" text="Save" /></button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function copyAddress(ele){
			if(ele.checked){
				document.getElementById("addresses1.addressLine").value=document.getElementById("addresses0.addressLine").value;
				document.getElementById("addresses1.city").value=document.getElementById("addresses0.city").value;
				document.getElementById("addresses1.zip").value=document.getElementById("addresses0.zip").value;
				document.getElementById("addresses1.state").value=document.getElementById("addresses0.state").value;
				document.getElementById("addresses1.country").value=document.getElementById("addresses0.country").value;
			}else{
				document.getElementById("addresses1.addressLine").value="";
				document.getElementById("addresses1.city").value="";
				document.getElementById("addresses1.zip").value="";
				document.getElementById("addresses1.state").value="";
				document.getElementById("addresses1.country").value="";
			}
		}
	</script>
</body>
</html>