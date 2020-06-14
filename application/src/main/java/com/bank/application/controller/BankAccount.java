package com.bank.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import com.bank.application.exceptions.BankServiceException;
import com.bank.application.exceptions.NegativeAmountException;

public abstract class BankAccount {
	
	private static Long accountNumberGenerator = 1L;
	
	Log log= LogFactory.getLog(BankAccount.class);
	
	private String accountNumber;
	
	//Exception for minimum balance
	protected Double minimumBalance;
	private Double currentBalance;
	public Double getMinimumBalance() {
		return minimumBalance;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	protected Double interestRate;
	
	private List<Transaction>transactions;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public BankAccount() {
		this.accountNumber = String.valueOf(1L);
		this.transactions = new ArrayList<Transaction>();
		this.currentBalance= 0.0;
	}

	public abstract String getType();
	
	public void withdraw(Double amount) {
		Double tempValue= currentBalance;
		tempValue= tempValue - amount;
		if(tempValue < minimumBalance) {
			log.info(tempValue);
			throw new BankServiceException("Current Balance can not be less than minimum Balance");
		}else {
			currentBalance= tempValue;
			this.transactions.add(new Transaction(amount, this.getType()));
		}
	}
	
	public void deposit(Double amount) {
		if(amount < 0) {
			log.info(amount);
			throw new NegativeAmountException("Amount is negative");
		}else {
			currentBalance= currentBalance + amount;
			this.transactions.add(new Transaction(amount, this.getType()));
			log.info(transactions);
		}
		
	}
	
	public List<Transaction> getTransactionHistory(){
		return transactions;
		
	}
	
	public List<Transaction> getMiniStatement(){
		return transactions;
		
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", minimumBalance=" + minimumBalance
				+ ", currentBalance=" + currentBalance + ", interestRate=" + interestRate + ", transactions="
				+ transactions + "]";
	}

}
