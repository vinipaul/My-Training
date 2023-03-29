package com.inheritance;
/**	Create a class named 'Member' having the following members:
Data members
a.	 Name
b.	 Age
c.	 Phone number
d.	Address
e.	 Salary
f.	It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' 
classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary 
to an employee and a manager by making an object of both of these classes and print the same.**/
public class Member {
	String Name;
	int	 age;
	int	 Ph;
	String address;
	int	 salary;
public Member(String name, int age, int ph, String address, int salary) {
		super();
		Name = name;
		this.age = age;
		Ph = ph;
		this.address = address;
		this.salary = salary;
	}

void printSalary()
{
	System.out.println("Salary is: "+salary);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
