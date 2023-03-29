package com.inheritance;
public class Child extends Parent {
	void childDisplay() {
		System.out.println("This is Child class!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cobj=new Child();
		cobj.childDisplay();
		cobj.parentDisplay();

	}

}

