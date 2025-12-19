package com.Reference;

public class Application {
	
	void m1(Payment p) {
		
		p = new Gpay();
		p.checkBalance();
		p.reward();
		System.out.println("----------");
		p = new Phonepe();
		p.checkBalance();
		p.reward();
		System.out.println("----------");
		p = new Navi();
		p.checkBalance();
		p.reward();
		System.out.println("----------");
		p = new Payment();
		p.checkBalance();
		p.reward();
	
	
	}
	
	public static void main(String[] args) {
		Application a =new Application();
		a.m1(null);	
		
	}

}
