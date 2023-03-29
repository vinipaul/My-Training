package com.inheritance;
/**3.	Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40% 
a.	• Should use two classes, Onseason and Offseason 
b.	• Use two methods- discount(method name should be same)
**/
public class OffSeason {
	float amount=1;
	void discount(float amt) {
		amount=amt-amt*15/100;
		System.out.println("Offseason discount:"+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
