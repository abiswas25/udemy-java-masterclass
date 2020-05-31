package com.udemy.java.masterclass.challenges.section06;

public class Account {

	private long number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		if (number < 1) {
			this.number = -1;
		} else {
			this.number = number;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public double doDeposit(double amount) {
		if (amount < 0) {
			System.out.println("Deposits less than Zero are NOT ALLOWED");
		} else {
			balance += amount;
			System.out.println("Deposit of ₹" + amount + " successful.");
		}
		System.out.println("Current Account Balance is ₹" + balance);
		return balance;
	}

	public double doWithdraw(double amount) {
		if (amount < 0) {
			System.out.println("Withdrawals less than Zero are NOT ALLOWED");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("Withdrawal of ₹" + amount + " successful.");
		}
		System.out.println("Current Account Balance is ₹" + balance);
		return balance;
	}

}
