package com.practiceeqes;

public class ProductInfo {

	public static void main(String[] args) {
		
		
		Product p = new Product("laptop", "LT001", 54000.0);
		
		System.out.println("before discount:");
		p.display();
		
		p.calDiscount(10); 
		System.out.println("after discount:");
		p.display();

	}

}
