package com.bank.application.controller;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bank.application.exceptions.InvalidAccountNumberException;

public class Branch {

	Log log= LogFactory.getLog(Branch.class);

	private String branchId;

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	private ArrayList<Customer> customers;
	private ArrayList<BankAccount> bankAccounts;

	public Branch(String branchId) {
		this.customers= new ArrayList<Customer>();
		this.bankAccounts= new ArrayList<BankAccount>();
		this.branchId = branchId;
	}

	public void createBankAccount(String panNumber, String type, Double amount){
		if(type.equals("Current")) {
			BankAccount currentAccount= new CurrentAccount();
			currentAccount.deposit(amount);
			bankAccounts.add(currentAccount);
			boolean isExist= false;
			for(Customer cust : customers) {
				if(cust.getPanNumber().equals(panNumber)){
					cust.getAccount().add(currentAccount);
					log.info(cust);
					isExist=true;
				}
			}
			if(!isExist) {
				Customer cust= new Customer(panNumber);
				cust.getAccount().add(currentAccount);
				customers.add(cust);
				log.info(customers);
			}


		}else if(type.equals("Saving")) {
			BankAccount savingAccount= new SavingAccount();
			savingAccount.deposit(amount);
			bankAccounts.add(savingAccount);
			boolean isExist= false;
			for(Customer cust : customers) {
				if(cust.getPanNumber().equals(panNumber)){
					cust.getAccount().add(savingAccount);
					isExist=true;
				}
			}
			if(!isExist) {
				Customer cust= new Customer(panNumber);
				cust.getAccount().add(savingAccount);
				customers.add(cust);
				log.info(customers);
			}
		}
	}

	Customer getCustomerByPan(String panNumber){
		return customers.stream().filter(e -> e.getPanNumber().equals(panNumber)).findFirst().get();
	}

	public BankAccount getAccountByAccountNumber(String accountNumber) {
		boolean isAccountExist= false;
		for(BankAccount account: bankAccounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				isAccountExist= true;
			}
		}
		if(!isAccountExist) {
			throw new InvalidAccountNumberException("No Such Account Exist");

		}
		return bankAccounts.stream().filter(e -> e.getAccountNumber().equals(accountNumber)).findFirst().get();
	}

}
