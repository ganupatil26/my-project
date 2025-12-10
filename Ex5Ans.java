package com.inheritance;

public class Ex5Ans extends Example5{
	int b=2;
	public void b() {
		System.out.println("num b"+b);
		System.out.println("ans a*b"+ a*b);
	}
	public static void main(String[] args) {
		Ex5Ans e = new Ex5Ans();
		e.a();
		e.b();
		
	}

}
