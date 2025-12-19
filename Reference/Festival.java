package com.Reference;

public class Festival {

	void m(College c) {
		c  = new College();		
		c.strenth();
		
		System.out.println("*********");
		
		c = new Civildep();
		c.strenth();
		System.out.println("*********");

		c = new Mechanicaldep();
		c.strenth();
		System.out.println("*********");

		c = new ComSciDep();
		c.strenth();

		System.out.println("*********");

	}

	public static void main(String[] args) {
		Festival f = new Festival();
		f.m(null);
	}

}
