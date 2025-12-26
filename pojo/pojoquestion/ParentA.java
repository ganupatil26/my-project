package com.pojoquestion;

public class ParentA {

//	6. Create parent class A with constructor.
//	Create child class B.
//	Use this() to call another constructor in same class
//	Use super() to call parent constructor
//	Print messages to see order of execution
	
	void info() {
		System.out.println("parent class ");
	}
	
	public ParentA(String name) {
		this.info();
		System.out.println("name:"+name);
	}
}
