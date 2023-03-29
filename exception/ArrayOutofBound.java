package com.exception;
/**2.	Create a class to handle ArrayOutOfBoundException.
 *  Give the size of array as 5. Try to access 7th element. 
 *  The output should be “Array is out of Bound”
 **/
public class ArrayOutofBound {

	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		int temp=a[6];
	}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array is out of bound");
	}
	}

}
