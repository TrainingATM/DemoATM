package com.nissan.training.corejava.assignment_ATM;
import java.util.Calendar;

public class Customer {
	private String name;
	private String address;
	private Calendar dob;
	private String cardNumber;
	private int pin;
	private Account acc;
	
	Customer(final String name, final String address, 
			final Calendar dob, final String cardNumber, 
			final int pin,final Account acc){
			
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.acc = acc;
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

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
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
	
}
