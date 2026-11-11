package com.conditionalstatements;

import java.util.Scanner;

//A-Z:65 to 90 , a-z:97 to 122 , 0-9:48 to 57 , special characters except:0 to 127 ---> 32 to 126
//Write a Java program to check whether a given character is Uppercase, Lowercase, Digit, Special Character?
public class LowerCaseOrUpperCase {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character:");
		char c = sc.next().charAt(0);
		if (c >= 65 && c <= 90) {
			System.out.println("Uppercase character is printed");

		}
		else if(c>=97 && c<=122) {
			System.out.println("Lowercase character is printed");
		}
		else if(c>=48 && c<=57) {
			System.out.println("Number is printed");
		}
		else{
			System.out.println("Special characteris printed");
		}
	}

}
