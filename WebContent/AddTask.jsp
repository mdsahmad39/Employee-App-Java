<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Task</title>
</head>
<body>

	<jsp:include page="PmHomePage.jsp" />

	<div class="update-block">
		<form action="AddEmployeeTask" method="post">
			<div class="form-group">
				<label for="empId" class="text-uppercase">Employee ID :</label> <input
					type="text" name="empId" value="${emp.empId}" readonly
					class="form-control">
			</div>

			<div class="form-group">
				<label for="taskId" class="text-uppercase">Enter Task ID :</label> <input
					type="text" name="taskId" class="form-control">
			</div>

			<div class="form-group">
				<label for="taskDesc" class="text-uppercase">Enter Task
					Description :</label> <input type="text" name="taskDesc"
					class="form-control">
			</div>

			<input style="margin-top:10px;" class="btn btn-primary" type="submit" value="Assign Task">
		</form>
	</div>


</body>
</html>