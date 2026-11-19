package backupcollectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		ArrayList<String> listOfCountries = new ArrayList<String>();
		
		listOfCountries.add("India");//0
		listOfCountries.add("China");//1
		listOfCountries.add("Pakistan");//2
		listOfCountries.add("SriLanka");//3
		listOfCountries.add("Bangladesh");//4
		listOfCountries.add("Nepal");//5

//		for (int i = 0; i < listOfCountries.size(); i++) 
//		{
//			System.out.println("listOfCountries.get("+i+") : " + listOfCountries.get(i));
//		}
		
//		ArrayList<String> list = new ArrayList<String>();

//		list.add("USA");
//		list.add("Canada");
//		list.add("UK");
		
		System.out.println("-------------------");
//		listOfCountries.addAll(list);
//		listOfCountries.addAll(4, list);
		
		for (int i = 0; i < listOfCountries.size(); i++) 
		{
			System.out.println("listOfCountries.get("+i+") : " + listOfCountries.get(i));
		}
		
//		String a[] = listOfCountries.toArray(new String[0]);
//		for (String string : a) 
//		{
//			System.out.println(string);
//		}
		
		// primitive--list
		// string--list
		
		Collections.sort(listOfCountries);
		
		for (int i = 0; i < listOfCountries.size(); i++) 
		{
			System.out.println("listOfCountries.get("+i+") : " + listOfCountries.get(i));
		}
	}
}