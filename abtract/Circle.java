package com.abtract;

public class Circle extends Shapes {
	

	public static void main(String[] args) {
		Circle cobj=new Circle();
		cobj.print();

	}

	@Override
	void print() {
	System.out.println("This is Circle");
		
	}

}
