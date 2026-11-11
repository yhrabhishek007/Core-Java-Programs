package com.oops.polymorphism;

import java.util.Scanner;

public class FindArea {

	void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side:");
		int side = sc.nextInt();

		int areaOfSqr = findArea(side);
		System.out.println(areaOfSqr);

		System.out.println("Enter length & breadth:");
		int l = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter height & breadth:");
		int h = sc.nextInt();
		int br = sc.nextInt();

		System.out.println("Enter radius:");
		int r = sc.nextInt();

		sc.close();

	}

//	Here same method names but different parameters this is called method overloading

	int findArea(int side) {
		return side * side;
	}

	double findArea(double l, double b) {
		return l * b;
	}

	double findArea(float h, double br) {
		return 0.5 * br * h;
	}

	double findArea(float r) {
		return Math.PI * r * r;
	}

}
