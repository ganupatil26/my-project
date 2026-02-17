package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Employee;

public class EmployeeDao {
	
	public int insertData(Employee emp) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		 
		PreparedStatement ps = c.prepareStatement("insert into employeeinfo values(?,?,?,?,?,?,?,?,?,?)");
		
		ps.setInt(1, emp.getEmpid());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getName());
		ps.setInt(4, emp.getAge());
		ps.setLong(5, emp.getMobileNo());
		ps.setString(6, emp.getGender());
		ps.setString(7, emp.getDepartment());
		ps.setString(8, emp.getDOB());
		ps.setString(9, emp.getCity());
		ps.setDouble(10,emp.getSalary());
		 
		int check = ps.executeUpdate();
		
		ps.close();
		return check;
		
	}
	public int updateData(Employee emp) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		 
		PreparedStatement ps = c.prepareStatement("update employeeinfo set name = ? where empid = ?");
		
		ps.setString(1, emp.getName());
		ps.setInt(2, emp.getEmpid());	
		int check = ps.executeUpdate();
		if(check > 0 ) {
			System.out.println("updated");
		}else {
			System.out.println("failed");
		}
		ps.close();
		return check;
		
	}
	public int deleteData(Employee emp) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		 
		PreparedStatement ps = c.prepareStatement("delete from employeeinfo where empid = ?");
		
		
		ps.setInt(1, emp.getEmpid());	
		
		int check = ps.executeUpdate();
		if(check > 0) {
			System.out.println("deleted");
		}else {
			System.out.println("failed");
		}
		ps.close();
		return check;
		
	}
	
		
		
	public ResultSet feacthData(Employee emp) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root123");
		 
		PreparedStatement ps = c.prepareStatement("select * from employeeinfo");
		
	
		ResultSet rs= ps.executeQuery();
		 while (rs.next()) {
			 System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getLong(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getDouble(10));
		 }
		
		ps.close();
		return rs;
		
		
	}
}
