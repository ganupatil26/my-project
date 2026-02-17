package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public void InsertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","root123");
		
		PreparedStatement ps = c.prepareStatement("insert into studentinfo (id,name)values(?,?)");
		ps.setInt(1, 41);
		ps.setString(2,"raj");
		int check =ps.executeUpdate();
		if(check > 0) {
			System.out.println("insert okk...");
		}else {
			System.out.println("not inserted..");
		}
		ps.close();
	}
	public void updaateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root123");
	
		PreparedStatement ps = c.prepareStatement("update studentinfo set id = ? , name = ? where id = ?");
		ps.setInt(1,5);
		ps.setString(2,"rohan");
		ps.setInt(3,45);
	
		int check = ps.executeUpdate();
		if(check >= 0) {
			System.out.println("upadated");
		}else {
			System.out.println("failed");
		}
		ps.close();
	}
	public void fetchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root123");
		
		PreparedStatement ps = c.prepareStatement("select * from studentinfo");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
		}
		ps.close();
		
	}
}
