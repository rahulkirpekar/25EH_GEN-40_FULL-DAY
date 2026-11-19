package backupcollectionfrmwrk.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("harsh");
		list.add("rahul");
		list.add("ganesh");
		list.add("ramesh");
		list.add("kunal");
		list.add("jayant");
		
		Iterator<String> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name );
		}
	}
}
