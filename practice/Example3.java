package com.practice;

import java.util.Scanner;

public class Example3 {
	
    public static void main(String[] args) {
    	System.out.println("example3");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String s1 = sc.nextLine();          
            int n1 = Integer.parseInt(s1);

            System.out.print("Enter another number: ");
            String s2 = sc.nextLine();         
            int n2 = Integer.parseInt(s2);

            int result = n1 / n2;               
            System.out.println("Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter only numeric values.");
            System.out.println("Exception type:"+e);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception type:"+e);
        }
        catch (Exception e) {                  
            System.out.println("Some other error: " + e);
            System.out.println("Exception type:"+e);
        }

        System.out.println("Program completed.");
        sc.close();
    }
}


