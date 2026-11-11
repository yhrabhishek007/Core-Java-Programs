package com.methods;

import java.util.Scanner;

//Employee Management System
//Methods With Return Type and With Arguments (50)
//Personal Details
//getEmployeeFullName()
//getEmployeeInitials()
//calculateEmployeeAge()
//checkAdultEmployee()
//generateEmployeeEmail()
//generateEmployeeUsername()
//validatePhoneNumber()
//validateEmail()
//getNationality()
//checkPassportValidity()
public class MethodsWrWa {

	public static void main(String[] args) {
		MethodsWrWa m = new MethodsWrWa();
//		System.out.println("Employee Personal Details:");
////		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter employee name:");
//		String name1=sc.nextLine();
//		System.out.println("Employee name is:" +name1);
////		Method calling using scanner class 
//		
//		String result = m.getEmployeeInitials("");
//		System.out.println("Employee Initial: " + result);		
//		
		System.out.println(m.calculateEmployeeAge(30));
		

	}
	String getEmployeeFullName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name1=sc.nextLine();
		System.out.println("Employee name is:" +name1);
		return name1;
	}
	String getEmployeeInitials(String initial) {
		System.out.println("Enter employee initial:");
		Scanner sc = new Scanner(System.in);
		String initials=sc.nextLine();
		return initials;
		
//		String getEmployeeInitials(String initial) {
//		    System.out.println("Enter employee initial:");
//		    Scanner sc = new Scanner(System.in);
//		    String initials = sc.nextLine();
//		    return initials;

	}//confusion
	int calculateEmployeeAge(int age) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee age is:" +age);
		System.out.println("Enter employee age:");
		int age1=sc.nextInt();
		System.out.println("Employee age is:"+age1);
		return age;
	}

	

}
