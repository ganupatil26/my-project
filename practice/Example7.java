package com.practice;

public class Example7  extends Thread {
	    @Override
	    public void run() {
	        System.out.println("Running in run method ");
	    }
	    public void run(int a) {
	    	System.out.println("a"+a);
	    }

	    public static void main(String[] args) {
	        Example7 e7 =new Example7();
	       e7.run(6);
	        e7.start();
	        

	       
	    }
	}


