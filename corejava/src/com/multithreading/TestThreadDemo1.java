package com.multithreading;

/*
 * ============================================================
 * THREAD - DEFINITION
 * ============================================================
 *
 * A Thread is a lightweight unit of execution inside a process.
 *
 * In simple words:
 *
 * Process = Running application
 *
 * Thread  = Smallest unit of execution inside that application.
 *
 *
 * Example:
 *
 * A Java application can have:
 *
 *     Main Thread
 *         |
 *         +---- Task 1
 *         +---- Task 2
 *         +---- Task 3
 *
 *
 * Java supports Multithreading, which means:
 *
 * Multiple threads can execute tasks concurrently
 * within the same process.
 */

public class TestThreadDemo1 {

	// =========================================================
	// walk()
	// =========================================================

	void walk() {

		System.out.println("walk method called");

		/*
		 * Thread.currentThread()
		 *
		 * Returns the Thread object representing the currently executing thread.
		 */

		System.out.println(Thread.currentThread());
	}

	// =========================================================
	// run()
	// =========================================================

	void run() {

		System.out.println("run method called");

		/*
		 * This prints information about the currently executing thread.
		 */

		System.out.println(Thread.currentThread());
	}

	// =========================================================
	// main()
	// =========================================================

	void main(String[] args) {

		/*
		 * IMPORTANT:
		 *
		 * The standard Java entry point is:
		 *
		 * public static void main(String[] args)
		 *
		 * public -> JVM must be able to access it static -> JVM can call it without
		 * creating an object void -> does not return a value main -> special method
		 * name recognized by JVM String[] args -> command-line arguments
		 */

		System.out.println("main method started");

		/*
		 * Creating an object of this class.
		 */

		TestThreadDemo1 obj = new TestThreadDemo1();

		/*
		 * Calling walk() normally.
		 *
		 * IMPORTANT:
		 *
		 * Calling a normal method does NOT create a new thread.
		 *
		 * walk() executes in the current thread.
		 */

		walk();

		/*
		 * Calling run() directly also does NOT create a new thread.
		 *
		 * It is just a normal method call here.
		 */

		run();

		System.out.println("main method ended");
	}
}

/*
 * ============================================================ IMPORTANT THREAD
 * CONCEPTS ============================================================
 *
 * 1. Process ------------------------------------------------------------ A
 * process is a running program/application.
 *
 * Example: Running a Java application creates a process.
 *
 *
 * 2. Thread ------------------------------------------------------------ A
 * thread is a lightweight unit of execution inside a process.
 *
 *
 * 3. Multithreading
 * ------------------------------------------------------------ Executing
 * multiple threads concurrently within the same process.
 *
 *
 * 4. Main Thread ------------------------------------------------------------
 * When a Java application starts, JVM creates the main thread.
 *
 * The main() method executes inside the main thread.
 *
 *
 * 5. Thread.currentThread()
 * ------------------------------------------------------------ Returns the
 * currently executing Thread object.
 *
 * Example:
 *
 * System.out.println(Thread.currentThread());
 *
 * Possible output:
 *
 * Thread[main,5,main]
 *
 * Meaning:
 *
 * main -> Thread name 5 -> Thread priority main -> Thread group
 *
 *
 * ============================================================ VERY IMPORTANT
 * ============================================================
 *
 * Calling a method:
 *
 * obj.run();
 *
 * DOES NOT create a new thread.
 *
 * It is simply a normal method call.
 *
 *
 * To execute code in a new thread, we need to use Thread / Runnable and start
 * the thread.
 *
 *
 * Example:
 *
 * Thread t = new Thread(() -> { System.out.println("Running in new thread");
 * });
 *
 * t.start();
 *
 *
 * start() -> creates/schedules a new thread
 *
 * run() -> contains the task/code executed by the thread
 *
 *
 * NEVER confuse:
 *
 * t.start();
 *
 * with:
 *
 * t.run();
 *
 *
 * start() -> new thread execution
 *
 * run() -> normal method call if invoked directly
 */
