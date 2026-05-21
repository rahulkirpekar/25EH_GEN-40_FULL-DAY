package exceptiontopic.runtime;

import java.io.IOException;
import java.util.Scanner;

public class TestApp5 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise Exception
			
			// 1. Checked Exception
//			throw new IOException("Invalid Age,\n\rPlease enter valid Age for Vote.");
			
			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age for Vote.");
			
			
			// 2. Unchecked Exception
//			throw new ArithmeticException("Invalid Age,\n\rPlease enter valid Age for Vote.");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote(age >= 18) : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} 
		catch (InvalidAgeException e) 
		{
			e.printStackTrace();
			System.out.println("Exception Handled by Check Exception.");
		}
		
		System.out.println("==========General Statement==========");
	}
}