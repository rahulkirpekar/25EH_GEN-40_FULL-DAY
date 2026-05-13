package oops.finaltopic;

public class Calc 
{
	// Data members
	final int no ;//= 10;
	
	// Default Constructor
	public Calc()
	{
		no = 100;
	}
	// Para Constructor
	public Calc(int no)
	{
		this.no = no;
	}
	
	public static void main(String[] args) 
	{
		Calc calc = new Calc(123);
		
//		calc.no = 123;
		System.out.println("calc.no : " + calc.no);
		
//		calc.no = 200;
//		System.out.println("Updated calc.no : " + calc.no);
	}
}