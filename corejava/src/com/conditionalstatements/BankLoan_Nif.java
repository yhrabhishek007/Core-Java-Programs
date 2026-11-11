package com.conditionalstatements;

import java.util.Scanner;

//3. Bank Loan Approval
//Fields
//Age
//Salary
//Credit Score
//Employment Status
//Existing Loans
//KYC Verification

public class BankLoan_Nif {

	public static void main(String[] args) {
		System.out.println("Welcome to SBI Bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age>=21) {
			System.out.println("You are eligible to take loan ,proceed further");
			System.out.println("Enter salary:");
			double sal=sc.nextDouble();
			if(sal>=25000 ){
				System.out.println("Your salary is matched , eligible to take loan");
				System.out.println("Enter Credit Score:");
				int cs=sc.nextInt();
				if(cs>=650 && cs<=1000) {
					System.out.println("Your credit score is perfectly matching,proceed for next step");
					System.out.print("Are you employed? (true/false): ");
					boolean employed = sc.nextBoolean();
					if(employed==true) {
						System.out.println("You are eligible for loan, proceed further");
						System.out.print("Do you have an existing loan? (Yes/No): ");
						String existingLoan = sc.next();
						if(existingLoan.equalsIgnoreCase("No")) {
							System.out.println("You are eligible to take loan, proceed further");
							System.out.print("KYC Status (Verified/Not Verified): ");
							String kyc = sc.next();
							if(kyc.equalsIgnoreCase("verified")) {
								System.out.println("Your Loan is sanctioned,Congratulations");
							}else {
								System.out.println("Kyc not verified , please verify kyc");
							}
						}else {
							System.out.println("You are not eligible to take loan,age not matching");
						}
					}else {
						System.out.println("You are currently not eligible for loan ,salary critera not matching");
					}
				}else {
					System.out.println("Your credit score is matching the criteria");
				}
			}else {
				System.out.println("You are not eligible , salary did not matched");
			}
		}else {
			System.out.println("You are not eligible to take loan");
		}
		
		sc.close();
		

		
	}

}
