package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task that will be executed by a thread from the thread pool
class MyTask implements Runnable {

	@Override
	public void run() {

		// Returns the name of the thread that is currently executing this task
		System.out.println(Thread.currentThread().getName() + " is executing task");
	}
}

public class ExecutorDemo {

	public static void main(String[] args) {

		// Creates a fixed-size thread pool with 3 worker threads.
		// At most 3 tasks can execute concurrently.
		ExecutorService service = Executors.newFixedThreadPool(3);

		/*
		 * execute() submits a Runnable task to the ExecutorService.
		 *
		 * The task is not executed directly by the main thread. Instead, an available
		 * thread from the pool picks up the task.
		 *
		 * Since the pool has 3 threads, up to 3 tasks can run at the same time.
		 */
		for (int i = 1; i <= 10; i++) {

			service.execute(new MyTask());
		}

		/*
		 * shutdown() stops accepting new tasks.
		 *
		 * Tasks that have already been submitted are allowed to complete normally.
		 */
		service.shutdown();
	}
}