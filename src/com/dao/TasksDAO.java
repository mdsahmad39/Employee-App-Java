package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.dto.Employee;
import com.dto.Tasks;

public class TasksDAO {

	public List<Tasks> getAllTasks(int empId) {
		Connection conn = null;
		String SELECT = "select * from Tasks where empId=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		
		List<Tasks> tasksList = new ArrayList<Tasks>();
		
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Tasks tasks = new Tasks();
				tasks.setTaskId(rs.getInt(1));
				tasks.setEmpId(rs.getInt(2));
				tasks.setTaskDesc(rs.getString(3));
				tasks.setStatus(rs.getBoolean(4));
				tasksList.add(tasks);
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
		return tasksList;
	}

	public int createTask(int empId, int taskId, String taskDesc) {
		Connection conn = null;
		int result = 0;
		String SELECT = "insert into tasks(taskId, empId, taskDesc) values(?,?,?)";
		
		PreparedStatement pst = null;
		
		conn = MyConnection.getConnection();
		
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, taskId);
			pst.setInt(2, empId);
			pst.setString(3, taskDesc);
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

	public List<Tasks> getEmployeeTasks(int empId) {
		Connection conn = null;
		String SELECT = "select * from tasks where empId=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		List<Tasks> tasksList = new ArrayList<Tasks>();
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			while(rs.next()) {
				Tasks tasks = new Tasks();
				tasks.setTaskId(rs.getInt(1));
				tasks.setEmpId(rs.getInt(2));
				tasks.setTaskDesc(rs.getString(3));
				tasks.setStatus(rs.getBoolean(4));
				tasksList.add(tasks);
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
		return tasksList;
	}

	public List<Tasks> getEmployeeTasksUncompleted(int empId) {
		Connection conn = null;
		String SELECT = "select * from tasks where status=false and empId=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		List<Tasks> tasksList = new ArrayList<Tasks>();
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			while(rs.next()) {
				Tasks tasks = new Tasks();
				tasks.setTaskId(rs.getInt(1));
				tasks.setEmpId(rs.getInt(2));
				tasks.setTaskDesc(rs.getString(3));
				tasks.setStatus(rs.getBoolean(4));
				tasksList.add(tasks);
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
		return tasksList;
	}

	public List<Tasks> getEmployeeTasksCompleted(int empId) {
		Connection conn = null;
		String SELECT = "select * from tasks where status=true and empId=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		conn = MyConnection.getConnection();
		List<Tasks> tasksList = new ArrayList<Tasks>();
		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			while(rs.next()) {
				Tasks tasks = new Tasks();
				tasks.setTaskId(rs.getInt(1));
				tasks.setEmpId(rs.getInt(2));
				tasks.setTaskDesc(rs.getString(3));
				tasks.setStatus(rs.getBoolean(4));
				tasksList.add(tasks);
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
		return tasksList;
	}

}
