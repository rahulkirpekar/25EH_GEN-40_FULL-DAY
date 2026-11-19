package backupcollectionfrmwrk.map;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Sorting --Ascending Order--Keywise
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();

		map.put(11, "Rahul");// Entry[Key,Value]
		map.put(9, "Ankur");
		map.put(34, "Jayant");
		map.put(87, "Kunal");
		map.put(21, "Jigar");
		
		// ForEach / Advanced for / Enahanced
		for(	Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
