package backupcollectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp 
{
	// searching method By Rno
	public static int searchStudentByRno(ArrayList<Student> list, int rno) 
	{
		for(int i = 0 ; i < list.size();i++) 
		{
			Student s = list.get(i);
			
			if(s.getRno() == rno) 
			{
				return i;// index 0 /1 /2 / 3 /...
			}
		}
		return -1;
	} 
	// searching method By Name
	
	public static int searchStudentByName(ArrayList<Student> list , String name) 
	{
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			
			if (s.getName().equals(name)) 
			{
				return i;// as Index
			}
		}
		return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		Student s= null;
		
		int choice = 0;
		do 
		{
			System.out.println("Enter blow choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student By Rno");
			System.out.println("3) For Delete Student By Rno");
			System.out.println("4) For Display All Student records");
			System.out.println("5) For Search Student By Rno");
			System.out.println("6) For Search Student By Name");// Sorting Techniques
			System.out.println("7) For Exit Student Application");
			choice = sc.nextInt();
			
			switch (choice) 
			{
			case 1:	
						int rno,std,marks;
						String name;
						
						System.out.println("Enter Rno : ");
						rno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Name : ");
						name = sc.nextLine();
						System.out.println("Enter std : ");
						std = sc.nextInt();
						System.out.println("Enter marks : ");
						marks = sc.nextInt();
						
						s = new Student(rno, name, std, marks);
						
						// s object--add--->list
						list.add(s);
						System.out.println("Student record suuccssfully Inserted....!");
						break;
				case 2:
						System.out.println("Enter Rno which you want to Update Student record: ");
						rno = sc.nextInt();
	
						int index = searchStudentByRno(list, rno);
						
						if(index != -1) 
						{
							s = list.get(index);
								
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
							System.out.println("---------------");
							
							s.updateStudent();
							
							list.set(index, s);
							
							System.out.println("Student Rno : "+rno+" is Updated from student records.");
						}
						else 
						{
							System.out.println("Student  Rno : "+rno+" not found in Database.");
						}
						break;
				case 3:
						System.out.println("Enter Rno which you want to Delete Student record: ");
						rno = sc.nextInt();

						index = searchStudentByRno(list, rno);
						
						if(index != -1) 
						{
							s = list.get(index);
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
							
							list.remove(index);
							System.out.println("Student Rno : "+rno+" is deleted from student records.");
						}
						else 
						{
							System.out.println("Student  Rno : "+rno+" not found in Database.");
						}
						break;
				case 4:
						for (int i = 0; i < list.size(); i++) 
						{
							s = 	list.get(i);
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
						}
					
						break;
				case 5:
						System.out.println("Enter Rno which you want to Search Student record: ");
						rno = sc.nextInt();

						index = searchStudentByRno(list, rno);
						
						if (index != -1) 
						{
							s = list.get(index);
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
						} 
						else 
						{
							System.out.println("Student  Rno : "+rno+" not found in Database.");
						}
						break;
				case 6:
						sc.nextLine();
						System.out.println("Enter Student Name which you want to Search Student record: ");
						name = sc.nextLine();
					
						index = searchStudentByName(list, name);
						
						if (index != -1) 
						{
							s = list.get(index);
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
						} 
						else 
						{
							System.out.println("Student Name : "+ name +" not found in Database.");
						}
					
						break;
				case 7:
						System.out.println("Student App will be Exit...!");
						try 
						{
							Thread.sleep(500);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(1);
						break;
				default:
						break;
			}
		} while (choice != 7);
	}
}