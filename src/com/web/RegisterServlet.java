package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String loginId = request.getParameter("loginid");
		String password = request.getParameter("password");

		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSalary(empSalary);
		employee.setLoginID(loginId);
		employee.setPassword(password);

		EmployeeDAO employeeDAO = new EmployeeDAO();
		int result = employeeDAO.register(employee);

		if (result > 0) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Employee account created successfully</h1><br><br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
			out.print("</body>");
			out.print("</html>");
			
			
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
