package com.conditionalstatements;

import java.util.Scanner;

//Check whether a student scored distinction (marks ≥ 75).
public class StudentMarks {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Marks Portal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks percentage:");
		double marks=sc.nextDouble();
		
		if (marks>100 || marks<0) {
			System.out.println("Please enter valid marks percentage");
		}
		else if(marks>=90 && marks<=100) {
			System.out.println("Grade A+");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("Grade B");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("Grade C");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Need improvement study well");
		}

		
	}

}
