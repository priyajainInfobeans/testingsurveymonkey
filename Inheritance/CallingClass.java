package com.Inheritance;

public class CallingClass {
		
	public static void main(String[] args) {
		Child c = new Child();
		c.headerPrint();
		c.footer();
		c.mainPage();
		c.homePage();
		child2 b = new child2();
		b.headerPrint();
	}
}
