package lambdatopic;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Calc4 calc = (no1,no2) -> 
					{
						int ans;
						
						ans = no1 + no2;
						
						return ans;
					};
					
		int ans = calc.addFun(20, 10);	
		
		System.out.println("Addition : " + ans);
	}
}
