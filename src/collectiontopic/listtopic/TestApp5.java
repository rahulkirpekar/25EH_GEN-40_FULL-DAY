package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.add(true);
		list.add(12);
		list.add("royal");
		list.add('R');
		list.add(12.765f);
		list.add(98.765);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
					
			System.out.println(obj);
		}
	}
}
