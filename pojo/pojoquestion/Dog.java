package com.pojoquestion;

public class Dog extends Animal{

	@Override
	void sound() {
		super.sound();
		this.dog();
	}
	void dog(){
		System.out.println("class dog");
	}
	
	

}
