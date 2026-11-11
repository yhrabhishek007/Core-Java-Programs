package com.constructors;

//Create a method that calculates how many users will get a rating after a programming contest.
public class CalculateRatings {
	int Total_users;
	int users_withsubmission;
	int users_withoutsubmission;

	public CalculateRatings(int Total_users, int users_withsubmission, int users_withoutsubmission) {
		this.Total_users=Total_users;
		this.users_withsubmission=users_withsubmission;
		this.users_withoutsubmission=users_withoutsubmission;
		System.out.println("3-Arg constructor called");

	}
	void ratingsInfo() {
		System.out.println("Total users:" +Total_users);
		System.out.println("Users with submission:"+users_withsubmission);
		System.out.println("Users with out submission:" +users_withoutsubmission);
	}

	public static void main(String[] args) {
		CalculateRatings c = new CalculateRatings(100,20,80);
		c.ratingsInfo();

	}

}
