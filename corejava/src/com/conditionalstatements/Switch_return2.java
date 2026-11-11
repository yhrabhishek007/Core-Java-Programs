package com.conditionalstatements;

import java.util.Scanner;

public class Switch_return2 {


	    static String getStudentMarks(int marks) {

	        String grade = switch(marks / 10) {

	            case 9 -> "A";
	            case 8 -> "B";
	            case 7 -> "C";
	            case 6 -> "D";
	            case 5, 4 -> "Just Passed";
	            default -> "F";
	        };

	        return grade;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Marks: ");
	        int marks = sc.nextInt();

	        String grade = getStudentMarks(marks);

	        System.out.println(grade);
	    }
	}