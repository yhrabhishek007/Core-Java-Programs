package com.multithreading;

//public class Thread
//extends Object
//implements Runnable

//A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple 
//threads of execution running concurrently.

//How many ways we can create thread 
//Two ways 
//1)extends
//2)implements runnable

//step1 : extends Thread.
//step2 : call the start() from Thread class.
//step3 : Override the run() method from Thread class

public class MyThread extends Thread {

//	Whenever the child class is not happy with the Parent class functionalities 
//	then go and create the same method with the same signature 
//	in the child class with the different behavior is the concept called Overriding.
	@Override
	public void run() {
		System.out.println("run method started");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("run " + i);
		}

		System.out.println("run method ended");
	}
	
	

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println(Thread.currentThread());

		MyThread m = new MyThread();
//		Causes this thread to begin execution
//		JVM calls the run method of this Thread
		m.start(); // start method is calling run method of this class(start is in Thread Class and
					// run is in runnable so Thread implements runnable)

		for (int i = 0; i < 10; i++) {
			System.out.println("main " + i);
		}

		System.out.println("main method ended");

//		void	run()	
//		When an object implementing interface Runnable is used to create a thread, starting the thread causes the object's 
//		run method to be called in that separately executing thread.

//		simply
//		A Runnable object contains the work to be done (run()), and when you call start() on a Thread associated with that object,
//		Java executes that run() method in a separate thread.
	}

}
//
//package com.multithreading;
//
///*
// * THREAD IN JAVA
// * --------------
// * A thread is a separate path of execution inside a program.
// *
// * Java allows multiple threads to run concurrently.
// *
// * There are two common ways to create a thread:
// *
// * 1. By extending the Thread class
// * 2. By implementing the Runnable interface
// *
// *
// * APPROACH 1: EXTENDING THREAD
// * ----------------------------
// *
// * Step 1: Create a class that extends Thread.
// * Step 2: Override the run() method.
// * Step 3: Create an object of our class.
// * Step 4: Call start() on that object.
// *
// * IMPORTANT:
// *
// * start() creates/starts a new thread.
// * The JVM then calls the run() method in that new thread.
// *
// * Do NOT directly call run() if you want a new thread.
// *
// *     m.start();  --> creates a new thread and executes run()
// *
// *     m.run();    --> normal method call, NO new thread is created
// */
//
//public class MyThread extends Thread {
//
//    /*
//     * run() contains the work that should be performed
//     * by this thread.
//     *
//     * We override run() because we want to provide our
//     * own implementation/behavior.
//     *
//     * Overriding means:
//     * The child class provides its own implementation
//     * of a method that already exists in the parent class.
//     */
//    @Override
//    public void run() {
//
//        System.out.println("run method started");
//
//        /*
//         * Thread.currentThread() returns the thread
//         * that is currently executing this code.
//         *
//         * Since this code is inside run(), after start()
//         * it will normally print the newly created thread.
//         */
//        System.out.println(Thread.currentThread());
//
//        /*
//         * This loop is executed by the newly created thread.
//         */
//        for (int i = 0; i < 10; i++) {
//            System.out.println("run " + i);
//        }
//
//        System.out.println("run method ended");
//    }
//
//    public static void main(String[] args) {
//
//        /*
//         * main() is executed by the main thread.
//         */
//        System.out.println("main method started");
//
//        /*
//         * currentThread() tells us which thread is
//         * currently executing this code.
//         *
//         * Here, it will be the "main" thread.
//         */
//        System.out.println(Thread.currentThread());
//
//        /*
//         * Create an object of MyThread.
//         *
//         * At this point, a new thread has NOT started yet.
//         */
//        MyThread m = new MyThread();
//
//        /*
//         * start() is inherited from the Thread class.
//         *
//         * Calling start():
//         *
//         * 1. Starts a new thread.
//         * 2. JVM executes the run() method in that new thread.
//         *
//         * So after m.start(), we have two threads:
//         *
//         *     1. main thread
//         *     2. newly created MyThread
//         *
//         * Both can execute concurrently.
//         */
//        m.start();
//
//        /*
//         * This loop belongs to the main thread because
//         * main() is still executing here.
//         *
//         * Therefore, these statements can execute at the
//         * same time as the statements inside run().
//         */
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main " + i);
//        }
//
//        System.out.println("main method ended");
//    }
//}
//
//
///*
// * VERY IMPORTANT DIFFERENCE:
// *
// * m.start();
// * ----------------
// * Creates a new thread.
// * JVM automatically calls run() in the new thread.
// *
// *
// * m.run();
// * ----------------
// * Does NOT create a new thread.
// * It is simply a normal method call.
// * run() executes in the current thread.
// *
// *
// * SIMPLE FLOW:
// *
// *                 main()
// *                   |
// *                   |
// *               m.start()
// *                   |
// *          +--------+--------+
// *          |                 |
// *          v                 v
// *      Main Thread       New Thread
// *          |                 |
// *     main loop          run() method
// *          |                 |
// *          +--------+--------+
// *
// *
// * WHY DOES start() CALL run()?
// *
// * Thread implements Runnable.
// *
// * Runnable defines the run() method:
// *
// *     public interface Runnable {
// *         void run();
// *     }
// *
// * Thread provides the mechanism for creating a separate
// * thread of execution.
// *
// * When start() is called, the JVM starts a new thread and
// * that new thread executes the run() method.
// *
// * In simple words:
// *
// *     run() = WHAT WORK SHOULD BE DONE
// *
// *     start() = START A NEW THREAD TO DO THAT WORK
// */

