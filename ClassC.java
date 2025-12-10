package com.inheritance;

public class ClassC extends ClassB{
	public void showC() {
		System.out.println("show method from classC");
	}
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.ShowA();
		c.showB();
		c.showC();
	}

}
