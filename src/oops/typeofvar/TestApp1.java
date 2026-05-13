package oops.typeofvar;

public class TestApp1 
{
	public static void test1() 
	{
		// local variable
		int no;
		no = 10;
		System.out.println("In test1 : NO "+ no);
	}
	
	public static void main(String[] args) 
	{
		// local variable
		int no;		
//		no = 20;
		System.out.println("In Main : NO "+ no);
		
		test1();
	}
}
