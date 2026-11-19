package backupcollectionfrmwrk.sortingtechiques.primitivedata;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(45);
		list.add(23);
		list.add(89);
		list.add(1);
		list.add(6);
		
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
