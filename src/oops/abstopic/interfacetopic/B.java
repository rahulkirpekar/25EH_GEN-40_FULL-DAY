package oops.abstopic.interfacetopic;

public abstract class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("B : test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B : test2()");
	}
	
	public abstract void test5();
//	@Override
//	public void test3() 
//	{
//		System.out.println("B : test3()");
//	}
//	@Override
//	public void test4() 
//	{
//		System.out.println("B : test4()");
//	}
}
