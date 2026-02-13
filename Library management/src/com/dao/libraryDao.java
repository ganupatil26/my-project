package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class libraryDao {

	public void insertdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarymanagement","root","root123");
		
		Statement s = c.createStatement();
		
		int check = s.executeUpdate("insert into library(bookName,bookAuthor,bookPrice)values('java programming','james coslin',500)");
		
		if(check >= 0) {
			System.out.println("data is inserted");
		}else {
			System.out.println("data is not inserted");
		}
		s.close();
	}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarymanagement", "root", "root123");
		
		Statement s = c.createStatement();
		s.executeUpdate("update library set bookPrice = '600' where bookId = 1");
		 System.out.println("data is update");
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarymanagement", "root", "root123");
		Statement s = c.createStatement();
		s.executeUpdate("delete from library where bookId = 2");
		s.close();
		System.out.println("data is deleted");
				
	}
	public void featchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarymanagement", "root", "root123");
		Statement s = c.createStatement();
		ResultSet r =  s.executeQuery("select * from library");
		
		while (r.next()) {
			System.out.println(r.getInt(1)+"  "+r.getString(2)+"  "+r.getString(3)+"  "+r.getString(4));
		}
		s.close();
		
	}	
}
