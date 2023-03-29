package com.collections;
import java.util.ArrayList;
import java.util.Scanner;
/**5.	Write a Java program to search an element in an array list. **/
public class SearchArrayList {
void array() {
	ArrayList<Integer> list=new ArrayList<Integer>();
	System.out.println("Enter elements:");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		int x=sc.nextInt();
		list.add(x);
	}
	System.out.println(list);
	System.out.println("Enter the element to search:");
	int element=sc.nextInt();
	if(list.contains(element)) {
			
		System.out.println("Element found!");
	}
	else
		System.out.println("Element not found!");
	}
	public static void main(String[] args) {
		SearchArrayList obj=new SearchArrayList();
		obj.array();

	}

}
