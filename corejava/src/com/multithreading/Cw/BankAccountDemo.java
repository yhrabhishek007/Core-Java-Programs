package com.multithreading.Cw;

//Java 1.Create a BankAccount class with an initial balance of ₹10,000.

//Create two threads representing two customers. Each customer should withdraw money 
//from the account. Use the synchronized keyword to safely update the account balance. 
//If the requested withdrawal amount is greater than the available balance, 
//the customer thread should wait. After a successful withdrawal, use notify() to notify 
//the waiting thread. Display the withdrawal amount and remaining balance after
//each transaction. Use wait() and notify() for communication between the two threads.

class SynchronizedBankAccount {

	private int balance = 10000;

//	Synchronized withdrawal method

	public synchronized void withdraw(String customerName, int amount) {
		System.out.println(customerName + " wants to withdraw " + amount);

		while (amount > balance) {
			System.out.println(customerName + "cannot withdraw " + amount + " Insufficient balance:" + balance);

			try {
				wait();

			} catch (Exception e) {
				Thread.currentThread().interrupt();
				return;
			}
		}

		balance -= amount;

		System.out.println(customerName + " withdraw " + amount + ". Remaining balance: " + balance);

//		Notify the waiting thread
		notify();

	}

}

class Customer extends Thread {

	private SynchronizedBankAccount account;
	private int withdrawalAmount;
	private String customerName;

	Customer(SynchronizedBankAccount account, String customerName, int withdrawalAmount) {

		this.account = account;
		this.customerName = customerName;
		this.withdrawalAmount = withdrawalAmount;
	}

	public void run() {
		account.withdraw(customerName, withdrawalAmount);
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {

		SynchronizedBankAccount account = new SynchronizedBankAccount();

		Customer customer1 = new Customer(account, "Customer 1", 7000);

		Customer customer2 = new Customer(account, "Customer 2", 5000);

		customer1.start();
		customer2.start();
	}
}