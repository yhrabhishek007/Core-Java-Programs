package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileIODemo4 {

	public static void main(String[] args) throws IOException {

		// Print a message when the main method starts
		System.out.println("main method strated");

		// Create FileWriter to write data into the file
		FileWriter fw = new FileWriter(
				"C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test2\\FileIo.txt");

		// Write ASCII value 65, which represents 'A'
		fw.write(65);

		// Write a new line
		fw.write('\n');

		// Write character 'A'
		fw.write('A');

		// Write a new line
		fw.write('\n');

		// Write character 'F'
		fw.write('F');

		// Write a new line
		fw.write('\n');

		// Write a complete String
		fw.write("File IO Topic");

		// Close FileWriter and save the data
		fw.close();
	}
}
