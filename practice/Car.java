package com.practice;

public class Car {

	String carType;
	Engine engine;
	public Car(String carType, Engine engine) {
		super();
		this.carType = carType;
		this.engine = engine;
	}
	public void disply() {
		engine.show();
		System.out.println("bike :"+carType);
	}
	
	
	
}
