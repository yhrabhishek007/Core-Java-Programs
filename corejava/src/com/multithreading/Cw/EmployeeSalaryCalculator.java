package com.multithreading.Cw;

//Main Thread

//|
//|-- Create Employee Thread 1 → Calculate Salary 1
//|
//|-- Create Employee Thread 2 → Calculate Salary 2
//|
//|-- Create Employee Thread 3 → Calculate Salary 3
//|
//|-- ...
//|
//|-- join(Thread 1)  ← wait
//|-- join(Thread 2)  ← wait
//|-- join(Thread 3)  ← wait
//|
//↓
//All calculations completed
//|
//↓
//Add all salaries
//|
//↓
//Display Total Salary

public class EmployeeSalaryCalculator extends Thread {

	String name;
	double basicSalary;
	double bonus;
	double calculateSal;

	@Override
	public void run() {

		System.out.println(name);
		calculateSal = basicSalary + bonus;
		System.out.println(calculateSal);

	}

	public static void main(String[] args) {

		EmployeeSalaryCalculator e = new EmployeeSalaryCalculator();

		e.name = "Rajesh";
		e.basicSalary = 55000.00;
		e.bonus = 10000.00;

		EmployeeSalaryCalculator e1 = new EmployeeSalaryCalculator();

		e1.name = "Rakesh";
		e1.basicSalary = 75000.00;
		e1.bonus = 10000.00;

		EmployeeSalaryCalculator e2 = new EmployeeSalaryCalculator();

		e2.name = "Bhanu";
		e2.basicSalary = 95000.00;
		e2.bonus = 10000.00;

		e.start();
		e1.start();
		e2.start();

		try {
			e.join();
		} catch (InterruptedException e3) {
			e3.printStackTrace();
		}

		try {
			e1.join();
		} catch (InterruptedException e3) {
			e3.printStackTrace();
		}

		try {
			e2.join();
		} catch (InterruptedException e3) {
			e3.printStackTrace();
		}

		double total = e.calculateSal + e1.calculateSal + e2.calculateSal;
		System.out.println("Total Salary: " + total);

	}

}
