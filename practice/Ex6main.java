package com.practice;

public class Ex6main extends Example6 {
	public static void main(String[] args) {
		Ex6main e6 = new Ex6main();
		e6.run();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		}
	}
}
