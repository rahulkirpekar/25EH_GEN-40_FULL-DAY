package oops.encaptopic;

// Pure Encapsulation = to Increase Data Security .
public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// 1. Constructor
	
	// 2. Methods---setters(Mutators) and getters(Accessors)
	
	// setters
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setStd(int std) 
	{
		this.std=std;
	}
	public void setMarks(int marks) 
	{
		this.marks=marks;
	}
	
	// getters
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
	public int getMarks() 
	{
		return marks;
	}
}

