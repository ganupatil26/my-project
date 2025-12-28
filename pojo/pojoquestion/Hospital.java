package com.pojoquestion;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Patient id: ");
		int id = sc.nextInt();
		System.out.println("enter Patient name:");
		String name = sc.next();
		System.out.println("enter Patient age:");
		int age = sc.nextInt();

		
		System.out.println("Enter doctor id:");
		int dId = sc.nextInt();
		System.out.println("Enter doctor name:");
		String docName = sc.next();
		System.out.println("specilizaition:");
		String spec = sc.next();

		
		System.out.println("Room no:");
		int room = sc.nextInt();
		System.out.println("type:");
		String tyep = sc.next();
		sc.close();
		Patient p = new Patient(id, name, age);
		System.out.println("patient deatils ");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		Doctor d = new Doctor(dId, docName, spec);
		System.out.println("doctor details");
		System.out.println(dId);
		System.out.println(docName);
		System.out.println(spec);
		Room r = new Room(room, tyep);
		System.out.println("room");
		System.out.println(room);
		System.out.println(tyep);

	}
}
