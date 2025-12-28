package com.pojoquestion;
import java.util.Scanner;


public class Studentsss extends DiplomaCourse {
	final double regFess= 1000;
	
	long mobileNo;
	String name;
	@Override
	void fees() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose your cource:");
		System.out.println("1.Diploma cource 2.Degree cource");
		int choose =sc.nextInt();
		
		switch (choose) {
		case 1:
			System.out.println("Enter your name:");
			String name = sc.next();
			System.out.println("Mobile no:");
			long moNo = sc.nextLong();
			System.out.println("Diploma cource fees = "+fees);
			System.out.println("your regeister fees = "+regFess);
			double total = super.fees + regFess;
			System.out.println("name:"+name);
			System.out.println("mobile no:"+moNo);
			System.out.println("(fees+regfees) = Total:"+total);
			break;
		case 2:
			System.out.println("Enter your name:");
			String name1 = sc.next();
			System.out.println("Mobile no:");
			long moNo1 = sc.nextLong();
			System.out.println("Degree cource fees = "+feesDegree);
			System.out.println("your regeister fees = "+regFess);
			double total1 = super.feesDegree + regFess;
			System.out.println("name:"+name1);
			System.out.println("mobile no:"+moNo1);
			System.out.println("(fees + regfees )=Total:"+total1);
			break;
			default:
				System.out.println("not found");
		
		}
		 
		
		
	}
	

}