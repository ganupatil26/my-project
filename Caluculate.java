package com.overload;

public class Caluculate {
	void calculate (int a) {
		System.out.println("square of num:"+a+"-"+(a*a));
		
	}
	void calculate(float a) {
		System.out.println("cube of num:"+a+"-"+(a*a*a));
		
	}
	public static void main(String[] args) {
		Caluculate c = new Caluculate();
		c.calculate(5);
		c.calculate(5f);
		
		
	}

}
