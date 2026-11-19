package backupcollectionfrmwrk.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending order sorting
		TreeSet<String> set = new TreeSet<String>();
		
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
