package com.nissan.training.corejava.assignment_ATM;

import java.util.ArrayList;

public class Bank implements IBank{

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
	

	@Override
	public void manages() {}
	
	@Override
	public void maintains() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
