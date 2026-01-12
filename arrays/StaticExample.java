package com.arrays;

class StaticExample {

	public static void main(String[] args) {
		System.out.println("------Example1------");
		System.out.println(" marks	");
		int[] marks = {45,48,41,42,45};
		for (int i =0;i< marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("------Example2------");
		System.out.println(" fruits	");

		String [] fruits = {"Mango","Bannana","Orange","Strawbery","Apple"};
		for (int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("------Example3------");
		System.out.println(" city	");

		String []city= {"Miraj","Sangli","Pune","Mumbai","Latur"};
		for (int i =0;i<city.length;i++) {
			System.out.println(city[i]);
		}
		System.out.println("------Example4------");
		System.out.println(" vowels	");

		char [] vowels= {'a','e','i','o','u'};
		for(int i =0;i <vowels.length;i++) {
			System.out.println(vowels[i]);
		}
		System.out.println("------Example5------");
		System.out.println(" animal	");

		String [] animal= {"Dog","Cat","Cow","Ox"};
		for(int i =0;i <animal.length;i++) {
			System.out.println(animal[i]);
		}
	}
}