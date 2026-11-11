package com.multithreading;

public class VirtualThreadDemo {

	public static void main(String[] args) {

		Thread.startVirtualThread(() -> {

			System.out.println("Hello from " + Thread.currentThread());

		});

	}

}
