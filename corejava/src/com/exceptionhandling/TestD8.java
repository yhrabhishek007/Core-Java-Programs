package com.exceptionhandling;

public class TestD8 {
// only try , catch , finally are not possible either we should give try finally , try catch or try catch finally.
//	also we should follow the order. we can not give try finally and catch
	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("In try!!");
//			interview POV:
//			System.out.println(0 / 0);  //AE (Arithmetic Exception) (anything / 0) -->AException
			System.out.println(0.0/0.0);  //NaN
			System.out.println(0 / 0.0); //NaN  (Not a Number)
			System.out.println(0.0 / 0); //NaN
//			For floating-point numbers, Java follows the IEEE 754 rules:
			System.out.println(5 / 0.0); //Infinity  (any number / 0.0) -->Infinity (floating-point division by zero)
			System.out.println(-5/0.0);  //-Infinity

//			System.out.println(10 / 0);
		} catch (Exception e) {

			System.out.println("In catch!");
			e.printStackTrace();

		} finally {
			System.out.println("In finally!!");
		}
		System.out.println("Main method ended");

	}

}
