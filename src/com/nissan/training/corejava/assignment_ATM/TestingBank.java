package com.nissan.training.corejava.assignment_ATM;
/** 
 *Class for testing the bank
 */
public class TestingBank {
	public static void main(String[] args) {
		Bank bank = new Bank("SBIN1010", "Trivandram", "SBI");
		Account account = new CurrentAccount(1823123, 12012);
		Customer customer1 = new Customer("Mohit", "Patna", "2018-6-28","123456789",
				1234, account);
		bank.customerList.add(customer1);
		
		Account account1 = new CurrentAccount(1239712, 12313);
		Customer customer2 = new Customer("Ankur", "Patna", "2012-2-12", "12312312",
				3434, account1);
		
		bank.customerList.add(customer2);
		
	}
}
