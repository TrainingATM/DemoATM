package com.nissan.training.corejava.assignment_ATM;

public class CurrentAccount extends Account{
	@Override
	public void withdraw(int amount) {
		
		if(balance-2000<amount)
		{
			try {
				throw new InsufficientBalanceException("Minimum Balance 2000");
			}catch(InsufficientBalanceException msg) {
				System.out.println(msg);
			}
		}
		else {
			this.balance-=amount;
		}

	}
}
