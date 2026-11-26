package lambdatopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Calc3 calc = () ->
						{
							int no1,no2,ans;
							Scanner sc= new Scanner(System.in);
								
							System.out.println("Enter No1 : ");
							no1 = sc.nextInt();
							System.out.println("Enter No2 : ");
							no2 = sc.nextInt();
							
							ans = no1 + no2;
							
							return ans;			
						};
		
		int ans = calc.addFun();
		
		System.out.println("Addition : " + ans);
	}
}
