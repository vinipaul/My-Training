package com.interfaces;

public class Result implements Printable1, Printable2 {

	public static void main(String[] args) {
		Result robj=new Result();
		robj.show();

	}

	@Override
	public void show() {
	System.out.println("This is a class that implements two interfaces \n to achieve multiple inheritance in a way");
		
	}

}
