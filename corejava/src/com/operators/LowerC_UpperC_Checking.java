package com.operators;

import java.util.Scanner;

//Write a Java program to check whether a character is a lowercase alphabet using logical operators?

//Lowercase letters (a–z)
//ASCII range: 97 to 122
public class LowerC_UpperC_Checking {

	public static void main(String[] args) {

		System.out.println("Checking whether a character is a lowercase alphabet");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch = sc.next().charAt(0);
		if (ch>97 && ch<=122) {
			System.out.println("It is a Lowercase letter!!");
			
		}
		else {
			System.out.println("Not Lowercase letter");
		}
			
		
		
	}

}
