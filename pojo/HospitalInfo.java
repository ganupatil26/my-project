package com.pojo;

import java.util.Scanner;

public class HospitalInfo {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("patient name:");
		String pname = sc.next();

		System.out.println("patient age:");
		int page = sc.nextInt();

		System.out.println("Disease/problem:");
		String pProblem = sc.next();

		System.out.println("Doctor name:");
		String dr = sc.next();
		
		System.out.println("Doctor Mobile no:");
		long mn = sc.nextInt();
		
		
		sc.close();
		
		Hospital h = new Hospital(pname, page, pProblem, pname, mn);
		System.out.println(h);
		System.out.println("Doctor (specialization):"+h.typeDr);
	}
}
