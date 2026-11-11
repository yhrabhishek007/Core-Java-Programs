package com.methods;

public class TypesOfMethods {
	
	int a = 10;
	int b = 20;

	void addition() {
		System.out.println("Addition of a and b is:" +(a+b)); //for addition we have to put parentheses either 
//		it wil take it as a string and will perform concatenation
	}
	void multiply() {
		System.out.println("Multiplication of a and b is :" + a*b);
	}
	
	void subtraction() {
		System.out.println("Subtraction of a and b is:" + (a-b)); //when we are following BODMAS rule then 
//		first addition is present so 
	}
	
	 void main(String[] args) {
		 
		 addition();
		 multiply();
		 subtraction();

		
	}

}
