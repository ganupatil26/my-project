package com.practice;

public class Example8 {
//	Write a Java program to demonstrate method overloading using constructor

	int id;
	String name;
	int age;

	Example8() {
		id = 0;
		name = "Not Assigned";
		age = 0;
	}
	Example8(int i, String n) {
		id = i;
		name = n;
		age = 0;
	}
	Example8(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("--------------------");
	}
}
