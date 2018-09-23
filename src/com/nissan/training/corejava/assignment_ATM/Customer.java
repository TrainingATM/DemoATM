package com.nissan.training.corejava.assignment_ATM;
import java.util.Calendar;

/**
 * @author Mohit Anand
 * Customer class having information about customer
 * and associated Account
 */
public class Customer {
	private String name;
	private String address;
	private String dob;
	private String cardNumber;
	private int pin;
	private Account account;
	
	public Customer(final String name, final String address, 
			final String dob, final String cardNumber, 
			final int pin,final Account account){
			
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.account = account;
	}
	
	public void verifyPassword(final int passwd) throws PasswordNotMatchException{
			if(passwd != pin)
				throw new PasswordNotMatchException("Password do not match");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public Account getAccount() {
		return this.account;
	}
}
