package com.pojoquestion;

import java.util.Scanner;

public class StudentInfo extends Student {

	public StudentInfo(int id, String name, double percentage) {
		super(id, name, percentage);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		int id = sc.nextInt();
		System.out.println("enter your name:");
		String name = sc.next();
		System.out.println("enter your 12th percentage:");
		double percentage = sc.nextDouble();
		sc.close();
		StudentInfo si = new StudentInfo(id, name, percentage);
		System.out.println(si);

	}
}
