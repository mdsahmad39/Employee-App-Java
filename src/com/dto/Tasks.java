package com.dto;

public class Tasks {
	private int taskId;
	private int empId;
	private String taskDesc;
	private boolean status;

	public Tasks() {
		super();
	}

	public Tasks(int taskId, int empId, String taskDesc, boolean status) {
		super();
		this.taskId = taskId;
		this.empId = empId;
		this.taskDesc = taskDesc;
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tasks [taskId=" + taskId + ", empId=" + empId + ", taskDesc=" + taskDesc + ", status=" + status + "]";
	}

}
