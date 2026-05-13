package stringtopic.immutable;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name : "); //01234 
		String name = sc.nextLine();		// royal
		
		System.out.println("name.charAt(0) : " + name.charAt(0));
		System.out.println("name.charAt(1) : " + name.charAt(1));
		System.out.println("name.charAt(2) : " + name.charAt(2));
		System.out.println("name.charAt(3) : " + name.charAt(3));
		System.out.println("name.charAt(4) : " + name.charAt(4));
		
		
		System.out.println(args.length);
		System.out.println(args[0].length());
		System.out.println(name.length());
	}
}
