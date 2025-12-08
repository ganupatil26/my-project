package com.practiceeqes;

public class Product {
	
	private String name;
	private String code;
	private double price;
	
	public Product() {}
	
	public Product(String name,String code,double price) {
		this.name =name;
		this.code = code;
		this.price =price;
		
	}
	public String getName() {
		return name;
	}
		public String getCode() {
		return code;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		if (name!=null && !name.isEmpty()) {
			this.name = name;
		}
	}
	public void setCode(String code) {
		if (name!=null && !name.isEmpty()) {
			this.code=code;
		}
	}
	public void setPrice(double price) {
		if(price>=0) {
			this.price =price;
		}
	}
	
	//calculation 
	public void calDiscount(double percentage) {
		if (percentage > 0 && percentage <=100) {
			this.price -=this.price * (percentage / 100.0);
					 System.out.println("Discount of " + percentage + "% applied. New price: $" + this.price);
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }


//display satiii method 
public void display() {
	System.out.println("product:"+ name);
	System.out.println("code:"+ code);
	System.out.println("price :$"+ price);
}
}


