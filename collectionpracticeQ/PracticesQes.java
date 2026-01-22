package com.collectionpracticeQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PracticesQes {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
//		Create an ArrayList and add 5 integers to it.
		l.add(5);
		l.add(4);
		l.add(25);
		l.add(12);
		l.add(3);
		System.out.println("--add 5 integers--");
		System.out.println(l);

//		Write a program to display all elements of a List using for-each loop.
		System.out.println("--using for-each loop display--");
		for (Integer integer : l) {
			System.out.println(integer);
		}

//	Add an element at a specific index in an ArrayList.
		System.out.println("--add element specific index--");
		l.add(5, 55);
		System.out.println(l);

//	Remove an element from a List using index.
		System.out.println("--remove using index num--");
		l.remove(4);
		System.out.println(l);

//	 Find the size of a List.
		System.out.println("-- Find the size of a List.--");
		System.out.println(l.size());

//	Check whether a List is empty or not.

		System.out.println("--list is empty or not--");
		System.out.println(l.isEmpty());
		
		
//	Retrieve an element from a List using get() method.
		System.out.println("--retrive an element using get method--");
		System.out.println(l.get(2));
		
//Create a HashSet and add 5 string values.
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println("******************");
		System.out.println("--create a hash set and add 5 String value--");
		hs.add("raj");
		hs.add("ganesh");
		hs.add("sanket");
		hs.add("rahul");
		hs.add("om");
		System.out.println(hs);
//		 Display all elements of a Set using for-each loop.
		System.out.println("--for each loop print hashset--");
		
		for (String string : hs) {
			System.out.println(string);
		}
		
//		Check whether a specific element exists in a Set.
		System.out.println("-- raj is exist or not in set --");
		System.out.println(hs);
		System.out.println(hs.contains("raj"));
		
		
//		Remove an element from a Set.
		System.out.println("--remove ganesh --");
		System.out.println(hs.remove("ganesh"));
		System.out.println("after remove = "+hs);		
		
//		Find total number of elements in a Set.
		System.out.println("--find size of hashset--");
		System.out.println(hs.size());
		
//		Create a HashMap and store Roll No as key and Name as value.
		System.err.println("*******************");
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(1, "rahul");
		hm.put(2, "raj");
		hm.put(3, "divya");
		hm.put(4, "puja");
		hm.put(5, "om");
		 System.out.println(hm.entrySet());
//		 Retrieve a value using a key from Map.
		 
//		 Check whether a key exists in Map.
		 System.out.println("--key exist or not--");
		 System.out.println(hm);
		 System.out.println("4 key is exist or not");
		 System.out.println(hm.containsKey(4));
		 
//		 Check whether a value exists in Map.
		 System.out.println("--value is exist or not--");
		 System.out.println(hm);
		 System.out.println("raj = value is exist ");
		 System.out.println(hm.containsValue("raj"));
//		 Remove an entry from Map using key.
//		 Find the size of a Map.
		 System.out.println("--remove entry --");
		 System.out.println(hm.remove(4));
		 System.out.println(hm);
		 System.out.println("size of hashset - "+hm.size());
	
	}
}
