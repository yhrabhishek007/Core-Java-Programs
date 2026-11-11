package com.exceptionhandling;

public class TestD10 {
//	NestedTryCatchFinallyDemo
	public static void main(String[] args) {

		System.out.println("Main method started");

		try {

			System.out.println("In try1");

			// Exception occurs here, so try1 stops immediately.
			System.out.println(10 / 0);

			// These statements will not execute because
			// the exception occurred before reaching them.
			try {

				System.out.println("In try2");
				System.out.println(10 / 0);

			} catch (Exception e1) {

				System.out.println("In catch2");

				try {

					System.out.println("In try3!!");
					System.out.println(10 / 0);

				} catch (Exception e) {

					System.out.println("In catch3!!");
					System.out.println(e.getLocalizedMessage());
				}

				finally {
					System.out.println("In finally 1");
				}
			}

		}

		catch (Exception e) {

			// Exception from try1 is handled here.
			try {

				System.out.println("In try4");

				// Another exception occurs here.
				System.out.println(10 / 0);

			} catch (Exception c1) {

				// Handles the exception from try4.
				System.out.println("In catch1");

				// Prints the exception message.
				System.out.println(c1.getLocalizedMessage());
			}

		} finally {

			try {
				System.out.println("In finally try1");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("In finally catch1");
				System.out.println(e.getMessage());
				System.out.println(10 / 0);

			}

			// finally executes after try/catch.
			System.out.println("In finally");
		}

		System.out.println("Main method ended");
	}
}