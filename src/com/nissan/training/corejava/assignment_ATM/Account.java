package com.nissan.training.corejava.assignment_ATM;

 public class Account {
	private int number;
	protected int balance;
	

	/**
	 * 
	 * @param number
	 * @param balance
	 */
	public Account(int number, int balance) {
//		super();
		this.number = number;
		this.balance = balance;
	}


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
	
	/**
	 * 
	 * @param amount
	 */
	public void deposit(int amount) { 
		
		this.balance+=amount;
	}
	
	
	// This function takes amount to be withdrawn as parameter checks the balance
	// and decrements the balance.
	
	/**
	 * 
	 * @param amount
	 * @throws InsufficientBalanceException
	 */
	public void withdraw(int amount)throws InsufficientBalanceException {
		
			if(balance<amount)
			{
//				try {
					throw new InsufficientBalanceException("Insufficient Balance");
//				}catch(InsufficientBalanceException msg) {
//					System.out.println(msg);
//				}
			}
			else {
				this.balance-=amount;
			}
	
	}
	
	/**
	 * 
	 * @param isDeposit
	 * @param amount
	 * @throws InsufficientBalanceException
	 */
	public void createTransaction(boolean isDeposit,int amount)throws InsufficientBalanceException {
		
		ATMTransactions oneTransaction = new ATMTransactions();
		
		if(isDeposit) {
			
			deposit(amount);
		}
		else {
			withdraw(amount);
		}
	}
	
}
