/**3.	Write a Java program to iterate through all elements in an array list. **/
package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ListIterator {
	void array() {
	ArrayList<String> color=new ArrayList<String>();
	color.add("Green");
	color.add("Red");
	color.add("White");
	color.add("Black");
	
		Iterator<String> i=color.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
	}
	}
public static void main(String[] args) {
		
		ListIterator obj=new ListIterator();
		obj.array();
	}

}
