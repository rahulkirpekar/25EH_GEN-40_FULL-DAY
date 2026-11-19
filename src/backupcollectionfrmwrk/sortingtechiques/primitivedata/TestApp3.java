package backupcollectionfrmwrk.sortingtechiques.primitivedata;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		list.add(true);
		list.add(45L);
		list.add(23);
		list.add('r');
		list.add("Royal");
		list.add(45.754f);
		
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
