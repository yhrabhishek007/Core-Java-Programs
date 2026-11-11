package com.multithreading.Cw;

//Create a class MyThread that extends Thread.
//Requirements:
//Override the run() method.
//Set the thread name as "StudentThread" using setName().
//Display the thread name using getName().
//Print numbers from 1 to 5.
//Expected Output:
//Thread Name: StudentThread
//1,2,3,4,5
public class MyThread extends Thread {

	public static void main(String[] args) {

		MyThread t = new MyThread();

		t.setName("StudentThread");

		// getName() returns the name of the thread
		System.out.println("Thread Name: " + t.getName());

		t.start();

	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}

	}

}
