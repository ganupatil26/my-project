package com.constructor;

public class Student {
	int rollNo;
	String name;
	int std;
	long mobNo;
	int age;
	String gender;
	

	// parameterized constructor
	Student(int rollNo, String name, int std, long mobNo, int age, String gender) {
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.mobNo = mobNo;
		this.gender = gender;
		this.displayDetails();

	}

	void displayDetails() {
		System.out.println("Roll no" + rollNo);
		System.out.println("Student name:" + name);
		System.out.println("Standard:" + std);
		System.out.println("Student mobile no:" + mobNo);
		System.out.println("Gender:" + gender);
		

	}

}