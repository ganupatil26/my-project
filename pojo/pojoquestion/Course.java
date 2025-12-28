package com.pojoquestion;

public abstract class Course {
//	abstract class Course → courseName, duration, abstract method fees()
//	class DegreeCourse and DiplomaCourse (override fees())
//	Student → id, name, HAS-A Course
//	final double REGISTRATION_FEE = 1000
//	Requirements:
//	Take student & course details using Scanner.
//	Choose course type dynamically (runtime polymorphism)
//	Total Fee = fees() + REGISTRATION_FEE
//	Try to change REGISTRATION_FEE and observe compile-time error.
//	Print complete student + course summary.
	String courceName;
	String duration;
	
	abstract void fees();
	
}