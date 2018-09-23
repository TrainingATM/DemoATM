package com.nissan.training.corejava.assignment_ATM;
import java.util.Calendar;

public class Customer {
	private String name;
	private String address;
	private Calendar dob;
	private String cardNumber;
	private int pin;
	
	public boolean verifyPassword(final int passwd) {
		try {
			if(passwd != pin)
				throw new PasswordNotMatchException("Password do not match");
		}
		catch(PasswordNotMatchException p) {
			return false;
		}
		return true;
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
