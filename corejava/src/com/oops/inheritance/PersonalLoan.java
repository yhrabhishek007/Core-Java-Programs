package com.oops.inheritance;

public class PersonalLoan extends Loan {

	private double monthlySalary;
	private String employerName;
	private String employmentType;
	private int creditScore;
	private double existingLoanAmount;
	private String purposeOfLoan;

	public PersonalLoan(String loanId, String customerName, int customerId, double loanAmount, double interestRate,
			int loanTerm, String loanStatus, double emi, double monthlySalary, String employerName,
			String employmentType, int creditScore, double existingLoanAmount, String purposeOfLoan) {

		super(loanId, customerName, customerId, loanAmount, interestRate, loanTerm, loanStatus, emi);

		this.monthlySalary = monthlySalary;
		this.employerName = employerName;
		this.employmentType = employmentType;
		this.creditScore = creditScore;
		this.existingLoanAmount = existingLoanAmount;
		this.purposeOfLoan = purposeOfLoan;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getExistingLoanAmount() {
		return existingLoanAmount;
	}

	public void setExistingLoanAmount(double existingLoanAmount) {
		this.existingLoanAmount = existingLoanAmount;
	}

	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}

	public boolean checkEligibility() {

		if (monthlySalary >= 25000 && creditScore >= 350 && creditScore <= 900 && existingLoanAmount < 500000
				&& (employmentType.equalsIgnoreCase("salaried") || employmentType.equalsIgnoreCase("self-employed"))) {

			return true;
		}

		return false;
	}

	public double calculateEligibleAmount() {

		if (checkEligibility()) {
			return monthlySalary * 15;
		}

		return 0;
	}

	@Override
	public void displayLoanDetails() {

		super.displayLoanDetails();

		System.out.println("Monthly Salary: " + monthlySalary);
		System.out.println("Employer Name: " + employerName);
		System.out.println("Employment Type: " + employmentType);
		System.out.println("Credit Score: " + creditScore);
		System.out.println("Existing Loan Amount: " + existingLoanAmount);
		System.out.println("Purpose Of Loan: " + purposeOfLoan);
	}
}