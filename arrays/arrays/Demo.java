package com.arrays;

import java.util.Scanner;

public class Demo {

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		System.out.println("Enter"+n+"elemtns:");
		for(int i =0;i<n;i++) {
			num[i] =sc.nextInt();
		}
		System.out.println("arrya elements:");
		for (int i = 0; i<n;i++) {
			System.out.println(num[i]+" ");
		}
		System.out.println("---addtion---");
		int add =0;
		for (int i = 0; i < n ;i++) {
			add = num[i] + add;
		}
		System.out.println("total:" + add);
		sc.close();
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.input();
	}
}
