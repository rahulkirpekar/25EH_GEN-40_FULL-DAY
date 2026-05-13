package oops.inhtopic.si.consttopic.pack1;

public class B extends A
{
	public B()
	{
		super(10);
		System.out.println("B : Default Constructor");
	}
	public B(int no1)
	{
		super(no1);
		System.out.println("B : PARA(B(int no1)) Constructor");
	}
	
	public static void main(String[] args) 
	{
		B obj = new B(20);
	}
}
