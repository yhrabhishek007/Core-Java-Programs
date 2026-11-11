package com.oops.inheritance;

// FullTimeEmployee inherits EmployeeData
// It gets employeeId, employeeName, and basicSalary automatically
public class FullTimeEmployeeData extends EmployeeData {

	// Calling parent constructor using super()
	FullTimeEmployeeData(int employeeId, String employeeName, double basicSalary) {

		super(employeeId, employeeName, basicSalary);
	}

	// Overriding parent method
	// Full-time employees have HRA and DA benefits
	@Override
	double calculateSalary() {

		// HRA = 20% of basic salary
		double hra = basicSalary * 0.20;

		// DA = 10% of basic salary
		double da = basicSalary * 0.10;

		// Net Salary = Basic Salary + HRA + DA
		return basicSalary + hra + da;
	}
}