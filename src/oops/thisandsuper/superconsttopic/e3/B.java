package oops.thisandsuper.superconsttopic.e3;

public class B extends A
{
	int no1;
	
	public B() 
	{
		super();
		no1 = 20;
	}
	
	public B(int no1) 
	{
		super();
		this.no1 = no1;
	}
	
	
	public void dispData() 
	{
						// 200			10
		System.out.println(no1 + " " + super.no1);
	}
	public static void main(String[] args) 
	{
		B obj = new B(200);
		
		obj.dispData();
	}
}
