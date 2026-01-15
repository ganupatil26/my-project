package com.arrays;


import java.util.Arrays;



public class Arrys1d {

	public static void main(String[] args) {

		int[] a = { 12,52,41,62,45};
		int[] b = { 2,5,4,6,9,4};
		System.out.println("a:-"+Arrays.toString(a));
		System.out.println("---sorting---");
		Arrays.sort(a);
		System.out.println("after sort:"+Arrays.toString(a));
		System.out.println("b:-"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("after sort:"+Arrays.toString(b));
		System.out.println("-------------");
		System.out.println("check value same or not:-"+Arrays.compare(a, b));
		System.out.println("length of arrays a:-"+a.length);
		System.out.println("lenghth of arrays  b:-"+b.length);
		
		System.out.println("--addition--");

		int add = 0;
		for (int i = 0; i < a.length; i++) {
			add = add + a[i];
		}
		int add1 = 0;
		for (int i = 0; i < b.length; i++) {
			add1 = add1 + b[i];

		}
		System.out.println("addtion of arrays a:" + add);
		System.out.println("addtion of arrays b" + add1);

		System.out.println("--avarage--");
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			avg = avg + a[i];
		}
		avg = avg / a.length;
		int avg1 = 0;
		for (int i = 0; i < b.length; i++) {
			avg1 = avg1 + b[i] ;
			}
		avg1 = avg1 / b.length;
		System.out.println("avarge of arrays a: " + avg);
		System.out.println("avaeage of arrays b: " + avg1);
		
		System.out.println("--a program to find the maximum element in a 1D array--");
		
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			if (max <a[i] ) {
				max = a[i];
			}
		}
		int maxb = b[0];
		for (int i=0;i<b.length;i++) {
			if (maxb < b[i]) {
				maxb = b[i];
			}
		}
		System.out.println("grater value of Arrays a: "+max);
		System.out.println("grater value of Arrays b: "+maxb);
		
		System.out.println("--minimum value--");
		int mina = a[0];
		for (int i=0;i<a.length;i++) {
			if (mina >a[i] ) {
				mina = a[i];
			}
		}
		int minb = b[0];
		for (int i=0;i<b.length;i++) {
			if (minb > b[i]) {
				minb = b[i];
			}
		}
		System.out.println("samllest value of Arrays a: "+mina);
		System.out.println("samllest value of Arrays b: "+minb);
		
		System.out.println("--reverce order--");
		System.out.println(Arrays.toString(a));
		
		for (int i =0;i <a.length;i++);
		System.out.println("reverce of arrays a ");
		for (int i = a.length-1;i >= 0;i--) {
			int rev = a[i];
			System.out.println(rev);
			}
		System.out.println("------");
		System.out.println(Arrays.toString(b));
		for (int i =0;i <b.length;i++);
		System.out.println("reverce of arrays b ");
		for (int i = b.length-1;i >= 0;i--) {
			int rev = b[i];
			System.out.println(rev);
			}	
		
		System.out.println("program to find duplicate elements in a 1D array");
		int dup = 12;
		for(int i =0;i < a.length;i++) {
			if(dup == a[i]) {
				System.out.println("exist:-"+dup);
				break;
			}
		}
		int dup1 = 4;
		for (int i =0;i<b.length;i++) {
			if (dup1 == b[i]) {
				System.out.println("exist:"+dup1);
				break;
			}
		}		
	}

}
