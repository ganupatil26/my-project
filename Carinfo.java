package com.practiceeqes;

public class Carinfo {

	public static void main(String[] args) {
		
		Car c =new Car();
		c.setBrand("swift");
		c.setPrice(400000);
		
		System.out.println("brand:"+c.getBrand());
		System.out.println("price:"+c.getPrice());
	}
	

}
