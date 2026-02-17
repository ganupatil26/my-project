package com.service;

import java.sql.ResultSet;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeService {
	
	EmployeeDao ed = new EmployeeDao();
	public void insertDate(Employee emp) throws Exception {
		int check = ed.insertData(emp);
		
		if(check > 0) {
			System.out.println("inserded");
		}else {
			System.out.println("fail");
		}
		
	}
	public void updateData(Employee emp) throws Exception {
		int check = ed.updateData(emp);
		
		if(check > 0) {
			System.out.println("update ");
		}else {
			System.out.println("update fail");
		}
		
	}
	public void deleteData(Employee emp) throws Exception {
		int check = ed.updateData(emp);
		
		if(check > 0) {
			System.out.println("deleted ");
		}else {
			System.out.println("delete fail");
		}
	}
	public void featchdata(Employee emp) throws Exception {
		
		ResultSet rs = ed.feacthData(emp);
		rs.close();
		
		
	}
}
