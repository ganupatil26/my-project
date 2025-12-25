package com.pojo;

import java.util.Scanner;

public class CollegeInfo {

	public static void main(String[] args) {
		
		System.out.println("Enter your clg name:");
		Scanner sc = new Scanner(System.in);
		String clg= sc.next();
		
		System.out.println("Student name:");
		String name= sc.next();
		
		System.out.println("Roll no:");
		int roll=sc.nextInt();
		sc.close();
		System.out.println("Moblie no:");
		long mob= sc.nextLong();
		College c = new College(clg, name, roll, mob);
		System.out.println(c);
		
	}
}
