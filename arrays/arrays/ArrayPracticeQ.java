package com.arrays;

public class ArrayPracticeQ {

	public static void main(String[] args) {

		int[] num = { 5, 8, 2, 9, 6,2,6,8};
		// adition of arrys
		int add = 0;
		for (int i = 0; i < num.length; i++) {
			add = add + num.length;
		}
		System.out.println("total:" + add);
		System.out.println("--revrce number--");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}
		System.out.println("--Greter number num--");
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];

			}

		}
		System.out.println(max);

		int min = num[0];
		System.out.println("--samllest number num--");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];

			}

		}
		System.out.println(min);
		System.out.println("---even odd numbers---");
		int even = num[0];
		int odd = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even = num[i];
				System.out.println("even num:" + even);
			}
			if (num[i] % 2 == 1) {
				odd = num[i];
				System.out.println("odd num:" + odd);
			}
		}
		 System.out.println("--copy number array into anaother aRRY--");
		int[] copy = new int[num.length];
		for(int i =0;i<num.length;i++) {
			copy[i] = num[i];
			 System.out.println(copy[i]);
		}		
	}

}
