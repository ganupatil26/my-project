package com.superr;

public class College {	
	String name;
	int pin;
	
	public College(String name, int pin) {
		this.name =name;
		this.pin =pin;
		
	}
	public void viewDetials() {
		System.out.println("College name:-"+name);
		System.out.println("pin code"+pin);
		
	}
	
	
	
}
