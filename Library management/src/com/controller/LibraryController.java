package com.controller;

import com.services.libraryService;

public class LibraryController {
public static void main(String[] args) throws Exception {
	libraryService ls = new libraryService();
//	ls.insertData();
//	ls.updateData();
//	ls.deleteData();
	ls.featchData();
}
}
