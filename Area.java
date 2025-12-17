package com.overload;

public class Area {

	double area(double radius) {
	        return Math.PI * radius * radius;
	}
	double area(double length, double breadth) {
			return length * breadth;
	  
	}
	public static void main(String[] args) {
        Area a = new Area();

        double circleArea = a.area(5.0); 
        double rectArea   = a.area(4.0, 6.0);        

        System.out.println("Area of circle = " + circleArea);
        System.out.println("Area of rectangle = " + rectArea);
    }
	
}

