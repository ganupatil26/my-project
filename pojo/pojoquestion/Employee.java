package com.pojoquestion;

import java.util.Scanner;

public class Employee extends  Person{
	double salray = 25000.0;
	
	void salary() {
		System.out.println(this.salray);
		
	}
	

	public Employee(String name, int age) {
		super(name, age);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name= sc.next();
		
		System.out.println("age:");
		int age= sc.nextInt();
		sc.close();
		Employee e = new Employee(name, age);
		System.out.println(e);
		System.out.println("employee salary:"+e.salray);
}
}
