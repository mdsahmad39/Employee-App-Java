package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TasksDAO;
import com.dto.Tasks;

@WebServlet("/AddEmployeeTask")
public class AddEmployeeTask extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("empId"));
		int taskId = Integer.parseInt(request.getParameter("taskId"));
		String taskDesc = request.getParameter("taskDesc");
		
		TasksDAO taskDAO = new TasksDAO();
		int result = taskDAO.createTask(empId, taskId, taskDesc);
		
		if(result > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeTasks?empId=" + empId);
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
