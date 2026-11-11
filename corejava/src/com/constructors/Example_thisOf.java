package com.constructors;

public class Example_thisOf {
	int rno;
	String name;
	String branch;
	int marks;
	String year;
	
//	this()---> must be the first statement inside a constructor.
//	ex : this()
//	after we can write print statements , if we give print statements first then it will be called 2 times
	
//	Difference Between this and this()
//	this                              	this()
//	Refers to current class data object	     Calls another constructor
//	Used with variables/methods	 Used only inside constructors

	public Example_thisOf(int rno, String name, String branch, int marks, String year) {
		this.rno=rno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
		this.year=year;
		System.out.println("5-Arg Parameterized constructor");
		

	}
	
	public Example_thisOf(int rno, String name, String branch, int marks) {
//		super();
		this(rno,name,branch,marks,"4th");//it is accepting only the values from the parameters which 
//		we have not assigned or declared in this method ex:i had not given year so i should pass value
//		ex: not year but value--"4th ore 3rd"
		System.out.println("4-Arg constructor with 5 parameters");
		
	}
	

	public Example_thisOf(int rno, String name, String branch) {
//		super();
		this(rno,name,branch,96,"4th");
		System.out.println("3-Arg constructor with 5 parameters");

	}
	
	

	public Example_thisOf(int rno, String name) {
//		super();
		this(rno,name,"Ai&Ds",99,"4th");
		System.out.println("2-Arg constructor with 5 parameters");

	}
	

	public Example_thisOf(int rno) {
//		super();
		this(rno,"Vijay","ECM",100,"4th");
		System.out.println("1-Arg constructor with 5 parameters");

	}
	
	

	public Example_thisOf() {
//		super();
		this(106,"Arjun","MECH",98,"4th");
		System.out.println("No-Arg constructor with 5 parameters");

	}
	

//	public Example_thisOf(int rno, String name, String branch, int marks, String year) {
//		
//	It will show error because we have created 5 constructors for 5 parameters so we can not create 
//		
//	}

	void studentInfo() {
		System.out.println("Student Roll Number:"+rno);
		System.out.println("Student Name:"+name);
		System.out.println("Student Branch:" +branch);
		System.out.println("Student Marks:" +marks);
		System.out.println("Student Year:" +year);
		System.out.println("--------------------------------->");
	}

	public static void main(String[] args) {
		System.out.println("Academic Toppers list:");
		System.out.println("-------------------------------------->");
		Example_thisOf a = new Example_thisOf(100,"Varun","CIVIL",94,"4th");
		a.studentInfo();
		
		Example_thisOf e = new Example_thisOf(101, "Ravi", "ECE", 98, "4th");
		e.studentInfo();
		Example_thisOf e1 = new Example_thisOf(103,"Raju","EEE",99);
		e1.studentInfo();
		Example_thisOf e2 = new Example_thisOf(103, "Ramesh", "CSE");  //just give the same parameters we
//		as we given in constructor remaining it will print automatically
		e2.studentInfo();
		Example_thisOf e3 = new Example_thisOf(104,"Praveen");
		e3.studentInfo();
		Example_thisOf e4 = new Example_thisOf(105);
		e4.studentInfo();
		
		Example_thisOf e5 = new Example_thisOf();
		e5.studentInfo();




	}

}
