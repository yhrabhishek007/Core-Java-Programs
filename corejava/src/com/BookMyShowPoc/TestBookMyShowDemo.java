package com.BookMyShowPoc;

//Definition:

//A race condition occurs when multiple threads access and modify the same shared resource at the same time, causing an unpredictable or incorrect result.

//synchronized keyword:

//In Java, synchronized is used to allow only one thread at a time to execute a critical section/method for the same object, preventing race conditions.

class BookMyShow {

	// Total tickets available in BookMyShow
	int totalTickets = 10;

	// synchronized allows only one thread at a time
	// to execute this method on the same BookMyShow object
	synchronized void bookMyTickets(String name, int tickets) {

		// Check whether requested tickets are available
		if (tickets <= totalTickets) {

			// Reduce the available tickets
			totalTickets = totalTickets - tickets;

			System.out.println("Your Tickets has been booked successfully Mr " + name);
			System.out.println("Your Total Booked Tickets are: " + tickets);
			System.out.println("Available Tickets from BookMyShow is: " + totalTickets);

		} else {

			// If requested tickets are more than available tickets
			System.out.println("Tickets have been sold out");
			System.out.println("Available Tickets are: " + totalTickets);
		}
	}
}

class Customer extends Thread {

	// Reference to the BookMyShow object
	BookMyShow bms;

	// Customer name
	String customerName;

	// Number of tickets requested
	int tickets;

	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();

		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {

		// Calls the synchronized booking method
		bms.bookMyTickets(customerName, tickets);
	}
}

public class TestBookMyShowDemo {

	public static void main(String[] args) {

		// Create only one BookMyShow object.
		// All customers share this same object.
		BookMyShow bms = new BookMyShow();

		// Customer 1 requests 6 tickets
		Customer abhi = new Customer(bms, "Abhishek", 6);
		abhi.start();

		// Customer 2 requests 6 tickets
		Customer bhanu = new Customer(bms, "Rakesh", 6);
		bhanu.start();

		// Customer 3 requests 6 tickets
		Customer rakesh = new Customer(bms, "Rakesh", 6);
		rakesh.start();
	}
}

//### Where does `synchronized` prevent the race condition?
//
//Without `synchronized`, two threads could do this at almost the same time:
//
//Thread 1: Check → 6 <= 10 → TRUE
//Thread 2: Check → 6 <= 10 → TRUE
//
//Thread 1: Book 6 → totalTickets = 4
//Thread 2: Book 6 → totalTickets = 4
//```
//
//This could incorrectly allow **12 tickets to be booked when only 10 exist**.
//
//With `synchronized`:
//
//```text
//Thread 1 → Check → Book → Update totalTickets → Exit
//                                      ↓
//Thread 2 → Check → sees only 4 tickets → Reject
//```
//
//So `synchronized` protects the **check + update** operation from being performed by multiple threads simultaneously.
