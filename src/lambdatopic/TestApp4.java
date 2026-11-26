package lambdatopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Calc4 calc = (int no1,int no2) -> 
					{
						int ans;
						
						ans = no1 + no2;
						
						return ans;
					};
					
		int ans = calc.addFun(20, 10);	
		
		System.out.println("Addition : " + ans);
	}
}
