package exceptiontopic.runtime;

import java.util.Scanner;

// Nested try-catch Block
public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5]; // a[0],a[1],a[2],a[3],a[4]

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans;
		
		try 
		{
			try 
			{
				ans = no1 / no2;
			} catch (Exception e) 
			{
				ans = 0;
				e.printStackTrace();
			}
			
			try 
			{
				a[2] = 10;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			String name = "123";
			try 
			{
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try {
				System.out.println(name.charAt(name.length()));
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("Exception Catch Block Handled.");
		}
		System.out.println("Division : "+ ans);
	}
}