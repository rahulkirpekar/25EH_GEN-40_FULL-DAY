package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		queueObj.add("rahul");
		queueObj.add("sagar");
		queueObj.add("sujal");
		queueObj.add("ankur");
		queueObj.add("ramesh");
		queueObj.add("kunal");
		
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			System.out.println(name);
		}
	}
}