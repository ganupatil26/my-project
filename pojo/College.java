package com.pojo;

public class College {

	String clgNmae;
	String studName;
	int rollNo;
	long mobNo;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(String clgNmae, String studName, int rollNo, long mobNo) {
		super();
		this.clgNmae = clgNmae;
		this.studName = studName;
		this.rollNo = rollNo;
		this.mobNo = mobNo;
	}
	public String getClgNmae() {
		return clgNmae;
	}
	public void setClgNmae(String clgNmae) {
		this.clgNmae = clgNmae;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "College [clgNmae=" + clgNmae + ", studName=" + studName + ", rollNo=" + rollNo + ", mobNo=" + mobNo
				+ "]";
	}
	
	
}
