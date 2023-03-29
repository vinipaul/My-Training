package com.exception;
/**3.	Create a class and throw Arithmetic Exception.
 * (use throw and throws)**/
public class ThrowException {
void method() {
	int a=50/0;
	throw new ArithmeticException("divisible by 0 not possible");
}
	public static void main(String[] args) throws ArithmeticException {
	try {
		ThrowException obj=new ThrowException();
		obj.method();
	}catch(ArithmeticException e) {
		System.out.println("Exception thrown by method()");
	}
	}
	

}
