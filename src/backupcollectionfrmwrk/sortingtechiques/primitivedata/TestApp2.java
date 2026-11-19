package backupcollectionfrmwrk.sortingtechiques.primitivedata;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("rahul");
		list.add("ganesh");
		list.add("ankur");
		list.add("jayant");
		list.add("sanket");
		list.add("ramesh");
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
			
		}
		// sorting --Collections-class
		System.out.println("-----------------------------");
		
		Collections.sort(list);
	
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
			
		}
	}
}
