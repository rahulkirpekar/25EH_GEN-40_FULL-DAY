package collectiontopic.settopic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> setObj = new LinkedHashSet<String>();
		
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
