package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dao.TasksDAO;
import com.dto.Employee;
import com.dto.Tasks;

@WebServlet("/EmployeeTasks")
public class EmployeeTasks extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int empId = Integer.parseInt(request.getParameter("empId"));

		TasksDAO tasksDAO = new TasksDAO();			
		List<Tasks> tasksList = tasksDAO.getAllTasks(empId);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee employee = employeeDAO.getEmployeeById(empId);

		if(tasksList != null) {		
			request.setAttribute("tasksList", tasksList);
			request.setAttribute("emp", employee);
			RequestDispatcher rd = request.getRequestDispatcher("GetEmployeeTasks.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("PmHomePage.jsp");
			rd.include(request, response);
			
			out.print("<center>");
			out.print("<h3 style='color:red;'>Employee Task(s) Not Found!!!</h3>");
			out.print("<a href=\"AddTask?empId=${"+ empId + "}\">Assign Task</a>");
			out.print("</center>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
