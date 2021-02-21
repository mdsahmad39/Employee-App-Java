package com.dto;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String loginID;
	private String password;

	public Employee() {
	}

	public Employee(int empId, String empName, double empSalary, String loginID, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.loginID = loginID;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empID) {
		this.empId = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", loginID=" + loginID
				+ ", password=" + password + "]";
	}

}
