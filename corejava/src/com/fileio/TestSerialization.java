package com.fileio;

//Def ->
//Serialization is the process of converting a Java object into a byte stream 
//so that the object's state can be stored in a file or transmitted over a network.

//What is serialVersionUID?
//Interview definition:
//
//serialVersionUID is a unique version identifier for a Serializable class. It is used during deserialization to verify that the serialized object and the current class version are compatible.
//
//Example:
//
//private static final long serialVersionUID = 1L;
//
//If the serialized object's class version is incompatible with the current class, Java can throw:
//
//InvalidClassException


// Import File class to represent the file path
import java.io.File;

// Used to write bytes into the file
import java.io.FileOutputStream;

// Used for handling input/output exceptions
import java.io.IOException;

// Used to convert an object into a byte stream
import java.io.ObjectOutputStream;

// Marker interface that allows an object to be serialized
import java.io.Serializable;

//Employee class implements Serializable
// This allows Employee objects to be converted into a byte stream
class Employee implements Serializable {
	// Employee data
	String name = "Abhishek";
	
//	Is transient data serialized?
//	No. A field marked transient is skipped during serialization.
	
//	If we take transient keyword with String datatype --> output NUll
//	If we take transient keyword with Int datatype --> output 0
	transient String password = "Abhi123";
}

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Creating an Employee object
		Employee emp = new Employee();

		// Creating a File object with the location where
		// the serialized object will be stored
		File f = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\Serialization.txt");

		// FileOutputStream is used to write data into the file
		FileOutputStream fos = new FileOutputStream(f);

		// ObjectOutputStream converts the Java object
		// into a byte stream and writes it to the file
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Serialize the Employee object
		// The emp object's data will be converted into bytes
		// and stored inside Serialization.txt
		oos.writeObject(emp);

		// Close ObjectOutputStream
		oos.close();

		// Close FileOutputStream
		fos.close();

		// Display confirmation message
		System.out.println("Serialization completed");

		// serialization code here
	}
}
