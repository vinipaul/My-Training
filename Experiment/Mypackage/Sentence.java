package com.Experiment.Mypackage;
import java.lang.String;
class Sentence
{
public static void main(String args[])
{
String s=new String("I have a pen");
int n=s.length();
//System.out.println(s.charAt(11));
for(int i=n-1;i>=0;i--)
{
if(s.charAt(i)==' ')
{
System.out.print(" ");
continue;
}
System.out.print(s.charAt(i));
}
}
}
