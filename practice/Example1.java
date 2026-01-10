package com.practice;

public class Example1 {
	
	//Write a program to handle ArithmeticException using try-catch.


//	Write a program where multiple catch blocks handle different exceptions.
//	What is the output if an exception occurs inside finally block?
	public void ex1() {
		
		try {
			int a= 5;
			int b=0;
			int result = a/b;
			System.out.println("result:"+result);
		}catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Exception caught!");
            System.out.println("error: divede by zero ");
            System.out.println("Exception type :ArithmeticException");
		}
	}
		
	
}
