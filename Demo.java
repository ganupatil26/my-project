package com.overload;

public class Demo {

	void show(int age , String name) {
		System.out.println("age:"+age+"name:"+name);
		
	}
	void show(String name , int age) {
		System.out.println("name:"+name+"age:"+age);
	}
	
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show(20, "ganu");
		d.show("raj", 24);

	}

}
