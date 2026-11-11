package com.multithreading.Cw;

//Java 1.Create a counter starting from 0. Create multiple threads.
//Each thread should increment the counter several times. Ensure the final value is correct using synchronization.
class SynchronizedCounter {

	private int count = 0;

	public synchronized void increment() {
		count++;

	}

	public int getCount() {
		return count;

	}

}

class CounterThread extends Thread {
	private SynchronizedCounter counter;

	public CounterThread(SynchronizedCounter counter) {
		this.counter = counter;
	}

	public void run() {

		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}

	}

}

public class CounterDemo {

	public static void main(String[] args) {

		SynchronizedCounter counter = new SynchronizedCounter();

		CounterThread t1 = new CounterThread(counter);
		CounterThread t2 = new CounterThread(counter);
		CounterThread t3 = new CounterThread(counter);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("Final Counter Value: " + counter.getCount());
	}
}
