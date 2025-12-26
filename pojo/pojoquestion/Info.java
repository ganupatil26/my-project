package com.pojoquestion;

import java.util.Scanner;


public class Info extends Book {
	
	public Info(int id, String title, String author) {
		super(id, title, author);
		Scanner sc = new Scanner(System.in);
		System.out.println("id:");
		id = sc.hashCode();
		System.out.println("titile:");
		title = sc.next();
		System.out.println("author:");
		author = sc.next();
		System.out.println("latefee:"+super.lateFee);
		sc.close();
		
		
	}

	public static void main(String[] args) {
				
		

}
}