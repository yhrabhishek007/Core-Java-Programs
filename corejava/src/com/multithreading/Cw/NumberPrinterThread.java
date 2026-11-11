package com.multithreading.Cw;

//Create a Java program to create a thread by extending the Thread class.
//Requirements:
//Create a class MyThread that extends Thread.
//Override the run() method.
//Print numbers from 1 to 10 inside run().
//Create an object of MyThread in main().
//Start the thread using start().
//Expected Output:
//1,2,3,4,5,6,7,8,9,10
public class NumberPrinterThread extends Thread {

	public static void main(String[] args) {

		NumberPrinterThread t = new NumberPrinterThread();

		t.start();

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
		}

	}

}
