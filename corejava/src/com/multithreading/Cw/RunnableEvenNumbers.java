package com.multithreading.Cw;

//Create a Java program to create a thread by implementing the Runnable interface.
//Requirements:
//Create a class NumberTask that implements Runnable.
//Override the run() method.
//Print even numbers from 2 to 20.
//Create a Thread object using NumberTask.
//Start the thread using start().
public class RunnableEvenNumbers implements Runnable {

	public static void main(String[] args) {

		// Create an object of RunnableEvenNumbers
		RunnableEvenNumbers t = new RunnableEvenNumbers();
		// Runnable only provides the run() method.
		// It does not have the start() method.
		// Therefore, we create a Thread object using the Runnable object.
		Thread th = new Thread(t);
		// start() starts a new thread and then calls the run() method.
		th.start();
	}

	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
