<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HR Home Page</title>
<!-- <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous"> -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body>
	<nav class="navbar">
		<h1 class="navbar-brand" id="nav-title">Employee Web Application</h1>
		<a class="btn btn-light" href="HrHomePage.jsp" id="btn-home">Home</a> <a
			class="btn btn-warning" href="Login.html" id="btn-logout">Log Out</a>
	</nav>

	<h1 id="title">Welcome to HR Home Page</h1>
	<h3 id="btn-block">
		<a type="button" class="btn btn-outline-primary  btn-lg"
			href='GetEmployees'>Get All Employees</a>&nbsp;&nbsp;<a type="button"
			class="btn btn-outline-primary  btn-lg" href='GetEmpById.jsp'>Get
			employee by ID</a>
	</h3>

	<!-- <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script> -->
	<script src="js/bootstrap.js"></script>
</body>
</html>