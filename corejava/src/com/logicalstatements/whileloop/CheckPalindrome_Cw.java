package com.logicalstatements.whileloop;

import java.util.Scanner;

//1. Write a Java program to check whether a number is a palindrome or not?

public class CheckPalindrome_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		checkPalindrome(n);
		sc.close();

	}

	 static void checkPalindrome(int n) {
		 int rev=0;
		 int original=n;
		 
		 while(n!=0) {
			 int lastNumber=n%10;
			 rev=rev*10+lastNumber;      //its adding if we give only rev=rev+lastNUmber  
//			 to return the digits same we should give (rev=rev*10+lastNumber;) 
			 n=n/10;   //loop iterates till n becomes 0
			 
			 
		 }
//		 System.out.println(original);//121
//		 System.out.println(rev);//121
		 if(original==rev) {
			 System.out.println("Number is palindrome");
		 }else {
			 System.out.println("Number is not palindrome");
		 }
		 

		 
	}

}
