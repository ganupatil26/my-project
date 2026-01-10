package com.practice;

public class Example6 implements Runnable {
	    @Override
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Child Thread: " + i);
	            try {
	                Thread.sleep(500); // pause for 500 ms
	            } catch (InterruptedException e) {
	                System.out.println("Child thread interrupted");
	            }
	        }
	    }
	}
