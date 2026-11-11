package com.constructors;
import java.util.Scanner;
//1.Write a Java program to create a class called Student with variables id, name, and course.
//Create a no-argument constructor that assigns default values to all variables.
//Create a display() method to print the student details.
//Create an object using the no-arg constructor and display the output.
//		System.out.println("Enter student ID:");
//		int id=sc.nextInt();
//		System.out.println("Student ID is:" +id);
//		
//		System.err.println("Enter student name:" +name);
//		String name=sc.next();
//		System.out.println("Student name is:" +name);
//		
//		System.out.println("Enter student course:");
//		String course=sc.next();
//		System.out.println("Student course:" +course);
		

public class NoArgConstructor {
	
	{  //instance block
		System.out.println("Instance Block called");
	}
	static Scanner sc= new Scanner(System.in);
	int id;
	String name;
	String course;
	
	NoArgConstructor(){
//		reading values using scanner
		System.out.println("Enter student ID:");
		int id=sc.nextInt();
		System.out.println("Student ID is:" +id);
		
		System.out.println("Enter student name:");
		String name=sc.next();
		System.out.println("Student name is:" +name);
		
		System.out.println("Enter student course:");
		String course=sc.next();
		System.out.println("Student course:" +course);
		System.out.println("Counstructor called");
		
//		id=101;
//		name="vijay";
//		course="jfs";
//		System.out.println(id);   //also we can print here
//		System.out.println(name);
//		System.out.println(course);
		
	}

//	System.out.println("Enter student ID:");
//	int id=sc.nextInt();
//	System.out.println("Student ID is:" +id);
//	
//	System.err.println("Enter student name:" +name);
//	String name=sc.next();
//	System.out.println("Student name is:" +name);
//	
//	System.out.println("Enter student course:");
//	String course=sc.next();
//	System.out.println("Student course:" +course);
	

void display() {
//	NoArgConstructor n = new NoArgConstructor();
//	n.id=101;
//	n.name="Bhargav";
//	n.course="JFS";
//	System.out.println("Student ID:" +id);
//	System.out.println("Student ID:" +name);
//	System.out.println("Student ID:" +course);
	System.out.println("Enter student ID:");
	int id=sc.nextInt();
	System.out.println("Student ID is:" +id);
	
	System.out.println("Enter student name:");
	String name=sc.next();
	System.out.println("Student name is:" +name);
	
	System.out.println("Enter student course:");
	String course=sc.next();
	System.out.println("Student course:" +course);
	System.out.println("Method called");
	
}
	
	public static void main(String[] args) {
//		accessing data using scanner in main method
		NoArgConstructor n = new NoArgConstructor();
//		System.out.println("Enter student ID:");
//		int id=sc.nextInt();
//		System.out.println("Student ID is:" +id);
//		
//		System.out.println("Enter student name:");
//		String name=sc.next();
//		System.out.println("Student name is:" +name);
//		
//		System.out.println("Enter student course:");
//		String course=sc.next();
//		System.out.println("Student course:" +course);
//		System.out.println("Counstructor called");
		n.display();
		
}
}


//Object Creation Statement
//↓
//new ClassName()
//↓
//Memory allocated for object
//↓
//Instance variables get default values
//(int → 0, String → null, boolean → false, etc.)
//↓
//Instance variable initializers execute
//↓
//Instance initializer blocks execute
//↓
//Constructor executes
//↓
//Object reference assigned to variable
//↓
//Object is ready to use
