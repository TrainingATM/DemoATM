package com.nissan.training.corejava.assignment_ATM;

public class ATM {
	
	private String location;
	private Bank managedBy;
	
	public boolean identify(String cardNumber, String pin)
	{
		try
		{
			Customer customer = getCustomer(cardNumber);
			customer.verifyPassword(pin);
		}
		catch(NullPointerException e)
		{
			System.out.println("No account found with entered credentials");
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
