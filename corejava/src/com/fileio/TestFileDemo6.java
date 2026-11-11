package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//BufferedWriter is used for efficient writing of character data using a buffer, 
//whereas PrintWriter is used for convenient writing of different types of data using methods like print(), println(), and printf().

//BufferedWriter
//↓
//write() + newLine()
//↓
//Efficient text writing
//
//
//PrintWriter
//↓
//print() + println() + printf()
//↓
//Easy / formatted writing

public class TestFileDemo6 {

	public static void main(String[] args) throws FileNotFoundException {

		// Print message when the main method starts
		System.out.println("main method started");

		// Create PrintWriter and connect it to the file
		// try-with-resources automatically closes PrintWriter
		try (PrintWriter pw = new PrintWriter("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\FileIo.txt")) {

			// Write an integer into the file
			pw.println(123);

			// Write a character into the file
			pw.println('F');

			// Write a String into the file
			pw.println("PrintWriter");

			// Write a float value into the file
			pw.println(123.5F);

			// Write a double value into the file
			pw.println(123.5);
		}

		// Print message when the main method ends
		System.out.println("main method ended");
	}
}
