package com.logicalstatements;
//Write a Java program to print all vowels in a lower case alphabets?
public class VowelsInLowerC_forCw {

	public static void main(String[] args) {

		System.out.println("Main method started");
		System.out.println("Printing only vowels in lower case alphabets");
		for(char c=97;c<=122;c++) {  // can also use for(char c='a';c<='z';c++)  using characters
			
			if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u') {
				System.out.println(c);
			}
		}
	}

}
