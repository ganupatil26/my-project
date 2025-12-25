package com.pojo;

public class Library {
	
	String name;
	long mobNo;
	String bookName;
	public Library() {
		super();
		
	}
	
	
	public Library(String name, long mobNo, String bookName) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.bookName = bookName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobNo() {
		return mobNo;
	}


	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "Library [name=" + name + ", mobNo=" + mobNo + ", bookName=" + bookName + "]";
	}
	
	
	
	

}
