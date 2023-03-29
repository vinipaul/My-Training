package com.inheritance;
/**6.	Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
 * two methods to print the area and perimeter of the rectangle respectively. 
 * Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
 *  Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side
 *   (suppose s) calling the constructor of its parent class as 'super(s,s)'.
 *   Print the area and perimeter of a rectangle and a square.**/

public class RectangleConstructor {
	float length,breadth;
	public RectangleConstructor(float length, float breadth) {
		super();//Parent class Object
		this.length = length;
		this.breadth = breadth;
	}
	void area()
	{
		float area=length*breadth;
		System.out.println("Area of rectagle is:"+area);
	}
	void perimeter() {
		float perimeter=2*(length*breadth);
		System.out.println("Perimeter of the Rectangle is:"+perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
