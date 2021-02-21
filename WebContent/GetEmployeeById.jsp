<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpByIdJSP</title>
</head>
<body bgcolor=yellow text=blue>

	<jsp:include page="HrHomePage.jsp"></jsp:include>

	<center>

		<table class="table" id="emp-table">
			<thead class="thead-dark">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Salary</th>
				<th scope="col">LoginId</th>
			</tr>
			</thead>

			<tr>
				<th scope="row">${emp.empId   }</th>
				<td>${ emp.empName }</td>
				<td>${ emp.empSalary  }</td>
				<td>${ emp.loginID }</td>
			</tr>
		</table>

	</center>
</body>
</html>