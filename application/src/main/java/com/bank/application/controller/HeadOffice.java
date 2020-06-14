package com.bank.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;


public class HeadOffice {
	
	private List<Branch> branches;
	
	private static Long branchIdGenerator=1L;
	
	public HeadOffice() {
		this.branches = new ArrayList<Branch>();
	}

	List<Branch> getAllBranches(){
		return branches;
	}
	
	public void createBranch() {
		Branch br= new Branch(String.valueOf(branchIdGenerator++));
		branches.add(br);
	}
	
	public Branch getBranchById(String branchId){
		return branches.stream().filter(b -> b.getBranchId().equals(branchId)).findFirst().get();
	}

}
