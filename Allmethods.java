package com.scanner;
import java.util.Scanner;
public class Allmethods {
	
	int age;
	float height;
	double salary;
	long mobNo;
	String firstName;
	String address;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------");
		
		
		System.out.println("enter your age:-");
		int userAge = sc.nextInt();
		
		System.out.println("enter your height:-");
		float userHeight = sc.nextFloat();
		
		System.out.println("enter your salary:-");
		double userSalary = sc.nextDouble();
		
		System.out.println("enter your mobile no:-");
		long userMobNo = sc.nextLong();
		
		System.out.println("enter your name:-");
		String userName=sc.next();
		
		System.out.println("enter your address:-");
		String userAdd= sc.next();
		 
		
		
		sc.close();
		
		System.out.println("name:-"+userAge);
		System.out.println("height:-"+userHeight);
		System.out.println("salary:-"+userSalary);
		System.out.println("mobile no:-"+userMobNo);
		System.out.println("name:-"+userName);
		System.out.println("address:-"+userAdd);
		45
		
		
		
		
		
	}
	
	
	
	

}
