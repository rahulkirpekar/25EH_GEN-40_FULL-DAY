package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.List;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> courses1 = new ArrayList<String>();
		
		courses1.add("C");//0
		courses1.add("C++");//1
		courses1.add("Java");//2
		courses1.add("C++");//3
		courses1.add("Jsp-Servlet");//4
		courses1.add("Python");//5
		courses1.add("DJango");//6
		courses1.add("AI/ML");//7
		
		List<String>course2 = courses1.subList(2, 5);

		System.out.println("course2 : "+course2);
		
		
		//		Object obj[] = courses1.toArray();
//		
//		for (Object o1 : obj) 
//		{
//			String name = (String)o1;
//			System.out.println(name);
//		}
		
		
//		Iterator<String> itr = courses1.iterator();
//		while(itr.hasNext()) 
//		{
//			String course = itr.next();
//			System.out.println(course);
//		}
//		
//		courses1.clear();
//
//		System.out.println("courses1.size() : "+courses1.size());
		
//		System.out.println("courses1.size() : " + courses1.size());
//		System.out.println("courses1.isEmpty() : " + courses1.isEmpty());
		
		
//		int index = courses1.indexOf("C++");
//		int index = courses1.lastIndexOf("C++");
		
		
//		System.out.println(index);
		
//		boolean flag = courses1.contains("Python");
//		System.out.println("Flag : " +flag);
		
		
/*		courses1.remove(1);
		courses1.remove("C++");
		
		
		System.out.println("--------------------------");
		
		itr = courses1.iterator();
		
		while(itr.hasNext()) 
		{
			String course = itr.next();
			System.out.println(course);
		}
*/		
//		courses1.set(1, ".cpp");
		
		
/*		ArrayList<String> courses2 = new ArrayList<String>();
		courses2.add("Python");//0
		courses2.add("AI/ML");//1
		courses2.add("MERN Stack");//2
		
		courses1.addAll(1, courses2);
*/		
//		System.out.println("--------------------------------------");
//		itr = courses1.iterator();
//		
//		while(itr.hasNext()) 
//		{
//			String course = itr.next();
//			System.out.println(course);
//		}
		
		
//		Iterator<String> itr = courses1.iterator();
//		
//		while(itr.hasNext()) 
//		{
//			String course = itr.next();
//			System.out.println(course);
//		}
//		System.out.println("-----------------------------------------");
		
//		courses1.add(3, "Jsp-Servlet");
/*		
		Iterator<String> itr = courses1.iterator();
		
		while(itr.hasNext()) 
		{
			String course = itr.next();
			System.out.println(course);
		}
		System.out.println("-----------------------------------------");
		
		itr = courses2.iterator();
		
		while(itr.hasNext()) 
		{
			String course = itr.next();
			System.out.println(course);
		}
		System.out.println("-----------------------------------------");
		
		courses1.addAll(courses2);
		
		itr = courses1.iterator();
		
		while(itr.hasNext()) 
		{
			String course = itr.next();
			System.out.println(course);
		}
		System.out.println("----------------------------------------------");
		
		itr = courses2.iterator();
		
		while(itr.hasNext()) 
		{
			String course = itr.next();
			System.out.println(course);
		}
		System.out.println("-----------------------------------------");
*/		
	}
}
