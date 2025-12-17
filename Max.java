package com.overload;

public class Max {
	
	void max(int a, int b) {
		if (a>b){
			System.out.println("a is greater");
		}else {
				System.out.println("b is greater");
			}
		}	
	void max(int a, int b,int c) {
		if (a>b){
			System.out.println("a is greater");
		}else {
			if (b>c) {
				System.out.println("b is greater");
			}else {
				System.out.println("c is greater");
				
			}
		}
		
	}
	public static void main(String[] args) {
		Max m= new Max();
		m.max(5,6);
		m.max(5, 8, 7);
		
	}

}
