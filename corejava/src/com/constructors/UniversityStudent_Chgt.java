package com.constructors;

public class UniversityStudent_Chgt {
	String name;
	double cgpa;
	int rollno;
	
	public UniversityStudent_Chgt() {
		this("Ajay");
		
	}
	UniversityStudent_Chgt(String name){
		this(name,8.30);
		
	}
	UniversityStudent_Chgt(String name,double cgpa){
		this(name,cgpa,90);
	}
		

	public UniversityStudent_Chgt(String name, double cgpa, int rollno) {
		 this.name = (name == null || name.isEmpty()) ? "Unknown" : name; 

	        this.cgpa = (cgpa < 0 || cgpa > 10) ? 0.0 : cgpa;

	        this.rollno = (rollno <= 0) ? 1 : rollno;
	}
	
	void studentInfo() {
		System.out.println("University Student Details");
		System.out.println("Student name:"+name);
		System.out.println("Student Cgpa:"+cgpa);
		System.out.println("Student rollno:"+rollno);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		UniversityStudent_Chgt c= new UniversityStudent_Chgt();
		c.studentInfo();
	}

}
