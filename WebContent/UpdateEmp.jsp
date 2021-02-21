<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="HrHomePage.jsp" />

	<div class="update-block" style="margin-top:40px;">
		<form action="UpdateEmp" method="post">

			<div class="form-group">
				<label for="empId" class="text-uppercase">Employee ID :</label> <input
					type="text" name="empId" value="${emp.empId}" readonly
					class="form-control">
			</div>

			<div class="form-group">
				<label for="empName" class="text-uppercase">Enter Employee
					Name :</label> <input type="text" name="empName" value="${emp.empName}"
					class="form-control">
			</div>

			<div class="form-group">
				<label for="salary" class="text-uppercase">Enter Salary :</label> <input
					type="text" name="salary" value="${emp.empSalary}"
					class="form-control">
			</div>

			<div class="form-group">
				<label for="loginId" class="text-uppercase">Employee Login
					ID :</label> <input type="text" name="loginId" value="${emp.loginID}"
					readonly class="form-control">
			</div>

			<br> <input class="btn btn-info" type="submit"
				value="Update Employee">
		</form>
	</div>


</body>
</html>