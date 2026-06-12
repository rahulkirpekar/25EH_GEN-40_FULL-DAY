package collectiontopic.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Map(Key,value)
		//----------
		// HashMap
		// LinkedHashMap
		// TreeMap
		
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> mapObj = new TreeMap<Integer, String>();
		
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
