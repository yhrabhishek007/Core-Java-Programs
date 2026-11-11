package com.multithreading.Cw;

import java.util.Scanner;

//1)Create a thread that prints the multiplication table of a given number.

public class MultiplicationThread extends Thread {
	int n;

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		MultiplicationThread t = new MultiplicationThread();

		t.n = n;

		t.start();

		sc.close();

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(n * i);
		}

	}

}
