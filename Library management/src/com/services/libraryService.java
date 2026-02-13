package com.services;

import com.dao.libraryDao;

public class libraryService {
	
	public void insertData() throws Exception {
		libraryDao ld = new libraryDao();
		ld.insertdata();
	}
	public void updateData() throws Exception {
		libraryDao ld =new libraryDao();
		ld.updateData();
	}
	public void deleteData() throws Exception {
		libraryDao ld =new libraryDao();
		ld.deleteData();
	}

	public void featchData() throws Exception {
		libraryDao ld =new libraryDao();
		ld.featchData();
	}
}
