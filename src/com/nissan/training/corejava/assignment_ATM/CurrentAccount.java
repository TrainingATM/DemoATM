package com.nissan.training.corejava.assignment_ATM;

public class CurrentAccount extends Account{
	public CurrentAccount(int number, int balance) {
		super(number, balance);
//		this.number = number;
//		this.balance = balance;
	}
	
	
	@Override
	public void withdraw(int amount) throws InsufficientBalanceException {
		
		if(balance-2000<amount)
		{
		
			throw new InsufficientBalanceException(" ");
			
		}
		else {
			this.balance-=amount;
		}

	}
}
