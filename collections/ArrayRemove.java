package com.collections;
/**4.	Write a Java program to remove the third element from an array list. **/
import java.util.ArrayList;
public class ArrayRemove {
void array() {
	ArrayList<String> fruits=new ArrayList<String>();
	fruits.add("Banana");
	fruits.add("Grapes");
	fruits.add("Apple");
	fruits.add("Orange");
	System.out.println(fruits);
	System.out.println("Third element in the list is :"+fruits.get(2));
	fruits.remove(2);
	System.out.println("After removal of third element from the list:"+fruits);
}
	public static void main(String[] args) {
		ArrayRemove obj=new ArrayRemove();
		obj.array();
	}

}
