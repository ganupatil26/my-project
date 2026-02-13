package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void featchallRecord() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.fetchAllRecord();
	}

	public void inesrtData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.inesrtData();
	}

	public void deleteData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();
	}

	public void updateData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
	}
}
