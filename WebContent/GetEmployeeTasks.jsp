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
		<h3 style="margin-top:30px;">Tasks Assigned to <u>${emp.empName}</u></h3> <span><a href="AddTask?empId=${emp.empId}">Assign Task</a></span>

			<table class="table" id="emp-table">
				<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Description</th>
					<th scope="col">Status</th>
					<th scope="col">Actions</th>
				</tr>
				</thead>

				<c:forEach var="task" items="${tasksList}">
					<tr>
						<th scope="row">${ task.taskId  }</th>
						<td>${ task.taskDesc }</td>
						<td>${ task.status }</td>
						<td><a href="UpdateTask?empId=${emp.empId}">Update</a></td>
					</tr>
				</c:forEach>



			</table>

		</center></body>
</html>