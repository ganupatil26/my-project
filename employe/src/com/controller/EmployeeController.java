package com.controller;

import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) throws Exception {
		EmployeeService es = new EmployeeService();
//		es.updateData();
//		es.deleteData();
		es.featchallRecord();
//		es.inesrtData();
	}
}
