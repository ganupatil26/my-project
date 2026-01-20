package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PracticeQestion {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(10);
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(1);
		System.out.println(list);
//		Write a Java program to add, update, and remove elements from a List.

		list.addFirst(14);
		list.remove(2);
		list.add(2, 5);
		System.out.println(list);
		// Write a Java program to find the size of a List and print the first and last
		// element.
		System.out.println("1st and last elemnet print");
		System.out.println("size  of array:-" + list.size());
		System.out.println("1st num:-" + list.getFirst());
		System.out.println("last num:-" + list.getLast());
		// Write a Java program to check whether a given element exists in a List or
		// not.
		if (list.contains(6)) {
			System.out.println("num found");
		} else {
			System.out.println("not found");
		}
//		Write a Java program to iterate a List using:
		System.out.println("--list iterate--");

		ListIterator<Integer> it = list.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
//		for-each loop
		System.out.println("--using for each loop iterate");
		for (Integer itr : list) {
			System.out.println(itr);
		}
//        Write a Java program to sort a List of integers in ascending order.Write a Java program to sort a List of integers in ascending order.

		System.out.println("sort arrays");

		Collections.sort(list);
		System.out.println(list);
//		Write a Java program to remove duplicate elements from a List.
//		Write a Java program to reverse elements of a List.

		System.out.println("--reverce num--");
		System.out.println(list.reversed());

//	Write a Java program to copy all elements from one List to another List.

		System.out.println("--copy one  arrays another array--");
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(54);
		list1.add(5552);
		System.out.println("this arrays move in list1:-"+list);
		list1.addAll(list);
		System.out.println("2nd arrays :-"+list1);
		Collections.sort(list1);
		System.out.println("sorted arryas:-"+list1);
	}
}
