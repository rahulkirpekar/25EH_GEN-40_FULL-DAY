package oops.inhtopic.si.consttopic;

import java.util.Scanner;

// Single Inheritance
//---------------------

// Child Class
public class Student extends Person
{
	int rno;
	int std;
	int marks;
	
	// Constructor
	public Student() 
	{
		System.out.println("=====Default Constructor : Student()=====");
		rno = 0;
		name ="NULL";
		std = 0;
		marks = 0;
	}
	
	// Two Constructor
	Student(int rno,String name)
	{
		super(name);
		this.rno  = rno;
		System.out.println("=====Two Constructor : Student(int rno,String name)=====");
	}
	
	// Three Constructor
	Student(int rno,String name,int std)
	{
		this(rno,name);
		this.std  = std;	
		System.out.println("=====Three Constructor : Student(int rno,String name,int std)=====");
	}
	
	// Four Constructor
	Student(int rno,String name,int std,int marks)
	{
		this(rno,name,std);	// this as Constructor
		this.marks = marks;// this as keyword
		System.out.println("=====Four Constructor : Student(int rno,String name,int std,int marks)=====");
	}
	
	
	public void dispData() 
	{
		System.out.println(rno  + " " + name+" " + std + " " + marks);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Rahul",12,100);

		
		s1.dispData();
	}
}

