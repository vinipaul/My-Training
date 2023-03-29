package com.exception;
import java.util.Scanner;

/**4.	Create a custom Exception class to handle invalid age.(Age less than 18)**/
public class InvalidAgeException extends Exception {
 InvalidAgeException(String str) {
	super(str);
}
	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if( age<18)
				throw new  InvalidAgeException("Invalid age for vote");
			else
				System.out.println("Eligible to vote");
		}
		catch(InvalidAgeException e) {
			System.out.println("Invalid AgeEcxception caught");
		}
	}

}
