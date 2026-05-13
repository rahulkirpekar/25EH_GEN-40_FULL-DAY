package oops.thisandsuper.superconsttopic.e6;

public class B extends A
{
	int no1;
	
	public B()
	{
		super(10);
		no1 = 20;
	}
	
	B(int no1)
	{
		super(200);
		this.no1 = no1;
	}
	
	//    400     900
	B(int no1,int no2)
	{
	// 
		super(no2);
		// B--no1--  400
		this.no1 = no1;
	}

	public void dispData() 
	{
		//				B(no1)--400	   A(no1)--900
		System.out.println(no1 + " " + super.no1);
	}
	
	public static void main(String[] args) 
	{
		B obj  = new B(400,900);
		
		obj.dispData();
	}
}
