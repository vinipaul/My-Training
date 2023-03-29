/**2.	Program to find the total salary by hand of an Employee 

a.	 Class 1 Get basic pay, deduction, and bonus from the console. 
b.	Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay). 
c.	Class 3 Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip 
d.	Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand.
**/
package com.inheritance;
import java.util.Scanner;
public class BasicSalaryDetails {
	float bpay;
	float deduction;
	float bonus;
void getDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic Pay:");
	 bpay=sc.nextFloat();
	System.out.println("Enter deduction amount:");
	deduction=sc.nextFloat();
	System.out.println("Enter bonus amount:");
	 bonus=sc.nextFloat();	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
