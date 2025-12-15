package com.scanner;

import java.util.Scanner;

public class TotalMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    
        
        System.out.println("Enter marks of 5 subjects:");       
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();                                 

        int total = s1 + s2 + s3 + s4 + s5;                     
        double percentage = (total / 500.0) * 100;             

        System.out.println("Total marks = " + total);           
        System.out.println("Percentage = " + percentage);               
        sc.close();                                           
    }
}
