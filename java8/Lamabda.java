package com.java8;

 interface Lamabda {
	void display() ;
	
	public static void main(String[] args) {
		
		Lamabda l = () -> System.out.println("helloo");	
		l.display();
	}

}
