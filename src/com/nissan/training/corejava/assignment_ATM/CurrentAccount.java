package com.nissan.training.corejava.assignment_ATM;

public class CurrentAccount extends Account{
	
	/**
	 * 
	 * @param number
	 * @param balance
	 */
	public CurrentAccount(int number, int balance) {
		super(number, balance);
		
		//	this.number = number;
		//	this.balance = balance;
	}
	
	
	@Override
	public void withdraw(int amount) throws InsufficientBalanceException {
		
		//current account must have 2000Rs in account
		if(balance-2000<amount)
		{
		
			throw new InsufficientBalanceException(" ");
			
		}
		else {
			this.balance-=amount;
		}

	}
}
