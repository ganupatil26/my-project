package com.pojoquestion;

public class Person {
//	2.Create parent class Person (name, age).
//	Create child class Employee (salary).
//	Call parent constructor using super()
//	Child should print all details
//	Create one object and display data
	
	String name;
	int age;
	Employee e;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
