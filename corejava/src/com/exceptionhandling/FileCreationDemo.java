package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

    public static void main(String[] args) throws IOException{

        System.out.println("main method started");

        // If we specify an invalid path, createNewFile() may throw IOException

        // File class is used to represent a file or directory path
        // createNewFile() creates a new file if it does not already exist

        File f = new File("C:\\Users\\Lapcarts Electronics\\Desktop\\java\\Abhi1.txt");

        // createNewFile() throws IOException, which is a checked exception
        // Therefore, it must be handled using try-catch or declared using throws

//        scenario 2
//    java.io.IOException: The system cannot find the path specified --> Runtime 
        try {

//        	Scenario 1
//        	when we don't use try catch and throws then compiler will throw this exception
            f.createNewFile(); //Unhandled exception type IOException --> compiler 

        } catch (IOException e) {

            // Prints the exception details
            e.printStackTrace();
        }

        System.out.println("Main method ended");
    }
}