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


@WebServlet("/UpdateEmpPwd")
public class UpdateEmpPwd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		EmployeeDAO employeeDAO = new EmployeeDAO();
		int result = employeeDAO.changeEmpPwd(loginId, password);
		
		if(result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("GetEmployeeProfile.jsp");
			rd.forward(request, response);
		} else {
			out.println("Record not avialable");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
