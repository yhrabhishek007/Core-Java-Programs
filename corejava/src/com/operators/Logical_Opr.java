package com.operators;

import java.util.Scanner;

//Write a Java program to demonstrate all logical operators (&&, ||, !) using boolean variables?
public class Logical_Opr {

	public static void main(String[] args) {
		System.out.println("Logical Operators:");

		int a = 90;
		int b = 80;

		System.out.println("AND (&&): " + (a > b && a == b));
		System.out.println("OR (||): " + (a > b || a == b));
		System.out.println("NOT (!): " + !(a == b));
		
		
		System.out.println("Performing logical operators using boolean values");
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean a1 = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b1 = sc.nextBoolean();

        System.out.println("a && b = " + (a1 && b1));
        System.out.println("a || b = " + (a1|| b1));
        System.out.println("!a = " + (!a1));
        
//        Dead code in logical operator
        int c = 19;
        int d = 25;

        // AND operator (short-circuit) or Dead code
        System.out.println(c > 50 && ++c < 20); 
        // c > 50 is false → second part (++c) will NOT execute

        System.out.println(c);  // c is still 19

        System.out.println(c > 15 && ++c < 25); 
        // c > 15 is true → second part executes → c becomes 20

        System.out.println(c);  // 20


        // OR operator (short-circuit) or Dead code
        System.out.println(d < 50 || ++d > 25); 
        // d < 50 is true → second part NOT executed

        System.out.println(d);  // still 25

        System.out.println(d > 50 || ++d < 30); 
        // d > 50 is false → second part executes → d becomes 26

        System.out.println(d);  // 26
        
        
        
		
	}

}
