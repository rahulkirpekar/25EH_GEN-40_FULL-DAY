package exceptiontopic.runtime;

import java.util.Scanner;

// Multiple Catch Block
public class TestApp2 
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
			ans = no1 / no2;
			
			a[2] = 10;
			
			String name = "123";
			System.out.println(name.length());
			
			System.out.println(name.charAt(name.length()));
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			ans = 0;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
			ans = 0;
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
			ans = 0;
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