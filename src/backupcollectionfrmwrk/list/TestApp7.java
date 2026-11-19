package backupcollectionfrmwrk.list;

import java.util.Iterator;
import java.util.Vector;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		
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
