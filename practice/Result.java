package com.practice;

import java.util.Scanner;

public class Result {
	int rollNo;
	String name;
	Scanner sc = new Scanner(System.in);

	void Info() {
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter your Roll No:");
		rollNo = sc.nextInt();

	}

	void Mark(double math, double science, double histroy, double english, double marathi) {
		System.out.println("enter your Math marks:");
		math = sc.nextDouble();
		System.out.println("enter your scinece marks:");
		science = sc.nextDouble();
		System.out.println("enter your histroy marks:");
		histroy = sc.nextDouble();
		System.out.println("enter your english marks:");
		english = sc.nextDouble();
		System.out.println("enter your marathi marks:");
		marathi = sc.nextDouble();

		if (math < 28) {
			System.out.println("FAIL in math");
		}  if (science < 28) {
			System.out.println("FAIL in science");
		}  if (histroy < 28) {
			System.out.println("FAIL in histroy");
		}  if (english < 28) {
			System.out.println("FAIL in english");
		}  if (marathi < 28) {
			System.out.println("FAIL in marathi");
		} else {
			System.out.println("-------------");
		}
			double total = math + science + histroy + english + marathi;
			System.out.println("------------------------");
			System.out.println("name:" + name);
			System.out.println("rollNo:" + rollNo);
			System.out.println("------------------------");
			System.out.println("your total marks :" + total);
			double perscet = total / 500 * 100;
			System.out.println("perscentage:" + perscet);
		if (perscet >= 80) {
			System.out.println("grade A");
		} else if (perscet <= 80 && perscet >= 70) {
			System.out.println("grade B");
		} else if (perscet <= 70 && perscet > 50) {
			System.out.println("grade C");
		} else if (perscet <= 50 && perscet > 35) {
			System.out.println("grade d");
		} else {
			System.out.println("better luck, fail");
		}
		sc.close();
	}
}
