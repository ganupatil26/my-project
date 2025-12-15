package com.scanner;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // create Scanner [web:31][web:37]

        System.out.print("Enter a number: ");
        int num = sc.nextInt();                            // read integer [web:31][web:40]

        if (num % 2 == 0) {                                // divisible by 2 → even [web:32][web:36]
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");           // otherwise odd [web:31][web:38]
        }

        sc.close();                                        // close Scanner [web:31]
    }
}
