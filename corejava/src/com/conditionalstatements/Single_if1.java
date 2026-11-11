package com.conditionalstatements;

import java.util.Scanner;
//Interview point: Without {}, an if, else, for, while, etc. controls only the immediately following statement. 
//Using braces is generally recommended to avoid confusion.
public class Single_if1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Main method started");
		System.out.println("Enter age:");
		int age = sc.nextInt();

		// Interview Point:
		// Without curly braces {}, an if statement controls
		// only the immediately following statement.

		if (age > 30)
			System.out.println("Age greater than 30");
			// This statement executes only when age > 30

		// These statements are NOT part of the if block.
		// They execute regardless of whether the condition is
		// true or false.

		System.out.println("Hello ");
//		else  //-----> if we put else then we can not give more then one value it will show CE
		System.out.println("Age not greater than 30");

	}

}




//Braces {} are optional only when there is exactly one statement
//in the if block or else block.

//if without braces -> controls one statement
//else without braces -> controls one statement

//if(condition)
// statement1;
//else
// statement2;


//Multiple Statements? Use Braces
//
//❌ Wrong:
//
//if (age >= 18)
//    System.out.println("Eligible");
//    System.out.println("Can Vote");
//else
//    System.out.println("Not Eligible");
//
//This gives a compile-time error:
//
//Syntax error on token "else", delete this token

//
//Valid Example
//int age = 20;
//
//if (age >= 18)
//    System.out.println("Eligible");
//else
//    System.out.println("Not Eligible");
//
//Output:
//
//Eligible