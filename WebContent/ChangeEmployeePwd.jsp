<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="EmpHomePage.jsp"></jsp:include>

	<div class="update-block">
		<form action="UpdateEmpPwd" method="post">

			<div class="form-group">
				<label for="loginId" class="text-uppercase">User ID :</label> <input
					type="text" name="loginId" value="${employee.loginID}" readonly
					class="form-control">
			</div>

			<div class="form-group">
				<label for="password" class="text-uppercase">Enter password
					:</label> <input type="text" name="password"
					placeholder="Enter new password..." class="form-control">
			</div>

			<br> <input class="btn btn-info" type="submit"
				value="Change Password">
		</form>
	</div>

</body>
</html>