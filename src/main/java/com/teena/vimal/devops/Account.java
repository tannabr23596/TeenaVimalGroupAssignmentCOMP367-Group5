package com.teena.vimal.devops;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private long accountNumber;
	private String accountType;
	private double amount;
	private long customerid;
	public static List<Account> accountList = new ArrayList<Account>();
	
	public Account(long accountNumber, String accountType, double amount,long customerid) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount = amount;
		this.customerid =customerid;
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

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	
	
	
}
