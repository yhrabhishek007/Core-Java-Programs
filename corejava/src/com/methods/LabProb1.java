package com.methods;

//Create a class Student with the fields - studentId, studentName,marks, static count
//Implement the following methods-
//1. No Arguments + No Return Type (Instance Method)
//displayWelcome()
//Print: "Welcome to Student Management System"
//2. Arguments + No Return Type (Instance Method)
//setStudentDetails(int id, String name, double marks)
//Store the values in object variables.
//3. No Arguments + Return Type (Instance Method)
//getMarks()
//Return: int marks
//4. Arguments + Return Type (Instance Method)
//calculateBonusMarks(int bonus)
//Return: updated marks after adding bonus marks.
//5. Static Method (No Arguments + No Return Type)
//displayCollegeName()
//Print the college name.
//6. Static Method (No Arguments + No Return Type)
//displayTotatlStudentsCount()
//Return: int count value



public class LabProb1 {
	int id;
	String name;
	double marks;
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		LabProb1 t = new LabProb1();
		t.welcome();
		t.setStudentDetails(1, "Bhargav", 90);
		int x=t.getMarks();
		t.calculateBonusMarks(7);
		System.out.println("Total Marks:" +(t.getMarks()+t.calculateBonusMarks(7)));

		displayCollegeName();
		displayTotatlStudentsCount();
		
	}
	void welcome() {
		System.out.println("Welcome to Student Management System");
	}

	void setStudentDetails(int id, String name, double marks) {
		System.out.println("Student Id is:" + id);
		System.out.println("Student name is:" + name);
		System.out.println("Student marks:" + marks);
	}

//3. No Arguments + Return Type (Instance Method)
	int getMarks() {
		int marks = 90;
//		System.out.println("Student Marks:"+marks);
		return marks;
	}
//4. Arguments + Return Type (Instance Method)
	int calculateBonusMarks(int bonus) {
//		int bon;
//		System.out.println("Bonus marks:" +bonus);
		return bonus;
	}
	//5. Static Method (No Arguments + No Return Type)
	static void displayCollegeName() {
		String name="VIGNAN";
		System.out.println("College name is:"+name);
	}
	//6. Static Method (No Arguments + No Return Type)
	static void displayTotatlStudentsCount() {
		System.out.println("Total student count:"+count);
	}
}


