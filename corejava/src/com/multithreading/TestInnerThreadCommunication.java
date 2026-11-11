package com.multithreading;


//IllegalMonitorStateException → When wait(), notify(), or notifyAll() is called without
//acquiring the object's lock using synchronized.

// Resource is a common object
// shared by Producer and Consumer
class Resource {

	int i = 0;

	// false -> Resource is empty
	// true -> Resource has data
	boolean status = false;

	// Producer uses this method to put data
	synchronized void put(int i) throws InterruptedException {

		// If data is already present,
		// Producer has to wait
		while (status) {
			wait();
		}

		// Put data into Resource
		this.i = i;

		System.out.println("PUT : " + i);

		// Data is now available
		status = true;

		// Inform Consumer that data is available
		notify();
	}

	// Consumer uses this method to get data
	synchronized void get() throws InterruptedException {

		// If Resource is empty,
		// Consumer has to wait
		while (!status) {
			wait();
		}

		// Get data from Resource
		System.out.println("GET : " + i);

		// Resource is empty again
		status = false;

		// Inform Producer that Resource is empty
		notify();
	}
}

// Producer creates data
class Producer implements Runnable {

	Resource r;

	Producer(Resource r) {

		this.r = r;

		// Create Producer thread
		Thread t = new Thread(this, "Producer");

		// Start Producer thread
		t.start();
	}

	@Override
	public void run() {

		int i = 1;

		while (true) {

			try {

				// Put data into Resource
				r.put(i++);

				// Wait for 1 second
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

// Consumer takes data
class Consumer implements Runnable {

	Resource r;

	Consumer(Resource r) {

		this.r = r;

		// Create Consumer thread
		Thread t = new Thread(this, "Consumer");

		// Start Consumer thread
		t.start();
	}

	@Override
	public void run() {

		while (true) {

			try {

				// Get data from Resource
				r.get();

				// Wait for 1 second
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

// Main class
public class TestInnerThreadCommunication {

	public static void main(String[] args) {

		System.out.println("main method started");

		// Create one common Resource
		// which will be shared by Producer and Consumer
		Resource r = new Resource();

		// Create Producer thread
		Producer p1 = new Producer(r);

		// Create Consumer thread
		Consumer c1 = new Consumer(r);

		System.out.println("main method ended");
	}
}
