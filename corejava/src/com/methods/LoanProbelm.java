package com.methods;

import java.util.Scanner;

//Beginner Level
//Create a loan account with a loan amount of ₹50,000. Display the loan amount.
//Write a method to calculate simple interest.
//Principal = ₹20,000
//Rate = 8%
//Time = 3 years
//si=p*r*t/100

public class LoanProbelm {
 static int la=50000;
	public static void main(String[] args) {
		LoanProbelm l = new LoanProbelm();
		System.out.println("Loan Amount: " +la);
		l.loanAccount();

	}
	double loanAccount() {
		System.err.println("Loan Account:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal:");
		double p=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter time:");
		double t=sc.nextDouble();
		double si=(p*r*t)/100;
		System.out.println("Simple interest is:"+ si);
		return si;
	}
	

}
