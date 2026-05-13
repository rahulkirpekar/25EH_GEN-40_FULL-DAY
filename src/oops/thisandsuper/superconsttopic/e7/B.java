package oops.thisandsuper.superconsttopic.e7;

public class B extends A
{
	int no2;
	
	B()
	{
		super(10);
		no2 = 20;
	}
	
	B(int no3 , int no4)
	{
		super(no4);
		this.no2 = no3;
	}

	public void dispData() 
	{
		System.out.println(no1 + " " + no2);
	}
	
	public static void main(String[] args) 
	{
		B obj  = new B(1200,900);
		
		obj.dispData();
	}
}
