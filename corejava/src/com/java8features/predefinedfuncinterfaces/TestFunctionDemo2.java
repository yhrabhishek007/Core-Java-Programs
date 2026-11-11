package com.java8features.predefinedfuncinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}
}

public class TestFunctionDemo2 {

	public static void main(String[] args) {

		Predicate<Student> p1 = (st) -> st.marks > 80;

		Function<Student, String> f1 = (st) -> {

			String grade = "";

			if (st.marks >= 90) {
				grade = "A";
			} else if (st.marks >= 80) {
				grade = "B";
			} else if (st.marks >= 70) {
				grade = "c";
			} else if (st.marks >= 60) {
				grade = "D";
			} else if (st.marks >= 35) {
				grade = "P";
			} else {
				grade = "F";
			}

			return grade;
		};

		Consumer<Student> c1 = (s) -> {
			System.out.println("Name of the student : " + s.name);
			System.out.println("Marks of the student : " + s.marks);
			System.out.println("Grade of the student : " + f1.apply(s));
			System.out.println("---------------------");
		};

		Student[] students = { new Student("Gill", 94), new Student("Rohit", 89), new Student("Virat Kohli", 68),
				new Student("Ruturaj", 58) };

		for (Student s : students) {
			if (p1.test(s)) {
				c1.accept(s);
			}
		}

	}

}
