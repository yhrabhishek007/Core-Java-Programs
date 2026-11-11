package com.conditionalstatements;

import java.util.Scanner;

public class SwithCase_New {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		switch(num) {
		case 7->{
			System.out.println("Sunady");  //with braces we can print more than one value
			System.out.println("Sunday is funday");	
		}
		case 1->System.out.println("Monday");
		case 2->System.out.println("Tuesday");
		case 3->System.out.println("Wednesday");
		case 4->System.out.println("Thursday");
		case 5->System.out.println("Friday");
		case 6->System.out.println("Saturday");
		
		default->System.out.println("Invalid entry");
		}
		

		
		    }
		
	}


