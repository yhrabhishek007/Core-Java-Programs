package com.oops.inheritance;

import java.util.Scanner;
//This class represents a loan application.
// Note: This is NOT inheritance because no extends keyword is used.
// This program mainly demonstrates class, object, methods, and method calling.

public class PersonalLoan1 {

	static Scanner sc = new Scanner(System.in);

	String getCustomerName() {
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		return name;
	}

	int getAge() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary:");
		double sal = sc.nextDouble();
		return sal;
	}

	int cibilInfo() {
		System.out.println("Enter your cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getRoi() {
		int cibil = cibilInfo();
		double roi = 12.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println(": High risk of loan rejection; indicates past defaults or poor repayment patterns.");
			return roi + 1.0;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println(
					"Approval is possible, but lenders may verify income stringently or charge slightly higher interest.");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Good credit health; considered a safe borrower by most banks.");
			return roi - 2.0;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Highest probability of loan and credit card approvals with the lowest interest rates.");
			return roi - 4.0;

		} else {
			System.out.println("Invalid cibil score");
			return roi;
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Sbi Banking Loan");
		PersonalLoan1 p1 = new PersonalLoan1();

		String name = p1.getCustomerName();
		System.out.println("Welcome to Sbi Banking Mr:" + name);
		double salary = p1.getCustomerSalary();
		double cibil = p1.cibilInfo();
		int age = p1.getAge();
		double roi = p1.getRoi();

		if (salary >= 800000 && (age >= 20 && age <= 60) && (cibil >= 350 && cibil <= 900)) {
			System.out.println("Congratulations !! you are eligible for Personal Loan");
			System.out.println("Your ROI is:" + roi);

		} else {
			System.out.println("Focus on your career ");
		}

	}

}
