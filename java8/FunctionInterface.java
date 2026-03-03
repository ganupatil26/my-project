package com.java8;

@FunctionalInterface
 interface FunctionInterface {
//	
//	void sayHello();
//	
//	public static void main(String[] args) {
//		FunctionInterface fi = () -> System.out.println("hello"); 
//		fi.sayHello();
//	}
	
	int sum(int a , int b);
	

	public static void main(String[] args) {
		
		FunctionInterface fi = (a , b) -> a +b;
		System.out.println(fi.sum(5, 5));
		
		
	}
}
