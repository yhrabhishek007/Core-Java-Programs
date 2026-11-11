package com.multithreading.Cw;

class OrderPlacementThread extends Thread {

	public void run() {
		System.out.println("Order placed");
	}
}

class FoodCookingThread extends Thread {

	public void run() {
		System.out.println("Food is cooking");
		System.out.println("Food is ready");
	}
}

class FoodDeliveryThread extends Thread {

	public void run() {
		System.out.println("Food delivered");
	}
}

public class FoodOrderSystem {

	public static void main(String[] args) throws InterruptedException {

		OrderPlacementThread order = new OrderPlacementThread();
		FoodCookingThread cooking = new FoodCookingThread();
		FoodDeliveryThread delivery = new FoodDeliveryThread();

		// Order must be placed first
		order.start();
		order.join();

		// Cooking starts after order is placed
		cooking.start();
		cooking.join();

		// Delivery starts after cooking is completed
		delivery.start();
		delivery.join();
	}
}