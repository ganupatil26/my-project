package com.statics;

public class Bank {
//
//	Create a class Bank:
//		static variable: rateOfInterest
//		static method to change ROI
//		non-static method to display account balance + ROI
//		Call methods and observe behavior.

	static double rateOfIntrest = 8.5;
	double balance;
	
	Bank(double balance){
		this.balance=balance;
	}
	static void roi(double newrate) {
		rateOfIntrest = newrate;
		
	}
	void display() {
		System.out.println("account balance:"+balance);
		System.out.println("Rate of Intrest:"+rateOfIntrest+"%");
		
		
	}
	
}
