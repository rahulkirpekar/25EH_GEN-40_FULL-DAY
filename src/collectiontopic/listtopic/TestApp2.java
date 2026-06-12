package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// TypeSafe
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10);// int-------->Integer(Auto Boxing)(Pritiive to Object)
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			int value = itr.next();// UnBoxing(Object to primitive)
			System.out.println(value);
		}
	}
}
