package com.encapsulation;
import java.util.Scanner;
public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bankobj=new Bank();
System.out.println("Enter the Pin:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
bankobj.setPinno(n);
bankobj.getPinno();
bankobj.validatePin();
	}

}
