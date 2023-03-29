package com.interfaces;
import java.util.Scanner;
public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC hobj=new HDFC();
		System.out.println("Enter the amount to deposit: and duration:");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		float duration=sc.nextFloat();
		double total=hobj.recurringDeposit(amount, duration);
		System.out.println("You can get "+total+"Rs");
	}

	@Override
	public double recurringDeposit(float amount, float duration) {
		double total=amount*duration*interest;
			return total;
	
	}

}
