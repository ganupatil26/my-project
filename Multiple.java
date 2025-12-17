package com.overload;

public class Multiple {

	// 2nd
	void multiple(int a, int b) {
		System.out.println("multiply of two number:-" + (a * b));
	}

	void multiple(double a, double b) {
		System.out.println("multiply of two double number:-" + (a * b));
	}

	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.multiple(5, 2);
		m.multiple(2.0, 5.2);
	}

}
