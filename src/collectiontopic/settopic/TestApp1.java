package collectiontopic.settopic;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Set(Remove Duplicate values)
		//-------------------------------
		// HashSet
		// LinekedHashSet
		// TreeSet

		HashSet<String> setObj = new HashSet<String>();
		
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
