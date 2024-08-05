package com.apro.lists.model;

public class Employee {
	public int employeeID;
	public String employeeName;
	public int employeeSalary;
	
	public Employee() {
		this.employeeID = 1000;
		this.employeeName = "Admin";
		this.employeeSalary = 100000;
	}
	public Employee(int employeeID, String employeeName, int employeeSalary) {
		this.employeeID = employeeID;
		this.employeeName =employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	
	public int getEmployeeId() {
		return employeeID;
	}
	public void setEmpID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmpName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmpSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
