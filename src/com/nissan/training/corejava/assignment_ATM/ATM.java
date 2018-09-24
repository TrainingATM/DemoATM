package com.nissan.training.corejava.assignment_ATM;

@SuppressWarnings("unused")
public class ATM {
	
	private String location;
	private Bank managedBy;
	Customer customer;
	Account account;
	
	/**
	 * @author NDH00159
	 * @param location
	 * @param managedBy
	 */
	
	public ATM(String location, Bank managedBy) {
		super();
		this.location = location;
		this.managedBy = managedBy;
		this.customer = null;
	}

	/**
	 * 
	 * @param cardNumber
	 * @param pin
	 * @throws NullPointerException
	 * @throws PasswordNotMatchException
	 */
	public void identify(String cardNumber, int pin) throws CustomerNotFoundException, PasswordNotMatchException
	{
		try
		{
			customer = getCustomer(cardNumber);
			customer.verifyPassword(pin);
		}
		catch(CustomerNotFoundException e)
		{
			throw new CustomerNotFoundException(e.getMessage());
		}
		catch(PasswordNotMatchException e)
		{
			throw e;
		}
	}
	
	/**
	 * 
	 * @param isDeposit
	 * @param amount
	 * @throws InsufficientBalanceException
	 */
	public void transactions(boolean isDeposit ,int amount) throws InsufficientBalanceException
	{
		account = customer.getAccount();
		account.createTransaction(isDeposit, amount);
		
	}

	/**
	 * 
	 * @param cardNumber
	 * @return Customer
	 */
	Customer getCustomer(String cardNumber) throws CustomerNotFoundException
	{
		for(Customer customer : managedBy.customerList)
		{
			if(customer.getCardNumber().equals(cardNumber))
				return customer;
		}
		throw new CustomerNotFoundException("Customer Not found"); 
	}
	/**
	 * 
	 * @return the current balance of account 
	 */
	public int getAccountBalance()
	{
		return account.getBalance();
	}

}
