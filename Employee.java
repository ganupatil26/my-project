package com.constructor;

public class Employee {

	int empId;
	String name;
	String salary;
	String city;


	Employee(int empId, String name, String salary, String city) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.display();
	}

	void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
		System.out.println("city:"+city);
	}

}
