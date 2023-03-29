package com.inheritance;
public class SquareConstruct extends RectangleConstructor {
float side;
	

	public SquareConstruct(float length, float breadth, float side) {
		super(length, breadth);
		this.side = side;
		
		float squarearea=side*side;
		System.out.println("Area of square:"+squarearea);
		float sperimeter=4*side;
		System.out.println("Perimeter of square:"+sperimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareConstruct squareobj=new SquareConstruct(10,20,5);
		squareobj.area();
		squareobj.perimeter();
	}

}
