package com.pojo;

public class Student {
	String name;
	String clgName;
	int age;
	String std;
	String div;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String clgName, int age, String std, String div) {
		super();
		this.name = name;
		this.clgName = clgName;
		this.age = age;
		this.std = std;
		this.div = div;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", clgName=" + clgName + ", age=" + age + ", std=" + std + ", div=" + div
				+ "]";
	}

}
