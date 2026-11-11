package com.multithreading;

public class VirtualThreads {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			System.err.println("main : " + i);
		}

		for (int i = 1; i <= 10; i++) {

			Thread.startVirtualThread(() -> {

				System.out.println(Thread.currentThread());

			});

		}

	}

}
