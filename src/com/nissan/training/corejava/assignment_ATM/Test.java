package com.nissan.training.corejava.assignment_ATM;

public class Test {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setBalance(0);
		a1.withdraw(90);
		
		System.out.println(a1.getBalance());
		
	}
}

