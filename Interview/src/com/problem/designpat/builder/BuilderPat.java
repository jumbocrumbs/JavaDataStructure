package com.problem.designpat.builder;

public class BuilderPat {
	
	
	
	public static void main(String[] args) {
		Phone p= new PhoneBuilder().setBattery(2000).setModel("newModel").setProcessor("DualCore").setScrenSize(0).getPhone();
		System.out.println(p);
	}
	

}
