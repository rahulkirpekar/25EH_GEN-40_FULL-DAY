package backupcollectionfrmwrk.list;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public Student() 
	{
	}

	public Student(int rno, String name, int std, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() 
	{
		return "Student Class ==> "+rno+" " + name+ " "+std+ " "+marks;
	}

	public void updateStudent() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter std : ");
		std = sc.nextInt();
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
	}
}