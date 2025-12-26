package com.pojoquestion;

public class Cat extends Dog {
	void sound() {
		super.sound();
		this.cat();
	}
	void cat() {
	System.out.println("class cat");
}
	
}
