package com.interfaces;

public class Rectangle implements Polygon {

	public static void main(String[] args) {
		Rectangle robj=new Rectangle();
		float are=robj.getArea(10,20);
		System.out.println("Area of Rectangle is:"+are);

	}

	@Override
	public float getArea(float length, float breadth) {
		float area=length*breadth;
		return area;
	}

}
