package com.overload;



public class Sum {
	
	void sum (int a , int b) {
		System.out.println("sum of two number :-"+ (a+b));
	}
	
	void sum(float a , float b) {
		System.out.println("sum of two floay number:- "+(a+b));
	}

	public static void main(String[] args) {
		Sum s= new Sum();
		s.sum(5, 5);
		s.sum(5.1f,6.8f);

	}

}
