package backupcollectionfrmwrk.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Not Maintain Insertion order
		HashSet<String> set = new HashSet<String>();
	
		set.add("rahul");
		set.add("ankur");
		set.add("sagar");
		set.add("jayant");
		set.add("rahul");
		set.add("ankur");
		set.add("sagar");
		set.add("jayant");
		set.add("kunal");
		set.add("jigar");
		set.add("sagar");
		set.add("jayant");
		set.add("rahul");
		set.add("ankur");
		
		
		Iterator<String> itr = 	set.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
