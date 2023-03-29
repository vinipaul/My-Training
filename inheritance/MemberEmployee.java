package com.inheritance;
public class MemberEmployee extends Member {
String specialization;
	
	public MemberEmployee(String name, int age, int ph, String address, int salary, String specialization) {
		super(name, age, ph, address, salary);
		this.specialization = specialization;
	}
	void printDetails() {
		System.out.println(".....Employee Salary Slip....");
		System.out.println("Employee Name:"+this.Name+"\nAge: "+age+"\nPhone: "+this.Ph+"Address: "
				+address+"\nSalary: "+salary+"\nDepartment: "+specialization);
	}

	public static void main(String[] args) {
	
		MemberEmployee empobj=new MemberEmployee("vini",30,50,"puthu",30000,"Mobile Application");
		empobj.printSalary();
		 empobj.printDetails();
		
	}

}

