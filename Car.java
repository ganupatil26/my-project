package com.constructor;

public  class Car {
	String name;
	String fuelType;
	String carNo;
	String year;
	String price;

	 Car (String name, String fuelType,String carNo, String year,String price ){
	    this.name = name;
	    this.fuelType = fuelType;
	    this.carNo =carNo;
	    this.year =year;
	    this.price = price;
	    this.DisplayDetial();
	    }
	    
	    void DisplayDetial() {
	    	
	    	System.out.println("Car owenr name:"+name);
	    	System.out.println("Car fuelType :"+fuelType);
	    	System.out.println("Car no :"+carNo);
	    	System.out.println("Car perches year :"+year);
	    	System.out.println("Car price:"+price);
	    	}
}
