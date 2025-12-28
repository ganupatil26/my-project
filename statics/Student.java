package com.statics;

public class Student {

//Create a class Student with:
//	static variable → collegeName
//	non-static → id, name
//	method to display details
//	Create 3 objects and show how collegeName is same for all.
	static String collegeName = "bapuji salunkhe clg ,miraj";
	int id;
	String name;
	
	void display(String name,int age) {
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println(Student.collegeName);
	}
}

