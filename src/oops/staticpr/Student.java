package oops.staticpr;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	static String schoolName;// 1. // class level Variable
	
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	
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
		System.out.println("Enter Marks: ");
		marks = sc.nextInt();		
	}
	
	public void dispData() 
	{
		System.out.println(rno + " " + name + " " + std + " " + marks+" " + schoolName);
	}
	
	
	// 2.
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter SchoolName : ");
//		Student.schoolName = sc.nextLine();
		
//		Student.schoolName = "DPS";
		
		Student.setSchoolName("DPS");
		
		
		// 3.
		Student s1 = new Student();// s1[rno,name,std,marks]
//		Student s2 = new Student();// s2[rno,name,std,marks]			schoolName="DPS"
//		Student s3 = new Student();// s3[rno,name,std,marks]
		
		
		s1.scanData();// s1[rno=1,name=Rahul,std=12,marks=100]   
//		s2.scanData();// s2[rno=2,name=Ganesh,std=12,marks=100]   					schoolName="DPS"
//		s3.scanData();// s3[rno=3,name=Ankur,std=12,marks=100]   		
		

		
//		s1.dispData(); // s1[rno=1,name=Rahul,std=12,marks=100]                                            
//		s2.dispData(); // s2[rno=2,name=Ganesh,std=12,marks=100]   					schoolName="DPS"                 
//		s3.dispData(); // s3[rno=3,name=Ankur,std=12,marks=100]   		                                     
		
		
//		s1.setSchoolName("ABC");
		
//		System.out.println("----------------------");
		
//		s1.dispData(); // s1[rno=1,name=Rahul,std=12,marks=100]                                             
//		s2.dispData(); // s2[rno=2,name=Ganesh,std=12,marks=100]     					schoolName="ABC"                 
//		s3.dispData(); // s3[rno=3,name=Ankur,std=12,marks=100]     		                                     
		
	}                                                                                                    
}

// Execution Flow
//-----------------
// 4. non-static meethod --accesss---object[Data members']
// 3. object create ---[Dm's memory allocation]
// 2. main function----Static Variables Memory Allocation--static method
// 1. Class Load---JVM---class---Static Variables Memory Allocation





