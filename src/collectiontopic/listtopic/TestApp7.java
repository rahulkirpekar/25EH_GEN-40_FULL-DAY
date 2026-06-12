package collectiontopic.listtopic;

import java.util.Vector;
import java.util.Iterator;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Vector<Integer>list = new Vector<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			int value = itr.next();
			System.out.println(value);
		}
	}
}
