package com.java8features;

//Lambda Expressions vs Multithreading

public class TestJ8Demo4 {

	void welcome() {
		System.out.println("welcome method called");
	}

	public static void main(String[] args) {

		TestJ8Demo4 t1 = new TestJ8Demo4();
		t1.welcome();

		// Main method starts
		System.out.println("main method started");

		// Runnable is a functional interface
		// Lambda expression provides the implementation of run()
		Runnable m = () -> {

			// This code will run inside the new thread
			System.out.println("run method called");

			// Loop inside the new thread
			for (int i = 0; i <= 10; i++) {
				System.out.println("run : " + i);
			}
		};

		// Creating a Thread object and passing Runnable to it
		Thread t = new Thread(m);

		// Starting the new thread
		// It internally calls the run() method
		t.start();

		// This loop runs in the main thread
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		// Main method ends
		System.out.println("main method ended");
	}
}
