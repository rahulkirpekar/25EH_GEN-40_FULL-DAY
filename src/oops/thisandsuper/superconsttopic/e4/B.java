package oops.thisandsuper.superconsttopic.e4;

public class B extends A
{
	int no1 ;
	
	B()
	{
		no1 = 20;
	}
	B(int no1)
	{
		this.no1 = no1;
	}
	B(int no1,int no2)
	{
		super(no1);		//super.no1 = no1;
		this.no1 = no2;
	}
	public void dispData() 
	{
		//				   200			100    
		System.out.println(no1 + " " + super.no1);
	}
	
	public static void main(String[] args) 
	{
		B obj = new B(100,200);
		obj.dispData();
	}
}
