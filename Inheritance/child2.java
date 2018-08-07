package com.Inheritance;

public class child2 extends BankingInheritance {

	public void sample() {
		System.out.println("sample");
	}

	public void headerPrint() {
		super.headerPrint();
		System.out.println("This is child2  header");
		
	}

}
