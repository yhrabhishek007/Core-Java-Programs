package com.constructors;

//Food Delivery System: Create a class FoodOrder with fields orderId, customerName, restaurantName, itemName, quantity, and price. Implement appropriate constructors and create the following objects
//FoodOrder order1 = new FoodOrder(101, "Siva", "Chicken Biryani");
//FoodOrder order2 = new FoodOrder(102, "Reddy", "Paradise", "Mutton Biryani", 2);
//FoodOrder order3 = new FoodOrder(103, "Kumar", "Mehfil", "Fried Rice", 3, 450);
public class FoodOrder_Cw {
	int orderId;
	String customerName;
	String restuarantName;
	String itemName;
	int orderQuantity;
	int price;

	FoodOrder_Cw() {
		System.out.println("No-Arg constructor called");
//		System.out.println(orderId);
//		System.err.println(customerName);
//		System.err.println(restuarantName);
//		System.err.println(itemName);
//		System.err.println(quantity);
//		System.err.println(price);
	}

	FoodOrder_Cw(int order, String customerName, String itemName) {
		System.out.println("Parameterized constructor called");
		orderId = order;
		this.customerName = customerName;
		this.itemName = itemName;

	}

	FoodOrder_Cw(int orderId, String customerName, String restuarantName, String itemName, int orderQuantity) {
		System.out.println("5-Arg constructor called:");
		this.orderId = orderId;
		this.customerName = customerName;
		this.restuarantName = restuarantName;
		this.itemName = itemName;
		this.orderId = orderId;
	}

	FoodOrder_Cw(int orderId, String customerName, String restuarantName, String itemName, int orderQuantity,
			int itemPrice) {
		System.out.println("6-Arg constructor called:");
		this.orderId = orderId;
		this.customerName = customerName;
		this.restuarantName = restuarantName;
		this.itemName = itemName;
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.price = itemPrice;
	}

	void display() {
		System.out.println("Order Id:" + orderId);
		System.out.println("Customer name:" + customerName);
		System.out.println("Restuarant Id:" + restuarantName);
		System.out.println("Item name:" + itemName);
		System.out.println("Order quantity:" + orderQuantity);
		System.out.println("Order price:" + price);
		System.out.println("---------------------->");
	}

	public static void main(String[] args) {
		FoodOrder_Cw f = new FoodOrder_Cw();
//		f.display();
		FoodOrder_Cw f1 = new FoodOrder_Cw(101, "shiva", "Chicken Biryani");
		f1.display();
		FoodOrder_Cw f2 = new FoodOrder_Cw(102, "Reddy", "Paradise", "Mutton Biryani", 2);
		f2.display();
		FoodOrder_Cw f3 = new FoodOrder_Cw(102, "Reddy", "Paradise", "Mutton Biryani", 2, 450);
		f3.display();

	}

}
