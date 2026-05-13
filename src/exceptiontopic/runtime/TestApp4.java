package exceptiontopic.runtime;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = 0;
		
		try 
		{
			//System.exit(1);// JVM Execution Stop
			ans = no1 / no2;
			
		} /*catch (NullPointerException e) 
		{
			ans = 0;
			e.printStackTrace();
			System.out.println("Catch Block");
		}*/
		finally 
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Division : "+ ans);
	}
}
