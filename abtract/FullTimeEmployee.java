package com.abtract;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FullTimeEmployee fobj=new FullTimeEmployee();
fobj.calculateSalary();
	}

	@Override
	void calculateSalary() {
		int salary=8*1000;
		System.out.println("Salary of full time employee is:"+salary);
		
	}

}
