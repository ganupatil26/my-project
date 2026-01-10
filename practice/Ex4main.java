package com.practice;

public class Ex4main extends Example4{
		 public static void main(String[] args) {
//			 Write a program to create a thread using Thread class.
			 
		     Ex4main e4= new Ex4main();
		     e4.start();
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
