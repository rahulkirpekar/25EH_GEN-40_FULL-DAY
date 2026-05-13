package oops.inhtopic.hieinh;

import java.util.Scanner;

//Child Class
public class Employee extends Person
{
	int id,salary;
	String dsgn;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+ " " + salary + " " + dsgn);
	}
}
