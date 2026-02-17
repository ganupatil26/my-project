package com.model;



public class Employee {
	private int empid;
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	private String Gender;
	private String Department;
	private String dob;
	private String city;
	private double salary;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDOB() {
		return dob;
	}
	public void setDOB(String dOB) {
		dob = dOB;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public Employee() {
	
	}
	public Employee(int empid, String name, String email, int age, long mobileNo, String gender, String department,
			String dob2, String city, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.Gender = gender;
		this.Department = department;
		this.dob = dob;
		this.city = city;
		this.salary = salary;
	}
	
	
	
	

}
