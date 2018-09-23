package com.nissan.training.corejava.assignment_ATM;
import java.util.Calendar;

public class Customer {
	private String name;
	private String address;
	private Calendar dob;
	private String cardNumber;
	private int pin;
	
	boolean verifyPassword(final int passwd) {
		try {
			if(passwd != pin)
				throw new PasswordNotMatchException("Password do not match");
		}
		catch(PasswordNotMatchException p) {
			return false;
		}
		return true;
	}
}
