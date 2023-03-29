package com.inheritance;

public class CalculateHraPf extends BasicSalaryDetails {
	float hra,pf;
	void  calculateHra()
	{
		 hra=bpay*5/100;
		System.out.println("hra: "+hra);
	}
	void  calculatePf()
	{
		 pf=bpay*20/100;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
