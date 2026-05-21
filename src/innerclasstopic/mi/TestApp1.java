package innerclasstopic.mi;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA.new B();
		
		objB.show();
	}
}
