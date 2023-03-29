package com.inheritance;
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountant obj=new Accountant();
		System.out.println("Acoountant Details");
		obj.account();
		System.out.println("Manager Details");
		Manager mobj=new Manager();
		mobj.manage();
	}

}
