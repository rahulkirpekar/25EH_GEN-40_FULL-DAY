package lambdatopic;

import java.util.Scanner;


// Java-8 Lambda --- Functional Programming Language.
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Calc calc = () -> 
					{
						Scanner sc= new Scanner(System.in);
						
						int no1,no2,ans;
						
						System.out.println("Enter No1 : ");
						no1 = sc.nextInt();
						System.out.println("Enter No2 : ");
						no2 = sc.nextInt();
						
						ans = no1 + no2;
						
						System.out.println("Addition : " + ans);
					};
					
		calc.addFun();			
	}
}
