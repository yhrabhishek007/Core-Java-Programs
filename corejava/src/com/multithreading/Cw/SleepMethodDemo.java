package com.multithreading.Cw;
//2)Write a program to demonstrate the sleep() method by printing numbers from 1 to 5 with 

//a delay of one second.

public class SleepMethodDemo extends Thread {

	public static void main(String[] args) {

		System.out.println("Main method started");

		SleepMethodDemo t = new SleepMethodDemo();

		t.start();

	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
