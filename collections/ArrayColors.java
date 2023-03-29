package com.collections;
import java.util.ArrayList;
/**1.	Write a Java program to create a new array list, 
 * add some colors (string) and print out the collection. **/
public class ArrayColors {
void colors() {
	ArrayList<String> color=new ArrayList<String>();
	color.add("Green");
	color.add("Red");
	color.add("White");
	color.add("Black");
	System.out.println(color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayColors obj=new ArrayColors();
obj.colors();
	}

}
