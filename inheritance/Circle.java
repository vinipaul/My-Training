package com.inheritance;
public class Circle extends Shapes {
	void show() {
		System.out.println("This is circular subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.show();
	}

}
