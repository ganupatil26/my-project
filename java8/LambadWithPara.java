package com.java8;

interface LambadWithPara {
	
	int sum(int a, int b);

	public static void main(String[] args) {
		LambadWithPara obj = (a, b) -> a + b;
		System.out.println(obj.sum(10, 20));
	}
}
