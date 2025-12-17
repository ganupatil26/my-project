package com.overload;

public class Calculator {

	void add(int a, int b, int c) {
		System.out.println("addition of three number:-" + (a + b + c));
	}

	void add(int a, int b) {
		System.out.println("addition of two number:-" + (a + b));
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(4, 5);
		c.add(5, 2, 5);

	}

}
