package com.oops.encapsulation;

import java.util.Scanner;

public class TestStudentDetails {

	public static void main(String[] args) {
		System.out.println("Student Marks Report");
		Scanner sc = new Scanner(System.in);
		StudentDetails sd = new StudentDetails();

		System.out.println("Enter student Id:");

		int id = sc.nextInt();
		System.out.println("Enter student name:");
		String name = sc.next();
		System.out.println("Student marks:");
		double marks = sc.nextDouble();

		sd.setSid(id);
		sd.setName(name);
		sd.setMarks(marks);
		System.out.println("Student Id:" + sd.getSid());
		System.out.println("Student Name:" + sd.getName());
		System.out.println("Student Overall Marks:" + sd.getMarks());

		sc.close();

	}

}
