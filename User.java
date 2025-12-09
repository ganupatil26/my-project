package com.inheritance;

public class User {

	public static void main(String[] args) {
		System.err.println("1st exmple");
		
		Cat c =new Cat();
		c.eat();
		c.running();
		c.sleep();
		c.color();
		c.sound();
		System.out.println("_____________________________________");
		
		Dog d = new Dog() ;
		d.eat();
		d.running();
		d.sleep();
		d.color();
		
		System.out.println("**************************************");
		System.err.println("2nd exmple");

		
		Cafe c1 = new Cafe();
		c1.Arrange();
		c1.Best();
		c1.Park();
		c1.Quality();
		c1.Service();
		c1.Price();
		System.out.println("_____________________________________");
		
		BooksShop bs = new BooksShop();
		bs.Arrange();
		bs.Park();
		bs.Best();
		bs.reading();
		bs.Laung();
		bs.Book();
		
		System.out.println("**************************************");
		System.err.println("3rd exmple");
		Splendor s  = new Splendor();
		s.FuelType();
		s.license();
		s.NoPlate();
		s.Fuels();
		s.Strength();
		System.out.println("_____________________________________");
		
		Swift s1 = new Swift();
		
		s1.FuelType();
		s1.license();
		s1.FeulD();
		s1.NoPlate();
		s1.Strength();
		
	
		
		
		
		
		
		

	}

}
