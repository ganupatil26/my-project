package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class ListTypes {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("print 5 element");
		al.add(4);
		al.add(5);
		al.add(2);
		al.add(2);
		al.add(9);
		System.out.println(al);
		System.out.println("--even no---");
		 for (int x : al) {
	            if (x % 2 == 0) {
	                System.out.print(x + " ");
	            }
	        }
		 System.out.println();
		 System.out.println("-- addtion --");
		int add =0;
		 for(int y :al) {
			 add = add + y;
			 
		 }
		 System.out.print(add+" ");
			System.out.println();
		 System.out.println("-- large no --");
		int large = 0;
		for (int z : al) {
			if(large < z) {
				large = z;
			}
			
		}
		System.out.println(large);
		System.out.println();
		
		System.out.println("-- change value index number 3");
		System.out.println(al);
		al.set(3,45);
		System.out.println("change value "+al);
	}
	}
