<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="Title.EmployeeInfo" text="Employee Information" /></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
</head>
<body>
<body class="container-fluid">
	<div class="row">
		<div class="col-sm-12 col-lg-7">
			<div class="panel panel-primary">
				<div class="panel-body">
					<h3>
						<spring:message code="Title.EmployeeInfo"
							text="Employee Information" />
					</h3>
					<div class="table-responsive">
						<table class="table table-bordered table-striped">
							<tr>
								<td><spring:message code="Label.firstName" text="FirstName" /></td>
								<td>${employee.firstName}</td>
							</tr>
							<tr>
								<td><spring:message code="Label.lastName" text="LastName" /></td>
								<td>${employee.lastName}</td>
							</tr>
							<tr>
								<td><spring:message code="Label.dob" text="Date Of birth" /></td>
								<td>${employee.dob}</td>
							</tr>
							<tr>
								<td><spring:message code="Label.email" text="Email" /></td>
								<td>${employee.email}</td>
							</tr>
							<tr>
								<td><spring:message code="Label.gender" text="Gender" /></td>
								<td>${employee.gender}</td>
							</tr>
							<c:forEach items="${employee.addresses}" var="address"
								varStatus="stat">
								<tr>
									<th colspan="2">${address.addressType}</th>
								</tr>
								<tr>
									<td><spring:message code="Label.addressLine"
											text="AddressLine" /></td>
									<td>${address.addressLine}</td>
								</tr>
								<tr>
									<td><spring:message code="Label.city" text="City" /></td>
									<td>${address.city}</td>
								</tr>
								<tr>
									<td><spring:message code="Label.zip" text="Zip" /></td>
									<td>${address.zip}</td>
								</tr>
								<tr>
									<td><spring:message code="Label.state" text="State" /></td>
									<td>${address.state}</td>
								</tr>
								<tr>
									<td><spring:message code="Label.country" text="Country" /></td>
									<td>${address.country}</td>
								</tr>
							</c:forEach>
							<tr>
								<td colspan="2">&nbsp;</td>
							</tr>
							<tr>
								<td><spring:message code="Label.hireDate" text="Hire Date" /></td>
								<td>${employee.hireDate}</td>
							</tr>
							<tr>
								<td><spring:message code="Label.salary"  text="Salary" /></td>
								<td>${employee.salary}</td>
							</tr>
							
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>