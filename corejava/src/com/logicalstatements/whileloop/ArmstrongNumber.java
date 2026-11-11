package com.logicalstatements.whileloop;

import java.util.Scanner;

//2. Write a Java program to check whether a number is an Armstrong number or not?
//Input : Enter a number: 153
//Ouput: 153 is an Armstrong Number
//An Armstrong Number is a number that is equal to the sum of its digits, where each digit is 
//raised to the power of the total number of digits
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		int count=0;
		int n1=n;
		int sumpow=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
		}
		while(n1>0) {
		 r=n1%10;
		 n1=n1/10;
		 sumpow+=(int) Math.pow(r, count);
		 
	}
		if(temp==sumpow) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}
		
		

}
}




