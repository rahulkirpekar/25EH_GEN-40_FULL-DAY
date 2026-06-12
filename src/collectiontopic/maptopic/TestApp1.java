package collectiontopic.maptopic;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Map(Key,value)
		//----------
		// HashMap
		// LinkedHashMap
		// TreeMap
		
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		
		mapObj.put(11, "rahul");// Entry[Key,Value]
		mapObj.put(1, "ankur");
		mapObj.put(92, "rakesh");
		mapObj.put(21, "sagar");
		mapObj.put(16, "kunal");
		
		for( Map.Entry<Integer, String> e : mapObj.entrySet()) 
		{
			Integer rno = e.getKey();
			String name = e.getValue();
			
			System.out.println(rno +" " + name);
		}
	}
}
