package com.statics;



public class Bankinfo {

	public static void main(String[] args) {
		Bank b;
		b= new Bank(1000.00);
		b.display();
		b= new Bank(2000.0);
		System.out.println("changed the rate of interest");
		Bank.roi(9.5);
		b.display();
	
		
		
		
		
		
	}
}
