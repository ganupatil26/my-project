package com.java8;


import java.util.Arrays;
import java.util.List;


public class StreamExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

		System.out.println("Original List:");
		System.out.println(numbers);

		// Filter numbers greater than 10
		System.out.println("\nNumbers greater than 10:");
		numbers.stream().filter(n -> n > 10).forEach(System.out::println);

		// Multiply number by 2 using map()
		System.out.println("\nMultiply each number by 2:");
		numbers.stream().map(n -> n * 2).forEach(System.out::println);

		// Sort numbers
		System.out.println("\nSorted Numbers:");
		numbers.stream().sorted().forEach(System.out::println);

		// Count numbers greater than 10
		long count = numbers.stream().filter(n -> n > 10).count();

		System.out.println("\nCount of numbers > 10: " + count);

		

		
	}
}