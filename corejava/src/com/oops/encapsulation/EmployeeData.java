package com.oops.encapsulation;

public class EmployeeData {
	
	
	private int EmpId;
	private String EmpName;
	private double Salary;

	public void setId(int EmpId) {
		this.EmpId = EmpId;

	}

	public int getId() {
		return EmpId;

	}

	public void setName(String EmpName) {
		this.EmpName = EmpName;

	}

	public String getName() {
		return EmpName;

	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public double getSalary() {
		return Salary;
	}

}