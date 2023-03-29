package com.exception;
/**1.	Create a class to handle the Arithmetic Exception. 
 * The output should be  “You can’t divide a number by 0”. Use try -catch block**/
public class Arithmetic {
	public static void main(String[] args) {
		try {
			int a=50/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("You can’t divide a number by 0");
		}
		
	}
	
	
	

}
