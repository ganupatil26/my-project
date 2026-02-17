package com.controller;

import java.util.Scanner;

import com.service.StudentService;

public class StudentController {
	
	public static void main(String[] args) throws Exception {
		StudentService ss = new StudentService();
		
//		ss.InsertData();
//		ss.updaateData();
		ss.fetchData();
	}

}
