package oops.thisandsuper.superconsttopic.e1;

// Child/Derived/Sub Class
public class B extends A
{
	int no1;
	public B() 
	{
		//super();
		System.out.println("B : Default Constructor");
		no1=10;
	}
	public void dispData() 
	{
	//		A--no1-100
	//		B--no1-10
	//		-----------------
					//      10        100    
		System.out.println(no1+"----"+super.no1);
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.dispData();
	}
}
