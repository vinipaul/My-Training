package com.inheritance;
import java.util.Scanner;
public class Onseason extends OffSeason {
void discount(float amt) {
	super.discount(amt);
	amount=amt-amt*40/100;
	System.out.println("Onseason discount:"+amount);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason a=new Onseason();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		float total=sc.nextFloat();
		a.discount(total);

	}

}
