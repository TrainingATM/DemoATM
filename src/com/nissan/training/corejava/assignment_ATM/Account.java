package com.nissan.training.corejava.assignment_ATM;

 public class Account {
	private int number;
	protected int balance;
	
	
	
	
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	// This function takes amount to be deposited in the account as parameter
	// and increments the balance.
	public void deposit(int amount) { 
		
		this.balance+=amount;
	}
	
	
	// This function takes amount to be withdrawn as parameter checks the balance
	// and decrements the balance.
	
	public void withdraw(int amount) {
		
			if(balance<amount)
			{
				try {
					throw new InsufficientBalanceException("Insufficient Balance");
				}catch(InsufficientBalanceException msg) {
					System.out.println(msg);
				}
			}
			else {
				this.balance-=amount;
			}
	
	}
	
	public void CreateTransaction() {
		
	}
	
	
	
}
