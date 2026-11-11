package com.oops.inheritance;

//1. Build a payroll system that accepts employee details (Employee ID, Employee Name, Employee Type, 

//and Basic Salary). Calculate the net salary based on the employee type using the following rules:
//* Full-Time Employee: Net Salary = Basic Salary + HRA (20%) + DA (10%)
//* Part-Time Employee: Net Salary = Basic Salary + Allowance (5%)
//* Contract Employee: Net Salary = Basic Salary (No additional benefits)
//Display the employee details along with the calculated net salary


//Parent class
//This class contains common properties and behaviors
//that every employee will have
public class EmployeeData {

	// Common employee data
	int employeeId;
	String employeeName;
	double basicSalary;

	// Constructor is used to initialize employee details
	EmployeeData(int employeeId, String employeeName, double basicSalary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	// Common method to display employee details
	void displayDetails() {

		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Basic Salary: " + basicSalary);
	}

	// This method can be overridden by child classes
	// Default salary calculation
	double calculateSalary() {

		return basicSalary;
	}
}