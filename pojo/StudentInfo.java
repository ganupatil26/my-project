package com.pojo;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {

		
		System.out.println("Enter Your Name:");
		Scanner sc = new Scanner(System.in);
		String studname = sc.next();
		
		System.out.println("College Name:");
		String clgName = sc.next();
		
		System.out.println("Age:");
		int stdAge= sc.nextInt();
		
		System.out.println("Which Standard:");
		String standard = sc.next();
		
		System.out.println("Division:");
		String divv = sc.next();
		
		sc.close();
		Student s = new Student(studname, clgName, stdAge, standard, divv);
		System.out.println(s);
		
		
	}
}
