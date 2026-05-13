package oops.thisandsuper.superconsttopic.e2;

public class B extends A
{
	int no1;
	
	public B() 
	{
		no1 = 20;
	}
	
	private void dispData() 
	{
		//				    20            10
		System.out.println(no1 + " " + super.no1);
	}
	
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.dispData();
	}
}
