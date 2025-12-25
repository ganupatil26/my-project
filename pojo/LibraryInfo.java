package com.pojo;

import java.util.Scanner;

public class LibraryInfo {

	
	public static void main(String[] args) {
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		System.out.println("Mobile no:");
		long mob = sc.nextLong();
		
		System.out.println("Book name:");
		String b = sc.next();
		sc.close();
		 Library l = new Library(n,mob ,b);
				 System.out.println(l);
		
		
	}

}
