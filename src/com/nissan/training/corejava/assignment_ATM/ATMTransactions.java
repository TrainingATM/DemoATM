package com.nissan.training.corejava.assignment_ATM;

import java.util.Date;

public class ATMTransactions {
	private int transaction_ID;
	private Date date;
	private String type;
	private int amount;
	private int postBalance;
	
	public void modifies()
	{
		
	}

	public int getTransaction_ID() {
		return transaction_ID;
	}

	public void setTransaction_ID(int transaction_ID) {
		this.transaction_ID = transaction_ID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPostBalance() {
		return postBalance;
	}

	public void setPostBalance(int postBalance) {
		this.postBalance = postBalance;
	}
	
	
}
