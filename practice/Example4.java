package com.practice;

class Example4 extends Thread {

 @Override
 public void run() {
	// Write a program to create a thread using Thread class.
     for (int i = 1; i <= 5; i++) {
         System.out.println("Child Thread: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println("Child thread interrupted");
         }
     }
 }
}
