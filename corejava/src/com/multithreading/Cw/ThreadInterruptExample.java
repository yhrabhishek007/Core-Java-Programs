package com.multithreading.Cw;

//2.Write a Java program to:
//Create a thread that sleeps for 5 seconds
// Interrupt the thread before it completes sleep
// Print "Thread Interrupted" when interruption happens
public class ThreadInterruptExample extends Thread {

	public void run() {
		try {
			// Sleep for 5 seconds
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Print message when thread is interrupted
			System.out.println("Thread Interrupted");
		}
	}

	public static void main(String[] args) {

		// Create the thread
		ThreadInterruptExample thread = new ThreadInterruptExample();

		// Start the thread
		thread.start();

		// Interrupt the thread
		thread.interrupt();
	}
}