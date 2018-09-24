package com.nissan.training.corejava.assignment_ATM;

public class ATM {
	
	private String location;
	private Bank managedBy;
	Customer customer;
	Account account;
	
	
	
	public ATM(String location, Bank managedBy) {
		super();
		this.location = location;
		this.managedBy = managedBy;
		this.customer = null;
	}

	public void identify(String cardNumber, int pin) throws NullPointerException, PasswordNotMatchException
	{
		try
		{
			customer = getCustomer(cardNumber);
			customer.verifyPassword(pin);
		}
		catch(NullPointerException e)
		{
			throw new NullPointerException("No customer found with the current card number");
		}
		catch(PasswordNotMatchException e)
		{
			throw e;
		}
	}
	
	public void transactions(boolean isDeposit ,int amount) throws InsufficientBalanceException
	{
		account = customer.getAccount();
		account.createTransaction(isDeposit, amount);
		
	}
	
	public int getAccountBalance()
	{
		return account.getBalance();
	}
	

	Customer getCustomer(String cardNumber)
	{
		for(Customer customer : managedBy.customerList)
		{
			if(customer.getCardNumber().equals(cardNumber))
				return customer;
		}
		return null;
	}

}
