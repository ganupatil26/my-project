package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

	public void fetchAllRecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		Statement s = c.createStatement();

		 ResultSet rs =s.executeQuery("select * from employeeinfo");
		  
		 while (rs.next()) {
			 System.out.println(rs.getInt(2));
		 }

		c.close();
	}
	public void inesrtData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		Statement s = c.createStatement();

		int check = s.executeUpdate("insert into employeeinfo (name,city,mobileNo,Gender,DOB,Email,Departmaent,Salary)values('raj takare','pune',1122554411,'Male','26/01/2006','Raj@123','sales',20000)");
		
		if (check >= 0) {
			System.out.println("data is insertede");
		}else {
			System.out.println("not inserted");
		}
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		Statement s = c.createStatement();

		s.executeUpdate("delete from employeeinfo where empId = 1");
		System.out.println("data is deleted");
		
		c.close();
	}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		Statement s = c.createStatement();

		s.executeUpdate("update employeeinfo set name = 'rahul mane' where empId = 2");
		System.out.println("data is update");
		c.close();
	}
}
