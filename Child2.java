package com.superr;

public class Child2 extends Parent{
	Child2(){
		super("vedant patil", 20);
		
	}
	public static void main(String[] args) {
		Child1 c1 =new Child1();
		
		c1.viewDetails();
		Child2  c2 =new Child2();
		c2.viewDetails();
		
		
	}
}
