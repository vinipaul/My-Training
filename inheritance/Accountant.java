package com.inheritance;

public class Accountant extends Employee {
	void account() {
		super.getSalaryDetails();
		super.calculateSalary();
		super.calculateBonus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
