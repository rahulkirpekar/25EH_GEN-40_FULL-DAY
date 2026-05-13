package exceptiontopic.runtime;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans;
		
		try 
		{
			ans = no1 / no2;
			
		}
		catch(NullPointerException e) 
		{
			System.out.println("Exception Handled By Catch Block");
			ans = 0;
		}
		System.out.println("Division : "+ ans);
*/
		
		int a[] = new int[5]; // a[0],a[1],a[2],a[3],a[4]

		try 
		{
			a[5] = 10;// ArrayIndexoutofBoundException
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Exception Handled By Catch Block---"+e.getMessage());
		}
	}
}
