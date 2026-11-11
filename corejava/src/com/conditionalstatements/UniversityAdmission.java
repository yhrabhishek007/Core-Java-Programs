package com.conditionalstatements;

import java.util.Scanner;

//5. University Admission
//Fields:
//Student Name
//Mobile Number
//Email
//Gender
//City/Location
//Course
//Percentage
//Entrance Exam
//Documents Uploaded
//Fee Paid
public class UniversityAdmission {

	public static void main(String[] args) {
		System.out.println("Welcome to Lovely Professional University");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println("Enter Mobile Number:");
		String num=sc.next();
		System.out.println("Enter Email:");
		String mail=sc.next();
		System.out.println("Are you male? (true/false)");
		boolean gen = sc.nextBoolean();
		System.out.println("Enter your current Location/City:");
		String city=sc.next();
		
		System.out.println("Enter Course:");
		String course = sc.nextLine();

		System.out.println("Enter Percentage:");
		double percentage = sc.nextDouble();
		sc.nextLine();

		System.out.println("Entrance Exam Qualified (Yes/No):");
		String exam = sc.nextLine();

		System.out.println("Documents Uploaded (Yes/No):");
		String documents = sc.nextLine();

		System.out.println("Fee Paid (Yes/No):");
		String fee = sc.nextLine();
		
		if (course.equalsIgnoreCase("CSE")) {
			
			if(percentage>=75) {
				System.out.println("Eligible");
			}
		}
		
		else {
			System.out.println("Course not availabe");
			
			sc.close();
		}

		
	}

}
