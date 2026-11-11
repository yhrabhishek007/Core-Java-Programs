package com.multithreading.Cw;
//Core Java 

//
//Write a Java program to create three threads using the Thread class. The program should demonstrate the use of setName(), getName(), setPriority(), getPriority(), sleep(), yield(), and join().
//
//Requirements:-
//Create three threads:
//Thread 1 → DownloadThread
//Thread 2 → CalculationThread
//Thread 3 → DisplayThread
//Use setName() to assign names to all three threads.
//Use setPriority() to assign:
//DownloadThread → MAX_PRIORITY
//CalculationThread → NORM_PRIORITY
//DisplayThread → MIN_PRIORITY
//Use getName() and getPriority() to display each thread's name and priority.
//DownloadThread should print numbers 1 to 5. After printing each number, use sleep(1000).
//CalculationThread should print numbers 1 to 5. After printing each number, use sleep(500).
//DisplayThread should print numbers 1 to 5 and use yield() inside the loop.
//Use start() to start the threads.
//Use join() so that the main thread waits until DownloadThread and CalculationThread   finish before starting DisplayThread.
//Handle InterruptedException wherever required.

class DownloadThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

class CalculationThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " : " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class DisplayThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " : " + i);

			Thread.yield();
		}

	}

}

public class ThreadMethodsDemo {
	public static void main(String[] args) {

		DownloadThread dt = new DownloadThread();

		CalculationThread ct = new CalculationThread();

		DisplayThread pt = new DisplayThread();

		dt.setName("DownloadThread");

		ct.setName("CalculationThread");

		pt.setName("DisplayThread");

		dt.setPriority(Thread.MAX_PRIORITY);

		ct.setPriority(Thread.NORM_PRIORITY);

		pt.setPriority(Thread.MIN_PRIORITY);

		System.out.println(dt.getName());

		System.out.println(ct.getName());

		System.out.println(pt.getName());

		System.out.println(dt.getPriority());
		System.out.println(ct.getPriority());
		System.out.println(pt.getPriority());

		dt.start();
		ct.start();

		try {
			dt.join();
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		pt.start();

//		dt.start();
//
//		try {
//			dt.join();
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		ct.start();
//
//		try {
//			ct.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		pt.start();

	}

}
