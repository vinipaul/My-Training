/**1.	Program to withdraw amount from an ATM 
a.	Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method - [Valid pins – 1001, 1234, 1212] 
b.	Pin number should declared as private
c.	Class 2 – User Get the pin from User 
**/
package com.encapsulation;

public class Bank {
private int pinno;

	public int getPinno() {
		System.out.println("pinno is "+pinno);
	return pinno;
}

public void setPinno(int pinno) {
	this.pinno = pinno;
}
public void validatePin() {
	if (pinno==1001||pinno== 1234||pinno== 1212)
	System.out.println("Valid pin!");
	else
		System.out.println("Invalid Pin!");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
