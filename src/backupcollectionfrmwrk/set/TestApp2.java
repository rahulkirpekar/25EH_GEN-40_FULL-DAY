package backupcollectionfrmwrk.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion order
		LinkedHashSet<String> set  = new LinkedHashSet<String>();

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
