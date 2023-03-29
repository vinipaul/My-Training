package com.inheritance;
public class MemberManager extends Member {
	String department="Production";

	public MemberManager(String name, int age, int ph, String address, int salary, String department) {
	super(name, age, ph, address, salary);
	this.department = department;
}
void printDetails() {
	System.out.println(".....Manger Salary Slip....");
	System.out.println("Manager Name:"+this.Name+"\nAge: "+age+"\nPhone: "+this.Ph+"Address: "
	+address+"\nSalary: "+salary+"\nDepartment: "+department);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager magerobj=new  MemberManager("divya",26,60,"panthu",50000,"Production");
		 magerobj.printSalary();
		 magerobj.printDetails();
	}
}
