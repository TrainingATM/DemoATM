package com.nissan.training.corejava.assignment_ATM;

public class ATM {
	
	private String location;
	private Bank managedBy;
	
	public void identify(String cardNumber, int pin) throws NullPointerException, PasswordNotMatchException
	{
		try
		{
			Customer customer = getCustomer(cardNumber);
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
	
	public ATMTransactions[] transactions()
	{
		
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
