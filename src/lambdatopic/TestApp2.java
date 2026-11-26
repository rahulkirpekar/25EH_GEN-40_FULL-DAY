package lambdatopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Calc2 calc = (int no1,int no2) ->
					{
						int ans;
						Scanner sc= new Scanner(System.in);
							
						System.out.println("Enter No1 : ");
						no1 = sc.nextInt();
						System.out.println("Enter No2 : ");
						no2 = sc.nextInt();
						
						ans = no1 + no2;
						
						System.out.println("Addition : " + ans);
					};
		calc.addFun(20, 10);
	}
}
