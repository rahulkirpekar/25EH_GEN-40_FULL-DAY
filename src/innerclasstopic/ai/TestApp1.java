package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 2. Anonymous Innerclass
		A obj = new A() 
		{
			@Override
			public void test1() 
			{
				System.out.println("A--test1()");
			}
		}; 
		
		obj.test1();
	}
}
