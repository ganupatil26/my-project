package com.service;

import com.dao.StudentDao;

public class StudentService {

	public void InsertData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.InsertData();
	}
	public void updaateData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.updaateData();
	}
	public void fetchData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.fetchData();
	}
}
