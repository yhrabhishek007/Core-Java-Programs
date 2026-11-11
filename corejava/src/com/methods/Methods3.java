package com.methods;
import java.util.Scanner;
public class Methods3 {
	

	public static void main(String[] args) {	
		System.out.println("Student Details");
		Scanner sc = new Scanner(System.in);
		Methods3 m = new Methods3();
		System.out.println("Enter Student name:");
		String name=sc.nextLine();
		System.out.println("Student name is:"+name);	
		
//		m.getStudentName("Ajay");
		
		System.out.println("Enter student Id:");
		int id =sc.nextInt();
		System.out.println("Student Id is:"+id);
		
//		m.getStudentid(88);
		
//		System.out.println("Enter student age:");
//		int getSudentAge=sc.nextInt();
//		no parameters to print so just calling the method
//		System.out.println("Student age is:" +);
		
		int age = m.getStudentAge();
		System.out.println("Student age is:" +age);
		
		System.err.println("Student gender is:" +m.getStudentGender());
		
		System.out.println("Enter marks:");
		short marks = sc.nextShort();
		System.out.println("Student marks are:" +marks);
		
		
		
        
	}
//	Methods with out return type , with parameters:
	void getStudentName(String name) {
		System.out.println("Student name is :"+name);
	}
	void getStudentid(int id) {
		System.out.println("Student Id is:" +id);
	}
//	methods with return type , with out parameters:
	int getStudentAge() {
//		System.out.println("Student age is:");
		return 5;
	}
	char getStudentGender() {
//		System.err.println("Student gender is:");
		return 'M';
	}
//	Methods with return type , with parameters:
	short getStudentMarks(short marks) {
		System.out.println("Student marks are:" +marks);
		return 85;
	}
	

}
