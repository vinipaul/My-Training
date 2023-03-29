package com.inheritance;
/**4.	Program to calculate the salary 
a.	Class 1 : Employee Class – calculateSalary() = Basic+DA+HRA
 function,calculateBonus() -Basic * 10%  -Super class
b.	Class 2 : Manager class – call calculateSalary(),calculateBonus() 
c.	Class 3 : Accountant class – calculate salary(),calculateBonus()
d.	Class 4: Main class to test the extended class
**/
import java.util.Scanner;
public class Employee {
double basic,da,hra,salary,bonus;
void getSalaryDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic salary:");
	basic=sc.nextDouble();
	System.out.println("Enter da:");
	da=sc.nextDouble();
	System.out.println("Enter hra :");
	hra=sc.nextDouble();
}
void calculateSalary()
{
	salary=basic+da+hra;
	System.out.println("Salary is: "+salary);
}
void calculateBonus()
{
	bonus=basic*10/100;
	System.out.println("Bonus is: "+bonus);
}
	public static void main(String[] args) {
		

	}

}
