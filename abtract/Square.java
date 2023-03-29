package com.abtract;

public class Square extends Shapes {

	public static void main(String[] args) {
		Square sobj=new Square();
		sobj.print();

	}

	@Override
	void print() {
		System.out.println("This is square");
	}

}
