package com.oops.encapsulation;

public class StudentDetails {

	private int sid;
	private String name;
	private double marks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
			System.out.println(marks);
		} else {
			System.out.println("Invalid Marks!!");
		}
	}

	public double getMarks() {

		return marks;

	}

}
