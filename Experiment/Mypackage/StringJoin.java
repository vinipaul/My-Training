//a program to join 2 strings
package com.Experiment.Mypackage;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
public class StringJoin
{
	public void concat() {
		System.out.println("Enter Two strings:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//String s3=s1+s2;
		String s3=s1.concat(s2);
		System.out.println("new String is: "+s3);
	}
		
			
	public void sub_string() {
		String sentence=" are how you  ,am i how hows";
			int count=0,index=0;
			index=sentence.indexOf("how",index);
			while (index!=-1){
				count++;
				index++;
				index=sentence.indexOf("how",index);
			}
			
	
		System.out.println(count);
	}

		/*  String v="are",s1=""; 
		  int count=0;
		String  s="how<are>! are you are";
		int length=s.length();
		String a[]=s.split(" ");
		for (String words : a) {
			System.out.print(words+" ");
			 if(words.equals(v)) 
					count=count+1;
			
				}
		System.out.println("\n"+count);
	}*/
		/*for(int i=0;i<length;i++) {
			  if(s.charAt(i)==' ')
			 {
				  if(s1.equals(v)) {
				count=count+1;
				 s1="";
				}
				  else 
				  {
				 s1="";
				  }
			 }
			else 
				   s1=s1+s.charAt(i);
		}
		System.out.println(count);
}*/
		
	public void word_occurance() {
		String s="how how you";
		String find="how";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(find)>=0) {
			count++;
			System.out.println(count);
		}
		else {
			System.out.println("not found");
		}
		}
}	
	
public static void main(String args[])
{
	StringJoin oJoin=new StringJoin();
	oJoin.sub_string();
	//oJoin.word_occurance();
}
}