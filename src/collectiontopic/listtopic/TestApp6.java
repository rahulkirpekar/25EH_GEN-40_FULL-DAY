package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		LinkedList<String>list = new LinkedList<String>();
		
		list.add("Ganesh");
		list.add("royal");
		list.add("Ankur");
		list.add("Ramesh");
		list.add("Kunal");
		
		Iterator<String>itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
					
			System.out.println(name);
		}
	}
}
