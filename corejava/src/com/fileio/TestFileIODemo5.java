package com.fileio;

//Easy interview answer
//BufferedWriter is used for efficient character-based writing using a buffer,
//while PrintWriter provides convenient methods like print(), println(), and printf() for writing formatted text.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter is a Java class used to write text to a file efficiently by storing data 
//temporarily in a buffer before writing it to the file.

public class TestFileIODemo5 {

//	FileReader    → Read characters
//	BufferedReader → Read text efficiently, readLine()
//
//	FileWriter    → Write characters
//	BufferedWriter → Write text efficiently
//
//	PrintWriter   → Convenient text/ formatted output

	public static void main(String[] args) throws IOException {

		System.out.println("main method started");

		// Create a FileWriter object to write data into FileIo.txt.
		// The 'true' means append mode, so new data will be added
		// at the end of the existing file instead of overwriting it.
		FileWriter fw = new FileWriter("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\FileIo.txt", true);

		// BufferedWriter helps to write data efficiently
		BufferedWriter bw = new BufferedWriter(fw);

		// Write the first line
		bw.write("Java is High Level");

		// Move to the next line
		bw.newLine();

		// Write the second line
		bw.write("Java is Platform Independent");

		// Move to the next line
		bw.newLine();

		// Write the third line
		bw.write("Java is Multithreaded");

		// Send all the buffered data to the file
		bw.flush();

		System.out.println("main method ended");

		bw.close();
	}
}
