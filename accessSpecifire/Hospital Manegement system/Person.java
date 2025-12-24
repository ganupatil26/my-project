package com.accessSpecifire;

public abstract class Person {

	public String name = "raj patil";
	protected int age = 25;
	String city = "pune";
	private String adharNo = "212154543252";

	// public + method
	public void showPerson() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("City :" + city);
		System.out.println("adhar No :"+this.getAadhar());
	}

	// protected + without para with return type
	protected String getAadhar() {
		return adharNo;
	}

}
