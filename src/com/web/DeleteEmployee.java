package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dto.Employee;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("empId"));
		
		EmployeeDAO empDAO = new EmployeeDAO();
		int result = empDAO.deleteEmployee(empId);
		
		if(result>0) {
			RequestDispatcher rd = request.getRequestDispatcher("GetEmployees");
			rd.forward(request, response);
		} else {
			//cant delete
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
