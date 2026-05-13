package oops.executionflow;

// Class Execution Flow
public class A 
{
	int no;
	
	// 1. static Block
	static 
	{
		System.out.println("1.1. Static Block");
	}
	static 
	{
		System.out.println("1.2. Static Block");
	}
	
	// 2. Instance Block
	{
		System.out.println("4.1. Instance Block");
	}
	{
		System.out.println("4.2. Instance Block");
	}
	
	A()
	{
		System.out.println("5. A : Default Constructor");
	}
	A(int no)
	{
		this.no = no;
		System.out.println("5. A : Para Constructor");
	}
	
	static void test1() 
	{
		System.out.println("3. static test1() method");
	}
	
	void test2() 
	{
		System.out.println("6. test2() method");
	}

	public static void main(String[] args) 
	{
		System.out.println("================START :  2. Main Method ================");
		
		A.test1();
		
		A obj = new A(10);
		obj.test2();
		
		System.out.println("================7.EXIT :  Main Method ================");
	}
}