package oops.inhtopic.hieinh;

import java.util.Scanner;

// Hierarchical Inheritance
//---------------------

// Child Class
public class Student extends Person
{
	int rno;
	int std;
	int marks;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	
	public void dispData() 
	{
		System.out.println(rno  + " " + name+" " + std + " " + marks);
	}
	
}