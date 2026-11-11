package com.oops.inheritance;

import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking employee details from user

		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();

		System.out.println("Enter Employee Name:");
		String name = sc.next();

		System.out.println("Enter Employee Type (Full-Time/Part-Time/Contract):");
		String type = sc.next();

		System.out.println("Enter Basic Salary:");
		double salary = sc.nextDouble();

		// Parent class reference
		// It can store object of any child class
		EmployeeData employee;

		// Creating object based on employee type

		if (type.equalsIgnoreCase("Full-Time")) {

			// EmployeeData reference pointing to FullTimeEmployee object
			employee = new FullTimeEmployeeData(id, name, salary);

		} else if (type.equalsIgnoreCase("Part-Time")) {

			employee = new PartTimeEmployee(id, name, salary);

		} else if (type.equalsIgnoreCase("Contract")) {

			employee = new ContractEmployeeData(id, name, salary);

		} else {

			System.out.println("Invalid Employee Type");
			sc.close();
			return;
		}

		System.out.println("\n----- Employee Details -----");

		// Calling parent method
		employee.displayDetails();

		// Runtime polymorphism:
		// Java decides which calculateSalary() method to call
		// based on the actual object created
		System.out.println("Net Salary: " + employee.calculateSalary());

		sc.close();
	}
}