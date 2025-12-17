package com.overload;

public class Student {

	int id;
	String name;

	Student (int id, String name) {
	        this.id = id;
	        this.name = name;
	}

	void display() {
		System.out.println("Id: " + id + ", Name: " + name);
	}

	public static void main(String[] args) {
		 Student s = new Student(102, "Rahul");
		 s.display();
	}
}
