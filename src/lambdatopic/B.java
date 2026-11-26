package lambdatopic;

import java.util.Scanner;

public class B implements Calc
{
	@Override
	public void addFun() 
	{
		Scanner sc= new Scanner(System.in);
		
		int no1,no2,ans;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		ans = no1 + no2;
		
		System.out.println("Addition : " + ans);
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.addFun();
	}
}
