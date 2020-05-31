package com.udemy.java.masterclass.challenges;

import com.udemy.java.masterclass.challenges.section06.Account;

public class Main {

	public static void main(String[] args) {

//		System.out.println(ReadingUserInputChallenge.sumOfUserInputNumbers());
//		MinAndMaxInputChallenge.minAndMaxUserInput();
		Account myAccount = new Account();
		myAccount.setBalance(23000);
		myAccount.setNumber(1234567890);
		myAccount.setCustomerName("John Doe");
		myAccount.setCustomerEmail("john.doe@foobar.com");
		myAccount.setCustomerPhone("9876543210");

		System.out.println("Account Balance = ₹" + myAccount.getBalance());
		myAccount.doDeposit(-12);
		myAccount.doDeposit(1000);
		myAccount.doWithdraw(-100);
		myAccount.doWithdraw(10000000);
		myAccount.doWithdraw(12345.45);

	}

}
