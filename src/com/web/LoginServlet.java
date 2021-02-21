package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmployeeDAO;
import com.db.MyConnection;
import com.dto.Employee;


@WebServlet("/LoginServlet") //annotation
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String loginId = request.getParameter("loginid");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("loginId", loginId);
		
		out.print("<html>");
		if(loginId.equalsIgnoreCase("HR") && password.equalsIgnoreCase("HR")) {
			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.forward(request, response);
		}
		if(loginId.equalsIgnoreCase("PM") && password.equalsIgnoreCase("PM")) {
			RequestDispatcher rd = request.getRequestDispatcher("PmHomePage.jsp");
			rd.forward(request, response);
		}
		else {
			EmployeeDAO employeeDAO = new EmployeeDAO();
			Employee employee = employeeDAO.getEmployee(loginId, password);
			session.setAttribute("employee", employee);
			
			if(employee != null) {
				RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage.jsp");
				rd.forward(request, response);
			}
			else {
				out.print("<body bgcolor=#d2d1d1 text=red>");
				out.print("<h1>please check the given credentials or user doesn't exist</h1>");
				out.print("</body>");
			}
		}
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
