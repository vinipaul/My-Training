//add two integer numbers
import java.util.Scanner;
public class Addition
{
	public static void main(String args[])
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("Enter The First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter The Second Number: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println(" Sum of " +num1+ " and "+num2+ " is " +sum);	
	}
}