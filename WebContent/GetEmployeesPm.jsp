<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee, java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetEmployees</title>
</head>
<body bgcolor=yellow text=blue>

	<jsp:include page="PmHomePage.jsp"></jsp:include>

		<center>

			<table class="table" id="emp-table" style="width:35%;">
				<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Actions</th>
				</tr>
				</thead>
				<c:forEach var="emp" items="${empList}">
					<tr>
						<th scope="row">${ emp.empId   }</th>
						<td>${ emp.empName }</td>
						<td><a href="EmployeeTasks?empId=${emp.empId}">View / Add Tasks</a></td>
					</tr>
				</c:forEach>



			</table>

		</center>
		
		</body>
</html>