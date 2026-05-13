package oops.polymorphismtopic.compiletime;

// Method Overloadding
public class Calc 
{
	public static void addFun(int no1,int no2) 
	{
		System.out.println("Two args(addFun(int no1,int no2)) : " + (no1+no2));
	}
	public static  void addFun(long no1,long no2) 
	{
		System.out.println("Two args(addFun(long no1,int no2)) : " + (no1+no2));
	}
	
	public static  void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Three args : " + (no1+no2+no3));
	}
	public static  void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("Four args : " + (no1+no2+no3+no4));
	}
}
