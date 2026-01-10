package com.practice;

public class Bankmain {
	public static void main(String[] args) {

		BankAccount acc = new BankAccount(101, "Ganesh Patil", 5000);

		acc.deposit(2000);
		acc.withdraw(1500);
		System.out.println("account no:"+acc.getAccNo());
		System.out.println("account holder name:"+acc.getAccountHolderName());
		System.out.println("Current Balance: " + acc.getBalance());
	}
}