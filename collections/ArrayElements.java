package com.collections;
import java.util.ArrayList;
import java.util.Scanner;
/**2.	Write a Java program to retrieve an element (at a specified index) from a given array list. **/
public class ArrayElements {
	void array() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int x=sc.nextInt();
			list.add(x);
		}
		System.out.println(list);
		System.out.println("specify the index of element to retrieve:");
		int index=sc.nextInt();
		System.out.println("Element at "+index+"th position is:"+list.get(index));
	}
	public static void main(String[] args) {
		ArrayElements obj=new ArrayElements();
		obj.array();

	}

}
