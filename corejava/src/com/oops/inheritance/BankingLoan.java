package com.oops.inheritance;
//Srikanth sir model
import java.util.Scanner;

public class BankingLoan {

	static Scanner sc = new Scanner(System.in);

	String getCustomer() {
		System.out.println("Enter Your Name:");
		String name = sc.next();
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

	boolean isValidPhone() {
		System.out.println("Enter Your Phone:");
		String phone = sc.next();
		boolean isValid = phone.matches("^[6-9][0-9]{9}");
		return isValid;
	}

	boolean isValidAadhar() {
		System.out.println("Enter Your Aadhar:");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("^[2-9][0-9]{11}");
		return isAadharValid;
	}

	boolean isPanValid() {
		System.out.println("Enter Your Pan:");
		String pan = sc.next();
		boolean isPanValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isPanValid;
	}

}
