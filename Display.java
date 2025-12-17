package com.overload;

public class Display {
	
	void display (int a) {
		System.out.println("intger value :-"+a);
		
	}
	
	void display(String name) {
		System.out.println("String value"+name);
	}
	public static void main(String[] args) {
		Display d = new Display();
		d.display(5);
		d.display("patil");
	}

}
