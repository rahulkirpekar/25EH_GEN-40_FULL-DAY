package oops.abstopic.interfacetopic;

//	1. Simple Interface:-
//	--------------------
// abstract
public interface A 
{
//	1. Constant Varaibles(static final)---Dm's	
//---------------------------------------------
	
	int NO1 = 10;// public static final - Constant Variable(CAPITAL)
	static int NO2 = 10;// public final - 
	public int NO3 = 10;// static final - 
	final int NO4 = 10;// public static - 
	public static final int NO5 = 10;
	
	
//	2. Member Function
//--------------------------
//	1. abstract methods(public abstract)--Multiple Abstract methods
	
	void test1();// public abstract
	abstract void test2();// public 
	public void test3();// abstract
	public abstract void test4();
	
	
//	2. Non-abstract methods(private(Java-9),default(Java-8) as keyword,static(Java-8))
	
	default void test5() 
	{
		System.out.println("A : default void test5()");
		test7();
	}
	
	// A.test6()
	static void test6() 
	{
		System.out.println("A : static void test6()");
	}

	private void test7() 
	{
		System.out.println("A : private void test7()");
	}
}
