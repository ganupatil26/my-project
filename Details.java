package com.overload;

public class Details {

	void display(String name) {
		System.out.println("name:"+name);
	}
	void display(String name, int age) {
		System.out.println("name:"+name+" "+"age:"+age);
	}
	public static void main(String[] args) {
		Details d = new Details();
		d.display("sayali");
		d.display("ragav", 16);
	}
}
