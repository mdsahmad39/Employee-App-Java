<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="HrHomePage.jsp"></jsp:include>
	<div class="login-block">
	<form action="GetEmpById" method="post">
		<div class="form-group">
			<label for="empById" class="text-uppercase">Enter Employee
				ID:</label> <input type="text" name="empById" placeholder="ID..."
				class="form-control">
		</div>
		<br> <input class="btn btn-info" type="submit"
			value="Get Employee">
	</form>
	</div>
</body>
</html>