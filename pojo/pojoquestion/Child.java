package com.pojoquestion;

public class Child extends ParentA {

	public Child(String name) {
		super(name);

	}

	void age(int age) {
		System.out.println("age:" + age);
	}

	public static void main(String[] args) {
		Child c = new Child("ram");
		c.age(12);
	}
}
