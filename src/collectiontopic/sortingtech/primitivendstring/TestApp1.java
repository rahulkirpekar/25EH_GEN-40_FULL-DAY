package collectiontopic.sortingtech.primitivendstring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(100);
		list.add(20);
		list.add(90);

		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer mark = (Integer) itr.next();
			
			System.out.println(mark);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(list);
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer mark = (Integer) itr.next();
			
			System.out.println(mark);
		}
	}
}







