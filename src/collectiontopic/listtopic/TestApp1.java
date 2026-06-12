package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();

		listObj.add(true);// 0  
		listObj.add(12);// 1 
		listObj.add(32L);// 2 <===itr
		listObj.add(54.65432);// 3
		listObj.add(654.732f);// 4
		listObj.add('R');// 5
		listObj.add("Royal");// 6
		
		Student s= new Student(1, "Ankur", 10, 90);
		listObj.add(s);// 7

		
		
		
		
/*			
		listObj.stream().forEach(System.out::println);
		------------------------------------------------------------
		
		System.out.println("listObj.size() : " + listObj.size());
		
		System.out.println("listObj.get(0) : " + listObj.get(0));

		ListIterator itr =	listObj.listIterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if(obj instanceof Student) 
			{
				Student s1  = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
			}else 
			{
				System.out.println(obj);
			}
		}
		System.out.println("---------------------");
		
		while(itr.hasPrevious()) 
		{
			Object obj = itr.previous();
			
			if(obj instanceof Student) 
			{
				Student s1  = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
			}else 
			{
				System.out.println(obj);
			}
		}
		-----------------------------------------------------------------------------------
		
	
		// Traditional Way
		
		Iterator itr = 	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	-------------------------------------------------------------------------------------
		for(int i = 0 ; i < listObj.size();i++) 
		{
			System.out.println("listObj.get("+ i +") : " + listObj.get(i));
		}
	-------------------------------------------------------------------------------------	
		// Advanced For Loop / ForEach Loop / Enhanced for loop
		for(Object obj : listObj) 
		{
			System.out.println(obj);
		}
	-------------------------------------------------------------------------------------
*/		
	}
}
