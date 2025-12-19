package com.Reference;

class Familyinfo {

	void info(Home h) {
		h = new Home();
		h.name();
		h.age();
		System.out.println("-------------");
		h = new Father();
		h.name();
		h.age();
		System.out.println("-------------");
		h = new Mother();
		h.name();
		h.age();
		System.out.println("-------------");
		h= new Child1();
		h.name();
		h.age();
		System.out.println("-------------");
		h = new Child2();
		h.name();
		h.age();
		System.out.println("-------------");
		
	}
	public static void main(String[] args) {
		Familyinfo fi = new Familyinfo();
		fi.info(null);
	}

}
