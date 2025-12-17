package com.overload;

public class Main {

	public static void main(String[] args) {
		System.out.println("Original main(String[] args) executing");

		
		main(10);
		main("Hello");
	}

	private static void main(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void main(int i) {
		// TODO Auto-generated method stub
		
	}

}
