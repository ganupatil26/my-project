package com.pojoquestion;

import java.util.Scanner;

public class Calculator {
//	3.Create class Calculator with methods add():
//		add(int a, int b)
//		add(int a, int b, int c)
//		add(double a, double b)
//		Take values using Scanner and show results.
	Scanner sc = new Scanner(System.in);

	void add(int a, int b) {
		System.out.println("enter value of a:");
		a = sc.nextInt();
		System.out.println("enter value of b:");
		b = sc.nextInt();
		int add = a + b;
		System.out.println("a+b="+add);
	}

	void add(int a, int b, int c) {
		System.out.println("enter value of a:");
		a = sc.nextInt();
		System.out.println("enter value of b:");
		b = sc.nextInt();
		System.out.println("enter value of c:");
		c = sc.nextInt();
		int add = a + b + c;
		System.out.println("a+b+c="+add);
	}

	void add(double a, double b) {
		System.out.println("enter value of a:");
		a = sc.nextDouble();
		System.out.println("enter value of b");
		b = sc.nextDouble();
		double add = a + b;
		System.out.println("a+b="+add);
	}

}
