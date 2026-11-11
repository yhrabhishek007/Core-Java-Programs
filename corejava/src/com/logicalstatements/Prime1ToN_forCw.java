package com.logicalstatements;

//Remember this rule
//✅ Condition n % i == 0 becomes true → Not Prime → return false
//✅ Condition never becomes true → Prime → return true
import java.util.Scanner;
//2. Write a Java program to print all prime numbers between 1 and N?
//Input : Enter the value of N: 20
//Output: Prime numbers between 1 and 20 are: 2 3 5 7 11 13 17 19
public class Prime1ToN_forCw {
//like check other then the number ex 7-> n=7 and then n%i==0 checks until 6 but it will not satisfy conditon
//until n=7 so think like that
	void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		for (int i = 2; i <=n; i++) {
//			The loop picks a number i (2, 3, 4, 5, …)
//			It sends that number to primeCount(i)

//			The if block is just a filter. It only allows prime numbers to pass through and be printed.
			if (primeCount(i)) {
//				If primeCount(i) returns true → enter the block → print i
//				If it returns false → skip it → do nothing
				System.out.println(i + " ");
			}
		}

		sc.close();
	}

	boolean primeCount(int n) {
		boolean flag=true;    //intially we take true ex every number is a prime number 

		if (n <= 1)
			return false;

		for (int i = 2; i <=n/2; i++) {
//			This means:
//				n % i == 0 → i divides n exactly.
//				So n has a factor other than 1 and itself.
//				Therefore, n is not prime.
//				Hence, return false.
			if (n % i == 0) {// If the condition is true, it means the number is NOT prime.
				flag= false;
			break;
		}
		}
		return flag;
//understand
//		If a number is divisible by any number other than 1 and itself, 
//		then it is not prime. That's why when n % i == 0 becomes true, the method returns false.
//
//		If the number is not divisible by any number from 2 to n - 1 
//		(or up to √n in the optimized version), then n % i == 0 is never true. 
//		The loop completes, and the method returns true, which means the number is prime.

//		imp*****

//		A clearer way to say it is:
//
//			return true means the number is prime.
//			It does not mean that n % i == 0 was true.
//
//			In fact:
//
//			n % i == 0 true → return false → Not prime.
//			n % i == 0 never becomes true → loop ends → return true → Prime.
//
//			That's the key idea. It sounds like you've now understood the logic correctly.

//		For example:
//
//			6 % 2 == 0   // true
//			6 % 3 == 0   // true
//
//			This tells us that 6 has factors 2 and 3 besides 1 and 6.
//
//			A prime number should have only two factors:
//
//			1
//			Itself
//
//			Since 6 has extra factors, it is not prime.
//
//			So the method immediately returns:
//
//			return false;
//
//			Here, false means "this number is not prime."
}
}
