package backupcollectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// Typesafe---Generic
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		Iterator<Integer> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			int value = itr.next();
			System.out.println(value);
		}
		
		// remove By Index
//		list.remove(4);
		
		// remove By Value
		list.remove(Integer.valueOf(40));
		
		System.out.println("---------------------");
		
		itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			int value = itr.next();
			System.out.println(value);
		}
	}
}
