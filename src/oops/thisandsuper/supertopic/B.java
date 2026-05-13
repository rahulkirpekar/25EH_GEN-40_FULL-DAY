package oops.thisandsuper.supertopic;

// Child Class
public class B extends A
{
//	int no1=30;
	// 2.  current class dm's scope
	void test() 
	{
		// 1 local scope
//		int no1;
//		no1=100;
		
		System.out.println("No1 : " + no1);// local variable--10
		System.out.println("No1 : " + this.no1);// currentclasss dm's variable--100
		System.out.println("No1 : " + super.no1);// currentclass-->Parent class--> dm's variable--100
		
		
//		System.out.println("No1 : " + no1);// local variable - 10
//		System.out.println("No1 : " + this.no1);// Current class Dm's-100
//		System.out.println("No1 : " + super.no1);// Current class's Parent class Dm's-100
		
		
		
	}
	
	public static void main(String[] args) 
	{
		B obj = new B();

		obj.test();
	}
}
