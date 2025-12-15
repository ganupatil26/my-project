package com.scanner;
import java.util.Scanner;

public class AreaofReact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // create Scanner [web:21][web:27]

        System.out.println("Enter length:");
        double length = sc.nextDouble();                          // read length [web:22][web:30]

        System.out.println("Enter width:");
        double width = sc.nextDouble();                           // read width [web:22][web:27]

        double area = length * width;                             // area = length * width [web:21][web:26]

        System.out.println("Area of rectangle = " + area);        // print area [web:22][web:24]

        sc.close();                                               // close Scanner [web:21]
    }
}
