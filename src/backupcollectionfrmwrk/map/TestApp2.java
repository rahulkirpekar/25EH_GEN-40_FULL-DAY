package backupcollectionfrmwrk.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion Order--->Keywise
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

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
