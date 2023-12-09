package com.teena.vimal.devops;

public class Account {

	private long accountNumber;
	private String accountType;
	private double amount;
	
	public Account(long accountNumber, String accountType, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
