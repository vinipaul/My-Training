//a program to check whether the given number is Amstrong/Not.
import java.util.Scanner;
import java.lang.Math;
class Amstrong
{
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check:");
	int num=sc.nextInt();
	int temp=num,c;
	int sum=0,r;
	while(num!=0)
	{
		num=num%10;
		c++;
	}
		
	while(num!=0)
	{
		r=num%10;
		sum=sum+Math.pow(r,c);
		num=num/10;
	}
	if(sum==temp)
	System.out.println("ITS AN AMSTRONG NUMBER");
	else
	System.out.println("ITS NOT AN AMSTRONG NUMBER");
}
}
		
	
	