package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo7 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method started");

		// Create a FileReader object to open the file for reading
		// FileReader reads the file character by character
		FileReader fr = new FileReader("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\FileIO2.txt");

		// Create a BufferedReader using the FileReader
		// BufferedReader helps us read the file efficiently, line by line
		BufferedReader br = new BufferedReader(fr);

		// Read the first line from the file
		// readLine() returns null when there is no more data to read
		String s = br.readLine();

		// Continue reading as long as s is not null
		while (s != null) {

			// Print the current line on the console
			System.out.println(s);

			// Read the next line from the file
			s = br.readLine();
		}

		// Close the BufferedReader after finishing reading
		br.close();

		// Close the FileReader
		fr.close();

		System.out.println("main method ended");

	}

}
