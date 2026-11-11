package com.oops.inheritance;

// PartTimeEmployee is a child class of EmployeeData
public class PartTimeEmployee extends EmployeeData {

	PartTimeEmployee(int employeeId, String employeeName, double basicSalary) {

		// Initialize parent class variables
		super(employeeId, employeeName, basicSalary);
	}

	// Part-time employee has only allowance
	@Override
	double calculateSalary() {

		// Allowance = 5% of basic salary
		double allowance = basicSalary * 0.05;

		// Net Salary = Basic Salary + Allowance
		return basicSalary + allowance;
	}
}