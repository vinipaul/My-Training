package com.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
	void array() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int x=sc.nextInt();
			list.add(x);
		}
		System.out.println(list);
		for(int j=0;j<5;j++) {
			if(list.get(j)>10) 
				System.out.println(list.get(j));
			}	
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	ArrayListExample aobj=new ArrayListExample();
	aobj.array();
		}

	}

	