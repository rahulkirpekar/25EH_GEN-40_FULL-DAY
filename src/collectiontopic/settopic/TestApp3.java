package collectiontopic.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascending order Sorting
		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("rahul");
		setObj.add("sagar");
		setObj.add("sujal");
		setObj.add("ankur");
		setObj.add("rahul");
		setObj.add("ramesh");
		setObj.add("kunal");
		setObj.add("sagar");
		setObj.add("sujal");
		
		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String value = (String) itr.next();
			System.out.println(value);
		}
	}
}
