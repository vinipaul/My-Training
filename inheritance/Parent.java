/**5.	Create a class with a method that prints "This is parent class" and its
 *  subclass with another method that prints "This is child class". 
 * Now, create an object for each of the class and call 
a.	In parent class - method of parent class by object of parent class
b.	In child class - method of child class by object of child class
c.	In child class - method of parent class by object of child class
**/
package com.inheritance;
public class Parent {
void parentDisplay() {
	System.out.println("This is Parent class!");
}
	public static void main(String[] args) {
		
Parent pobj=new Parent();
pobj.parentDisplay();
	}

}
