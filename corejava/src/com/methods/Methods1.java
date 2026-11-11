package com.methods;
import java.util.Scanner;
public class Methods1 {
//Methods with arguments and with no return type:-->
//	Gender
//	Date of Birth
//	Marital Status
//	Nationality
//	Scanner sc = new Scanner(System.in);
	
	    void main(String[] args) {
		System.out.println("Employee Personal Details:");
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Employee Name :");
		String name = sc.nextLine();
		System.out.println("Employee Name is:" + name);
		
		System.out.println("Employee Organization Name:");
		String org = sc.nextLine();
		System.out.println("Employee Organization Name is:" + org);
		
		System.out.println("Employee Id:");
		int id = sc.nextInt();
		System.out.println("Employee Id is:" + id);
		
		System.out.println("Employee Gender:");
		char gender = sc.next().charAt(0);
		System.out.println("Employee Gender is:" + gender);
		 
		sc.nextLine();
		
		System.out.println("Employee Martial status:");
		String status = sc.nextLine();
		System.out.println("Employee Martial status is:" + status);
		
		System.out.println("Employee Nationality:");
		String nationality = sc.nextLine();
		System.out.println("Employee  Nationality is:" + nationality);
		
		System.out.println("Employee Salary Details:");
		
		System.out.println("Employee Salary:");
		double salary = sc.nextDouble();
		System.out.println("Employee Salary is:" + salary);
		
		System.out.println("Employee Account Number:");
		long account_no  = sc.nextLong();
		System.out.println("Employee Account Number is:" + account_no);
		
		System.out.println("Employee Current Balance:");
		float balance  = sc.nextFloat();
		System.out.println("Employee Current Balance is:" + balance);
		
		System.out.println("Employee Performance:");
		boolean isGood = sc.nextBoolean();
//		System.out.println("Employee Performance is:" + isGood);
		getBehavior(isGood);
		
//		System.out.println("Employee Performance:");    //doubt
//		boolean isGood = sc.nextBoolean();
//
//		System.out.println("Employee Performance is: " + isGood);
				
		
	}
	
	void getName(String name) {
		System.out.println("Employee Name:" + name);
	}
	void getOrg(String organization) {
		System.out.println("Organization Name:" + organization);
	}
	void getEmpId(int id) {
		System.out.println("Employee Id::" + id);
	}
	void getGender(char gender) {
		System.out.println("Employee gender:" + gender);
	}
	void getMartialStatus(String status) {
		System.out.println("Employee Martial status:" + status);
	}
	void getNationality(String nationality) {
		System.out.println("Employee Nationality:" + nationality);
	}
	
	void getSal(double salary) {
		System.out.println("Employee Salary:" + salary);
	}
	void getAccno(long account_no) {
		System.out.println("EMployee Account Number:" +account_no);
	}
	void getAccbal(float balance) {
		System.out.println("Employee Current Balance:" + balance);
	}
	void getBehavior(boolean isGood) {
		if (isGood) {
			System.out.println("Employee is performing well");
		}
			else {
				System.out.println("Employee needs improvment");
			}
	
	
	}
	

}
