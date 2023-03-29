package com.Aggregation;
/**Create a class Car with data members: color,carName,regNo. Create another class Employee with
empName,empId and Car. Print employee details.**/
public class Employee {
String empname;
int empid;
Car carref;

public Employee(String empname, int empid, Car carref) {
	super();
	this.empname = empname;
	this.empid = empid;
	this.carref = carref;
}
void empDetails() {
	System.out.println("Employee Name: "+empname+"\nEmployee Id: "+empid+
			"\nCar Name: "+carref.carname+"\nColor: "+carref.color+"\nReg. No: "+carref.regno);
}
	public static void main(String[] args) {
		Car carobj=new Car("Honda City","Black",5947);
		Employee empobj=new Employee("Vini",12,carobj); //passing object as argument
		empobj.empDetails();

	}

}
