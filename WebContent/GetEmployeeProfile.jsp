<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="EmpHomePage.jsp"></jsp:include>

	<center>
	<h3 style="margin-top: 30px;"><u>My Profile</u></h3>
		<table class="table" id="emp-table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Salary</th>
					<th scope="col">LoginId</th>
					<th scope="col">Password</th>
					<th></th>
				</tr>
			</thead>

			<tr>
				<th scope="row">${employee.empId   }</th>
				<td>${employee.empName}</td>
				<td>${employee.empSalary}</td>
				<td>${employee.loginID}</td>
				<td>${employee.password}</td>
				<td><a href='ChangeEmployeePwd.jsp'>Change Password</a></td>
			</tr>
		</table>

	</center>

</body>
</html>