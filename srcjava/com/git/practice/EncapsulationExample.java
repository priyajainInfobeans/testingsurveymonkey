package com.git.practice;

public class EncapsulationExample {

	private int SchoolNo;
	private String firstName;
	private String lastName;
	private int rollNo;
	
	@Override
	public String toString() {
		return "EncapsulationExample [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo +  "SchoolNo=" + SchoolNo + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setSchoolNo(int SchoolNo) {
		this.SchoolNo = SchoolNo;
	}
	
	

}
