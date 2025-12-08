package com.practiceeqes;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	 public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Withdraw amount must be positive.");
	        } else if (amount > balance) {
	            System.out.println(" Cannot withdraw " + amount);
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	    }
	    public double balance() {
	        return balance;
	    }
	    

	
	
}
