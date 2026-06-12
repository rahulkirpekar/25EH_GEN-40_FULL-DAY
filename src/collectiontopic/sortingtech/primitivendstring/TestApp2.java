package collectiontopic.sortingtech.primitivendstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("jay");
		list.add("anfal");
		list.add("megh");
		list.add("misbah");
		list.add("simran");
		list.add("naiya");
		list.add("vidhi");
		list.add("bansi");
		list.add("pooja");
		

		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			
			System.out.println(name);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(list);
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			
			System.out.println(name);
		}
	}
}
