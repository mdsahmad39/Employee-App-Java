 package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.dto.Employee;

public class EmployeeDAO {
	public Employee getEmployee(String loginId, String password) {
		Connection conn = null;
		String SELECT = "select * from Employee where loginId = ? and password = ?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setString(1, loginId);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpSalary(rs.getDouble(3));
				employee.setLoginID(rs.getString(4));
				employee.setPassword(rs.getString(5));
				return employee;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	public int register(Employee employee) {
		int result = 0;
		Connection conn = null;
		String INSERT = "insert into employee values(?,?,?,?,?);";
		PreparedStatement pst = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(INSERT);
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setDouble(3, employee.getEmpSalary());
			pst.setString(4, employee.getLoginID());
			pst.setString(5, employee.getPassword());
			
			result = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<Employee> getAllEmployees() {
		Connection conn = null;
		String SELECT = "select * from Employee";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			pst = conn.prepareStatement(SELECT);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpSalary(rs.getDouble(3));
				employee.setLoginID(rs.getString(4));
				employee.setPassword(rs.getString(5));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empList;
	}

	public Employee getEmployeeById(int empId) {
		Connection conn = null;
		String SELECT = "select * from Employee where empid=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpSalary(rs.getDouble(3));
				employee.setLoginID(rs.getString(4));
				employee.setPassword(rs.getString(5));
				return employee;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int UpdateEmployee(Employee employee) {
		int result = 0;
		Connection conn = null;
		String INSERT = "update employee Set empName=?, salary=? where empId=?;";
		PreparedStatement pst = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(INSERT);
			pst.setString(1, employee.getEmpName());
			pst.setDouble(2, employee.getEmpSalary());
			pst.setInt(3, employee.getEmpId());
			
			result = pst.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int deleteEmployee(int empId) {
		int result = 0;
		Connection conn = null;
		String INSERT = "delete from employee where empid=?;";
		PreparedStatement pst = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(INSERT);
			pst.setInt(1, empId);
			
			result = pst.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int changeEmpPwd(String loginId, String password) {
		int result = 0;
		Connection conn = null;
		String INSERT = "update employee Set password=? where loginId=?;";
		PreparedStatement pst = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(INSERT);
			pst.setString(1, password);
			pst.setString(2, loginId);
			
			result = pst.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
