package serialization;

import java.io.Serializable;
import java.util.Scanner;

public class Demo implements Serializable {

	String collegeName;
	String city;
	String name;
	int rollNo;
	long mobileNo;
	long pincode;
	String dep;
	public Demo(String collegeName, String city, String name, int rollNo, long mobileNo, long pincode, String dep) {
		super();
		this.collegeName = collegeName;
		this.city = city;
		this.name = name;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
		this.pincode = pincode;
		this.dep = dep;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

	
}
