package com.nissan.training.corejava.assignment_ATM;

import java.util.Scanner;

/** 
 *Class for testing the bank
 */
public class TestingBank {
	
	public static void main(String[] args) {

		//		Created Bank object
		Bank bank = new Bank("SBIN1010", "Trivandram", "SBI");

		//	Created account object
		Account account1 = new CurrentAccount(1823123, 10000);

		//	Created customer object
		Customer customer1 = new Customer("Mohit", "Patna", "2018-6-28","1234567890123456",
				1234, account1);
		
		bank.customerList.add(customer1);
		bank.accountList.add(account1);

		//		Created second account object
		Account account2 = new CurrentAccount(1239712, 12313);

		//		Created customer name
		Customer customer2 = new Customer("Ankur", "Patna", "2012-2-12", "1231231290123456",
				3434, account2);

		//		Added customer to bank
		bank.customerList.add(customer2);
		bank.accountList.add(account2);
		
		/*------------End of part 1------------*/
		
		ATM atm = new ATM("Technopark", bank);
		
		
		
		try {
			
			Scanner in  = new Scanner(System.in);
			System.out.println("Welcome to SBI bank Trivandrum");
			System.out.println("Please enter 16 digit card number");
			String cardNumber = in.nextLine();
			System.out.println("Please enter 4 digit pin");
			int pin = in.nextInt();
			atm.identify(cardNumber, pin);
			System.out.println("Enter 1 to withdraw, 2 to deposit");
			int code = in.nextInt();
			System.out.println("Please enter amount");
			int amount = in.nextInt();
			boolean isDeposit = (code == 2);
			atm.transactions(isDeposit, amount);
			System.out.println("Thank you for using SBI ATM");
			int balance = atm.getAccountBalance();
			System.out.println("Your current balance is: " + balance);
			
		} catch (CustomerNotFoundException e) {
			System.out.println("No account found with given card number");
		} catch (PasswordNotMatchException e) {
			System.out.println("Invalid pin");
		}
		catch (InsufficientBalanceException e)
		{
			System.out.println("Insufficient balance to handle transaction");
		}
		
	}
	
}
