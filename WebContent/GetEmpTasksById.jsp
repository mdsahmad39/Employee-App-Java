<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Employee, java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GetEmployees</title>
</head>
<body>

	<jsp:include page="EmpHomePage.jsp"></jsp:include>

	<center>
		<h3 style="margin-top: 30px;">
			<u>Assigned Task(s) - Uncompleted</u>
		</h3>

		<table class="table" id="emp-table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Description</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<c:forEach var="task" items="${uncomTasksList}">
				<tr>
					<th scope="row">${ task.taskId   }</th>
					<td>${ task.taskDesc }</td>
					<td><a class="btn btn-info"
						href="UpdateTask?empId=${emp.empId}">Update Status</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<h3 style="margin-top: 30px;">
			<u>Assigned Task(s) - Completed</u>
		</h3>

		<table class="table" id="emp-table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Description</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<c:forEach var="task" items="${comTasksList}">
				<tr>
					<th scope="row">${ task.taskId   }</th>
					<td>${ task.taskDesc }</td>
					<td><a class="btn btn-info"
						href="UpdateTask?empId=${emp.empId}">Update</a></td>
				</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>