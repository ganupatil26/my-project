package com.practice;

public class Example2 {
//	Create a custom exception InvalidAgeException and throw it using throw.
    public void checkAge(int age) {
    	System.out.println("exmaple 2");
        if (age < 18) {
        	System.out.println("age:"+age);
            throw new ArithmeticException("Not eligible to vote");
            
        }else {
        	System.out.println("age:"+age);
        System.out.println("Eligible to vote");
    }
    }

   
}

