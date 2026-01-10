package com.practice;

class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(int accNo, String name, double initialBalance) {
		accountNumber = accNo;
		accountHolderName = name;
		balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited Amount: " + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn Amount: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}

	public int getAccNo() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;

	}
}
