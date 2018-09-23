package com.nissan.training.corejava.assignment_ATM;

public class InsufficientBalanceException extends Exception{

	
	String message;
	
	public InsufficientBalanceException(String string) {
		// TODO Auto-generated constructor stub
		this.message = string;
	}

	public String toString() {
		return message;
	}
}
