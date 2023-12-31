package com.teena.vimal.devops;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private long customerid;
	private String customername;
	private String emailAddress;
	private String phone;
	private String password;
	public static List<Customer> customerList = new ArrayList<Customer>();
	public Customer(long customerid, String customername, String emailAddress, String phone,String password) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emailAddress = emailAddress;
		this.phone = phone;
		this.password = password;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer details: customerid=" + customerid + ", customername=" + customername + ", emailAddress="
				+ emailAddress + ", phone=" + phone;
	}
	
	
   
}
