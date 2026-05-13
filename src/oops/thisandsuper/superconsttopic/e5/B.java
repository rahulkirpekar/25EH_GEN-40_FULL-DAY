package oops.thisandsuper.superconsttopic.e5;

public class B extends A
{
	int no1;
	
	public B()
	{
		no1 = 20;
	}
	
	public B(int no1)
	{
		this.no1 = no1;
	}
	
	public B(int no1,int no2)
	{
		super(no1);
		this.no1 = no2;
	}
	
	public void dispData() 
	{
		System.out.println(no1 + " " + super.no1);
	}
	
	public static void main(String[] args) 
	{
		B obj = new B(40,50);
		
		obj.dispData();
	}
}
