package com.multithreading;

public class MyThread2 implements Runnable {

	public static void main(String[] args) {

		System.out.println("main method started");

		MyThread2 m2 = new MyThread2();
		
//		A Runnable object does not have a start() method. The start() method belongs to the Thread class.
//		Compile Time Error
//		There is no 
//		m2.start();
		
		Thread t = new Thread(m2);
		t.start();

		for (int i = 0; i < 20; i++) {
			System.out.println("main ");
		}
		System.out.println("main method ended");

	}

	@Override
	public void run() {

		System.out.println("run method started");

		for (int i = 0; i <= 10; i++) {
			System.out.println("run");
		}

		System.out.println("run method ended");

	}
//	Which is better: extending Thread or implementing Runnable?
	
//	I prefer Runnable because it separates the task from the thread, follows better object-oriented design, allows my class to extend another class,
//	and provides better reusability and flexibility
	
//	implements Runnable is generally preferred over extends Thread. --->
//	The main reason is that Java supports single inheritance. If our class extends Thread, it cannot extend any other class. 
//	But if we implement Runnable, our class can still extend another class.

}

//RecruitEasy - job portal system
//Payrol system --> 
//student m s  --> Tech Stack:Java , Spring Boot , MySql , Html , css
//Banking m s --> core java , jdbc , servlets , MySql , Html , css
