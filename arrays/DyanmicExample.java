package com.arrays;

import java.util.Scanner;

public class DyanmicExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("example1");
		System.out.println("Enter your vowels:");
		char [] vowels = new char[5];
		for (int i=0;i<vowels.length;i++) {
			 vowels[i] = sc.next().charAt(0);
		}
		System.out.println("---vowels---");
		for (int i=0;i<vowels.length;i++) {
			System.out.println(vowels[i]);
		}
		
		
		System.out.println("example1");
		System.out.println("Enter animal name:");
		String [] name = new String[3];
		for (int i=0;i<name.length;i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("---names---");
		for (int i =0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		
		System.out.println("---name---");
		String []name1 = new String[5]; 
		for (int i =0;i<name.length;i++) {
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		sc.close();
	}
}
