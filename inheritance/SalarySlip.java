package com.inheritance;
public class SalarySlip extends CalculateHraPf {
	float total;
	void totalSalary()
	{
		calculateHra();
		
		calculatePf();
	 total=bpay+hra-pf-deduction+bonus;
	
	}
	void salarySlip()
	{
		System.out.println("\t.......SALARY SLIP.........");
		System.out.println("Basic pay  "+bpay+"\n Deduction  "+deduction+"\n HRA  "+hra+"\n PF  "+pf+"\n Bonus  "+bonus+"\n Total salary  "+total);
		
	}

	public static void main(String[] args) {
		SalarySlip obj2=new SalarySlip();
		obj2.getDetails();
		obj2.totalSalary();
		obj2.salarySlip();
		}

}


	