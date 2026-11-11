package com.constructors;
import java.util.Scanner;

public class ParameterizedConstructor {
	static  Scanner sc = new Scanner(System.in);
	int id;
	String name;
	String course;
	double amount;
	
	ParameterizedConstructor(int id,String name, String course,double amount){
		System.out.println("Constructor called------->");
		System.out.println("Student ID:" +id);
		System.out.println("Student name:" +name);
		System.out.println("Student course name:" +course);
		System.out.println("Student fee amount:" +amount);

		
	}
//	void showDetails() {
//		System.out.println("Method Called-------->");
//		System.out.println("Student ID:" +id);
//		System.out.println("Student name:" +name);
//		System.out.println("Student course name:" +course);
//		System.out.println("Student fee amount:" +amount);
//	}
	

	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor(101,"Raju","JFS",27000);
//		p.showDetails();


		
		
	}

}
