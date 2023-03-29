package com.Aggregation;
/**Aggregation
	1. Write a program to get the details of a Student
	a. Class 1 - Student
	i. Get the student name and roll number
	b. Class 2- Address
	i. Get the address of student
	c. Print Student name, roll number with address
	d. There is no IS-A relationship**/
	public class StudAggregation {
		int id;
		String name;
		Address addobj;
		
		public StudAggregation(int id, String name, Address addobj) {
			super();
			this.id = id;
			this.name = name;
			this.addobj = addobj;
		}
		void display()
		{
			System.out.println("Student Details....");
			System.out.println("id: "+id+"\nname: "+name+"\nHouse name: "+addobj.hname+"\n city "+addobj.city+"\nState: "+addobj.state+"\ncountry: "+addobj.country);
		}
		public static void main(String[] args) {
			
			Address obj=new Address("Puthu","Thrissur","Kerala","India");
			StudAggregation sobj=new StudAggregation(2,"Vini",obj);
			
			sobj.display();


		}
	}

