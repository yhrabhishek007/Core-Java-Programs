package com.multithreading.Cw;

//1.Create two threads:

//Thread 1 prints numbers 1 to 5
//Thread 2 prints numbers 6 to 10
//Use join() so Thread 2 starts/continues only after Thread 1 finishes.

class NumberPrinter extends Thread {

	private int start;
	private int end;

	NumberPrinter(int start, int end) {
		this.start = start;
		this.end = end;

	}

	public void run() {
		for (int i = start; i <= end; i++) {
			System.out.println(i);

		}

	}

	class Thread2 {

		public void run() {
			for (int i = 6; i <= 10; i++) {
				System.out.println(i);
			}
		}
	}

}

public class ThreadJoinExample extends Thread {
	public static void main(String[] args) throws InterruptedException {

		Thread Thread1 = new NumberPrinter(1, 5);
		Thread thread2 = new NumberPrinter(6, 10);

		Thread1.start();

		Thread1.join(); // Wait for Thread 1 to finish

		thread2.start(); // Thread 2 starts after Thread 1 finishes
	}

}
