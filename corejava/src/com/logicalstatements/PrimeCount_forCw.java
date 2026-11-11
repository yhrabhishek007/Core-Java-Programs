package com.logicalstatements;
//2. Write a Java program to print all prime numbers between 1 and N?
//Input : Enter the value of N: 20
//Output: Prime numbers between 1 and 20 are: 2 3 5 7 11 13 17 19
import java.util.Scanner;

public class PrimeCount_forCw {

	 void main(String[] args) {
		 System.out.println("Main method started");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n = sc.nextInt();
		 int count=0;

		 for(int i=2;i<n;i++) {

			 if(n%i==0) {   //n%i==0 return false 
					count=0;

			 }
				 else {
//					count++;
				 }

			 }
		 System.out.println(count);



		 }

	 
}



