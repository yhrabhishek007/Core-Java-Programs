package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIODemo3 {

	public static void main(String[] args) throws IOException {

		// Create a File object with the file path
		File f = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\FileIo.txt");

		// FileReader is used to read data from the file
		// try-with-resources automatically closes the FileReader
		try (FileReader fr = new FileReader(f)) {

			// Read the first character from the file
			// read() returns -1 when the end of the file is reached
			int i = fr.read();

			// Keep reading until the end of the file
			while (i != -1) {

				// Convert the number into a character and print it
				System.out.print((char) i);

				// Read the next character
				i = fr.read();
			}
		}
	}
}
