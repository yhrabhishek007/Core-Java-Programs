package com.logicalstatements;


//Write a Java program to print all lower case alphabets?
public class LowerCase_forCw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
//		char c=sc.next().charAt(0); -->if we are not taking any value from user then it is unnecessary
		
		toLowerCase();

	}

	 static void toLowerCase() {
		 System.out.println("Printing all LowerCase Letters:");
		 
		 for(char c1=97;c1<=122;c1++ ) {
			 System.out.println(c1);
			 
		 }

		
	}

}
