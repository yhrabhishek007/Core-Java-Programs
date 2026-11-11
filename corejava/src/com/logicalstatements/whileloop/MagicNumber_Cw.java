package com.logicalstatements.whileloop;

import java.util.Scanner;

//check if a number is magic number or not.
public class MagicNumber_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		
		checkMagic(n);
		
		
	}
 static void checkMagic(int n) {
	 while(n>9) {
		 int sum=0;
		 while(n>0) {
			int rem=n%10;
			 n=n/10;
			 sum+=rem;
			 
		 }
		 n=sum;
		 
	 }
	 if(n==1) {
		 System.out.println("Magic Number");
	 }else {
		 System.out.println("Not a Magic Number");
	 }
	 
	}

}
