package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		System.out.println("Main method started");

//		1) Unhandled exception type FileNotFoundException --> when we create object for FileReader
//		2) C:\\Users\\Lapcarts Electronics\\Desktop\\java\\Test\\Abhi.txt (The system cannot find the file specified)	

		FileReader fr = new FileReader("C:\\Users\\Lapcarts Electronics\\Desktop\\java\\Test\\Abhi.txt");

//				Unhandled exception type IOException --> also occurs exception when we try use read()
		int i = fr.read();

		while (i != -1) {

			Thread.sleep(200);
			System.out.print((char) i);
			i = fr.read();

		}

//		System.out.println(i);

//		
		System.out.println(" main method ended");
	}

}
