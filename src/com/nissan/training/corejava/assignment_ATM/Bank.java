package com.nissan.training.corejava.assignment_ATM;

import java.util.ArrayList;

public class Bank {

	//bank details
	public String code;
	public String address;
	private String name;
	
	//Account and customer array list
	public ArrayList<Account> accountList;
	public ArrayList<Customer> customerList;
	
	public Bank(String code, String address, String name) {
		this.code = code;
		this.address = address;
		this.name = name;
		accountList = new ArrayList<>();
		customerList = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		this.accountList.add(account);
	}
	
	public void addCustomer(Customer customer) {
		this.customerList.add(customer);
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void manages() {}
	public void maintains() {}
}
