package backupcollectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Typesafe---Generic
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("sagar");//2
		list.add("kunal");//3
		list.add("jayant");//4
		list.add("ketan");//5
		list.add("rakesh");//6
		list.add("sujal");//7
		list.add("kunal");//8		
		
		Iterator<String> itr = 	list.iterator();
		while (itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
		System.out.println("-----------------------");
//		list.add(4, "Ganesh");
		
//		String value = list.get(0);
//		System.out.println(value);
		
		// update by index
//		list.set(3, "ABC");
		
		// remove By Index
//		list.remove(4);
		
		// remove By Value
//		list.remove("ketan");
		
//		int index = list.lastIndexOf("kunal");
//		System.out.println("lastindex : " + index);
		
		// to clear list
		list.clear();
		
		boolean flag  =	list.isEmpty();
		System.out.println("flag : " + flag);
		
//		int index = list.indexOf("kunal");
//		System.out.println("index : " + index);
		
//		boolean flag = list.contains("kunal");
//		System.out.println("flag : " + flag);
		
//		itr = 	list.iterator();
//		while (itr.hasNext()) 
//		{
//			String name = itr.next();
//			System.out.println(name);
//		}
	}
}
