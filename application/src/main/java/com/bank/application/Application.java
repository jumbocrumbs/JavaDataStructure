package com.bank.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bank.application.controller.BankAccount;
import com.bank.application.controller.Branch;
import com.bank.application.controller.CurrentAccount;
import com.bank.application.controller.HeadOffice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		HeadOffice headOffice= new HeadOffice();
		headOffice.createBranch();
		Branch branch=headOffice.getBranchById("1");
		branch.createBankAccount("23456", "Saving", 15000.0);
		System.out.println(branch.getBankAccounts().stream().filter(e -> e.getAccountNumber().equals("1")).findFirst().get().toString());
		branch.getBankAccounts().stream().filter(e -> e.getAccountNumber().equals("1")).findFirst().get().deposit(20000.0);
		branch.getBankAccounts().stream().filter(e -> e.getAccountNumber().equals("1")).findFirst().get().withdraw(10000.0);
		System.out.println(branch.getBankAccounts().stream().filter(e -> e.getAccountNumber().equals("1")).findFirst().get().toString());
		System.out.println(branch.getBankAccounts().stream().filter(e -> e.getAccountNumber().equals("1")).findFirst().get().getCurrentBalance());
	}

}
