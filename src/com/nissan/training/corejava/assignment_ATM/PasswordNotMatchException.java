package com.nissan.training.corejava.assignment_ATM;

public class PasswordNotMatchException {
	
	String message;
	
	public PasswordNotMatchException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return message;
	}
}
