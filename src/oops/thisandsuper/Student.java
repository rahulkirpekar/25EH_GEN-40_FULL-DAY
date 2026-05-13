package oops.thisandsuper;

public class Student 
{
	// Data members
	int rno,std,marks;
	String name;
	
	// method		     local variables
	public void setData(int rno,String name,int std,int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	public void dispData() 
	{
		System.out.println(rno + " " + name+ " " + std + " " + marks);
	}
	// Constructor
	public Student(int rno,String name,int std,int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		
		
//		Student s = new Student();// s[rno name std marks]
//		s.setData(1,"Rahul",12,100);
//		s.dispData();
	}
}
