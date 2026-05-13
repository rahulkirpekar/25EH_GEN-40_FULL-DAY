package stringtopic.immutable;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		//				 01234567890123456
		String value =  "Royal technosoft private limited";
		
		int startIndex = value.indexOf("technosoft");
		
		System.out.println("Start Index : " + startIndex);
		int endIndex = startIndex ;
		
		for (int i = startIndex+1; i < value.length(); i++) 
		{
			if(value.charAt(i) != ' ') 
			{
				endIndex++;
				System.out.println(value.charAt(i)+"-----"+endIndex);
			}else 
			{
				break;
			}
		}
		System.out.println("End Index : " + endIndex);
		
		
//		String value2 = value.substring(index);
		
		String value2 = value.substring(startIndex, endIndex+1);
		
		System.out.println("value2 : " + value2);// technosoft private limited
		

//		String name1 = "limited";
//		System.out.println(" value.endsWith(name1) : "+value.endsWith(name1));
		
//		System.out.println("value.startsWith(name1) : " + value.startsWith(name1));
		
//		System.out.println("value.lastIndexOf(name1) : " + value.lastIndexOf(name1));
//		System.out.println("value.indexOf(name1) : " +value.indexOf(name1));

		
//		boolean flag = value.contains("info");
//		System.out.println("flag : " + flag);
		
		
//		Scanner sc = new  Scanner(System.in);
		
//		System.out.println("Enter Name1 : ");
//		String name1 = sc.nextLine();
//		System.out.println("Enter Name2 : ");
//		String name2 = sc.nextLine();
				
//		if (name1.equals(name2)) 
//		if (name1.equalsIgnoreCase(name2)) 
//		if(name1.compareTo(name2) == 0)
		
//		if(name1.compareToIgnoreCase(name2) == 0)
//		{
//			System.out.println("Both strings are same");
//		} else 
//		{
//			System.out.println("Both strings are not same");
//		}
	}
}
