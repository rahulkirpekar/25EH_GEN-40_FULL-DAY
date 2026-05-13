package oops.thisandsuper.superconsttopic.e8;

public class A 
{
	int no1;
	
	public void dispData() 
	{
		System.out.println(this.getClass().getName());
	}
	
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.dispData();
		
//		System.out.println(obj);// oops.thisandsuper.superconsttopic.e8.A@4517d9a3
	}
}
