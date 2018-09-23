package com.nissan.training.corejava.assignment_ATM;
/** 
 *Class for testing the bank
 */
public class TestingBank {
	public static void main(String[] args) {
//		Created Bank object
		Bank bank = new Bank("SBIN1010", "Trivandram", "SBI");
//		Created account object
		Account account = new CurrentAccount(1823123, 12012);
//		Created customer object
		Customer customer1 = new Customer("Mohit", "Patna", "2018-6-28","123456789",
				1234, account);
		bank.customerList.add(customer1);
		bank.accountList.add(account);
//		Created second account object
		Account account1 = new CurrentAccount(1239712, 12313);
//		Created customer name
		Customer customer2 = new Customer("Ankur", "Patna", "2012-2-12", "12312312",
				3434, account1);
//		Added customer to bank
		bank.customerList.add(customer2);
	}
}
