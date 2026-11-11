package com.constructors;
//1.Create an Account class with accountNumber and accountHolderName, and a SavingsAccount class with 
//balance; use parameterized constructors and super() to initialize parent class variables, 
//then display all account details.
public class Account_Cw {
	long Acc_No;
	String Acc_Holder;
	public Account_Cw(long Acc_No,String Acc_Holder) {
		this.Acc_No=Acc_No;
		this.Acc_Holder=Acc_Holder;
		System.out.println("2-Arg parent class called");
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method called");
		
	}

}
class SavingsAccount extends Account_Cw{
	double balance;

	public SavingsAccount(long Acc_No, String Acc_Holder,double balance) {
		//we can send extra parameters in super by initializing the values 
		super(Acc_No,Acc_Holder);
		this.balance=balance;
		System.out.println("2-Arg child called");
		
	}
	
//	public SavingsAccount() {
//		
//	}
	public static void main(String[] args) {
		System.out.println("Main method started child");
		SavingsAccount s = new SavingsAccount(1993939888888L, "Bhargav",20000.0); 
		s.accInfo();
//		System.out.println(s.Acc_No);         //better to give it in a method
//		System.out.println(s.Acc_Holder);
		
	}
	void accInfo() {
		System.out.println("SBI Bank");
		System.out.println("Account Number : "+Acc_No);
		System.out.println("Account Holder Name : "+Acc_Holder);
		System.out.println("Account Current Blanace : "+balance);
	}
}