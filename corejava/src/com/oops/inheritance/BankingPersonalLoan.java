package com.oops.inheritance;

public class BankingPersonalLoan extends BankingLoan {

	public static void main(String[] args) {
		System.out.println("Welcome to HDFC Banking Loan");

		BankingPersonalLoan bp = new BankingPersonalLoan();

		boolean isValidPhone = bp.isValidPhone();
		boolean isValidAadhar = bp.isValidAadhar();
		boolean isValidPan = bp.isPanValid();

		if (isValidPhone && isValidAadhar && isValidPan) {
			String name = bp.getCustomer();
			System.out.println("Welcome to HDFC Banking Mr: " + name);
			double age = bp.getAge();
			double salary = bp.getCustomerSalary();
			double cibilScore = bp.cibilInfo();

			if ((age >= 21 && age <= 60) && (salary >= 50000) && (cibilScore >= 350 && cibilScore <= 900)) {
				System.out.println("Congratulations you are eligible for personal loan");
			} else {
				System.out.println("Criteria did not matched please try again later!!");
			}

		} else {
			System.out.println("Your are not eligible!!");
		}

	}

}
