package com.methods;
import java.util.Scanner;
//1. Create a bank account with an initial balance of ₹10,000.
//
//* Deposit ₹2,500.
//* Display the final balance.
//
//2. Create a method to withdraw money.
//
//* Withdraw ₹3,000 from a balance of ₹15,000.
//* Display the remaining balance.
//
//3. Write a program that:
//
//* Shows the current balance.
//* Deposits ₹1,000.
//* Withdraws ₹500.
//* Shows the updated balance.
//public class Methods2 {
//static float balance=10000;
//	public static void main(String[] args) {
//		System.out.println("SBI ATM Machine");
//        Scanner sc = new Scanner(System.in);
//     	System.out.println("Current Balance:"+ balance);
//     	
//		System.out.println("Deposit amount:");
//		float amount = sc.nextFloat();
//		balance =balance + amount;
//		System.out.println("Total amount after deposit:"+balance);
//		
////		float amount1 = sc.nextFloat();
////		System.out.println("Withdraw amount:" +amount1);
////		balance=balance-amount1;
////		System.out.println("Total amount after withdraw:" + amount1);
////		
//		Methods2 m =new Methods2();
//		m.withdraw(3500);
//	}
//	
//
//	void deposit(float amount) {
//		System.out.println("Amount after deposit:" + balance);
//	}
//	void withdraw(float amount) {
//		balance=balance-amount;
//		System.out.println("Total amount after withdraw" +amount);
//	}
//	
//	}


public class Methods2 {

    static float balance = 10000;

    public static void main(String[] args) {

        System.out.println("SBI ATM Machine");
        Scanner sc = new Scanner(System.in);

        Methods2 m = new Methods2();

        System.out.println("Current Balance: " + balance);

        System.out.print("Deposit amount: ");
        float amount = sc.nextFloat();
        m.deposit(amount);

        m.withdraw(3500);

        System.out.println("Final Balance: " + balance);
    }

    void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Amount after deposit: " + balance);
    }

    void withdraw(float amount) {
        balance = balance - amount;
        System.out.println("Amount after withdraw: " + balance);
    }
}