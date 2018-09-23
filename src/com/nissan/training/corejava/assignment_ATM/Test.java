package com.nissan.training.corejava.assignment_ATM;

public class Test {

	public static void main(String[] args) {
		Account a1=new SavingAccount();
		
		a1.setBalance(1500);
		a1.withdraw(1000);
		System.out.println(a1.getBalance());
		
	}
}

