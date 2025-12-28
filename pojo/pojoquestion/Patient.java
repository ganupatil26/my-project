package com.pojoquestion;

public class Patient {

//	10 . Create the following classes:
//
//		Patient → id, name, age
//		Doctor → id, name, specialization
//		Room → roomNo, type
//		Hospital → HAS-A (Patient, Doctor, Room)
//		Requirements:
//		A Hospital object should store multiple patients.
//		Take all details using Scanner.
//		If patient age < 12 → assign “Child Specialist”
//		If patient age ≥ 60 → print “Senior Citizen Priority”
//		Print full report:
//		Patient + Doctor + Room
	int id;
	String name;
	int age;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
