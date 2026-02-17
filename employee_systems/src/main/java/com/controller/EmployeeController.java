package com.controller;



import java.util.Scanner;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	Employee em = new Employee();
	EmployeeDao dao = new EmployeeDao();
	
	public void Case() throws Exception {
		Scanner sc = new Scanner(System.in);

		EmployeeService es = new EmployeeService();
		while (true) {
			System.out.println("menu");
			System.out.println("1.insert data ");
			System.out.println("2.update");
			System.out.println("3.delete");
			System.out.println("4.featch data");

			System.out.println("choose:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter your empId:");
				em.setEmpid(sc.nextInt());
				System.out.println("Enter your name:");
				em.setName(sc.next());
				System.out.println("Enter your email:");
				em.setEmail(sc.next());
				System.out.println("Enter your age:");
				em.setAge(sc.nextInt());
				System.out.println("Enter your mobileNo:");
				em.setMobileNo(sc.nextLong());
				System.out.println("Enter your gender:");
				em.setGender(sc.next());
				System.out.println("Enter your department:");
				em.setDepartment(sc.next());
				System.out.println("Enter your DOB (yyyy-mm-dd):");
				em.setDOB(sc.next());
				System.out.println("Enter your city:");
				em.setCity(sc.next());
				System.out.println("Enter your salary:");
				em.setSalary(sc.nextDouble());
				sc.close();
				dao.insertData(em);
				break;
			case 2:
				System.out.println("enter id");
				em.setEmpid(sc.nextInt());
				System.out.println("enter update name:");
				em.setName(sc.next());
				dao.updateData(em);
				break;
			case 3:
				System.out.println("enter delte id:");
				em.setEmpid(sc.nextInt());
				dao.deleteData(em);
				
				break;
			case 4:
				
				es.featchdata(em);
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		EmployeeController ed = new EmployeeController();
		ed.Case();
	}
}
