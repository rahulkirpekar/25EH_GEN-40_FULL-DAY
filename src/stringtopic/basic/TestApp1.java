package stringtopic.basic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Character : ");
//		char value = (char)System.in.read();// A--65--->A
		
//		char value = sc.next().charAt(0);
		
//		System.out.println("Char  : " + value);
		
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
//		String name = sc.next();
		
		
		System.out.println("Name : " + name);
	}
}
