package com.conditionalstatements;

import java.util.Scanner;

public class AgeDescription {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		if(age>=0 && age<=5) {
			System.out.println("Kids");
			
		}
		else if(age>5 && age<=12) {
			System.out.println("Childers");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen age");
		}
		else if(age>=20 && age<=35) {
			System.out.println("Young Age");
		}
		else if(age>35 && age<=60) {
			System.out.println("Middle Age");
		}
		else if(age>60 && age<=150) {
			System.out.println("Senior citizen");
		}
		else {
			System.out.println("Please enter a valid age");
		}
		
	}

}
