package innerclasstopic.mi;

// Outer class
public class A 
{
	private int no = 1000;
	
	// Member-Inner class
	class B
	{
		void show() 
		{
			System.out.println("No : "+no);
		}
	}
}
