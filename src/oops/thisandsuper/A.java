package oops.thisandsuper;

// this as Constructor
public class A 
{
	int no1,no2,no3;
	
	// Constructor Overoadding
	public A()
	{
		System.out.println("====== START : Default Constructor ======");
		no1 = 10;
		no2 = 20;
		no3 = 30;
	}
	public A(int no1)
	{
		this();
		System.out.println("====== START : PARA-ONE ARGS Constructor ======");
		this.no1 = no1;
	}
	public A(int no1,int no2)
	{
		this(no1);
		System.out.println("====== START : PARA-TWO ARGS Constructor ======");
		this.no2 = no2;
	}
	public A(int no1,int no2,int no3)
	{
		this(no1, no2);
		System.out.println("====== START : PARA-THREE ARGS Constructor ======");
		this.no3 = no3;
	}
	public void dispData() 
	{
		System.out.println(no1 + " " +  no2 + " "+no3);
	}
	public static void main(String[] args) 
	{
		A obj = new A(100,200,300);
		obj.dispData();
		
	}
}
