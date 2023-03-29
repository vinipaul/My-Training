package com.abtract;
import java.util.Scanner;
public class Contractor extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contractor cobj=new Contractor();
cobj.calculateSalary();
	}
Scanner sc=new Scanner(System.in);
	@Override
	void calculateSalary() {
	System.out.println("Enter working hours:");
	int hours=sc.nextInt();
	int salary=hours*1000;
	System.out.println("Salary of contractor is " +salary);
		
	}

}
