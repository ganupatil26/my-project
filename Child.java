package com.inheritance;

public class Child extends Parents{
	public void child() {
		System.out.println("c=3");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.grandparent();
		c.parent();
		c.child();
	}
}
