package com.oops.inheritance;

import java.util.Scanner;

public class Loan {

	private String loanId;
	private String customerName;
	private int customerId;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private String loanStatus;
	private double emi;

	public Loan(String loanId, String customerName, int customerId, double loanAmount, double interestRate,
			int loanTerm, String loanStatus, double emi) {

		this.loanId = loanId;
		this.customerName = customerName;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.loanStatus = loanStatus;
		this.emi = emi;
	}

	public String getLoanId() {
		if (loanId.matches("[L]{1}[0-9]{11}")) {
			return loanId;
		} else {
			return "Invalid Loan Id";
		}

	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double calculateInterestRate() {

		if (loanAmount <= 50000) {
			interestRate = 10;
		} else if (loanAmount >= 50001 && loanAmount <= 200000) {
			interestRate = 11;
		} else {
			interestRate = 12;
		}

		return interestRate;
	}

	public double calculateEMI() {

		double monthlyRate = interestRate / (12 * 100);

		int months = loanTerm;

		emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

		return emi;
	}

	public void displayLoanDetails() {

		System.out.println("Loan ID: " + loanId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer ID: " + customerId);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Loan Term: " + loanTerm);
		System.out.println("Loan Status: " + loanStatus);
		System.out.println("EMI: " + emi);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Loan ID:");
		String loanId = sc.nextLine();

		sc.nextLine();

		System.out.println("Enter Customer Name:");
		String customerName = sc.nextLine();

		System.out.println("Enter Customer ID:");
		int customerId = sc.nextInt();

		System.out.println("Enter Loan Amount:");
		double loanAmount = sc.nextDouble();

		System.out.println("Enter Loan Term (months):");
		int loanTerm = sc.nextInt();

		// Personal Loan details

		System.out.println("Enter Monthly Salary:");
		double monthlySalary = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter Employer Name:");
		String employerName = sc.nextLine();

		System.out.println("Enter Employment Type:");
		String employmentType = sc.nextLine();

		System.out.println("Enter Credit Score:");
		int creditScore = sc.nextInt();

		System.out.println("Enter Existing Loan Amount:");
		double existingLoanAmount = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter Purpose Of Loan:");
		String purposeOfLoan = sc.nextLine();

		// Values calculated by program
		double interestRate = 0;
		String loanStatus = "Pending";
		double emi = 0;

		// Creating child class object
		PersonalLoan pl = new PersonalLoan(loanId, customerName, customerId, loanAmount, interestRate, loanTerm,
				loanStatus, emi, monthlySalary, employerName, employmentType, creditScore, existingLoanAmount,
				purposeOfLoan);

		// Calling parent class methods using child object
		pl.calculateInterestRate();

		pl.calculateEMI();

		// Checking eligibility
		if (pl.checkEligibility()) {

			pl.setLoanStatus("Approved");

			System.out.println("Loan Approved");
			System.out.println("Eligible Amount: " + pl.calculateEligibleAmount());

			pl.displayLoanDetails();

		} else {

			pl.setLoanStatus("Rejected");

			System.out.println("Loan Not Approved");

			pl.displayLoanDetails();
		}

		sc.close();
	}
}