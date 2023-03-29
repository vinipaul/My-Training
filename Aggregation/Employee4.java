package com.Aggregation;
/**Write a Program with following classes
a. Class 1: Car with data members: color,carName,regNo.
b. Class 2:Bike with data members: bikeName,regNo.
c. Class 3: Employee with empName,empId,Car and Bike. Print the employee details**/
public class Employee4 {
	String empname;
	String empid;
	Car carref;
	Bike bikeref;
	

	public Employee4(String empname, String empid, Car carref, Bike bikeref) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.carref = carref;
		this.bikeref = bikeref;
	}

void empDetails() {
	System.out.println("Employee Name: "+empname+"\nEmployee Id: "+empid+
			"\nHe has a car\n Car Name:"+carref.carname+"\nColor: "+carref.color+"\nReg.No:"+carref.regno);
	System.out.println("He has a Bike\nBike Name: "+bikeref.bikename+"\nReg.No:"+bikeref.regno);
}
	public static void main(String[] args) {
	Car carobj=new Car("Mercedez Benz","Black",59477);
	Bike bikeobj=new Bike("Spenzer",678);
	Employee4 empobj=new Employee4("Vini","mac12",carobj,bikeobj);
	empobj.empDetails();

	}

}
