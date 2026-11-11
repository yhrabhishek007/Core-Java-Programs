package com.oops.inheritance;

// Contract employee inherits EmployeeData
public class ContractEmployeeData extends EmployeeData {

	ContractEmployeeData(int employeeId, String employeeName, double basicSalary) {

		super(employeeId, employeeName, basicSalary);
	}

	// Contract employees get no extra benefits
	@Override
	double calculateSalary() {

		return basicSalary;
	}
}