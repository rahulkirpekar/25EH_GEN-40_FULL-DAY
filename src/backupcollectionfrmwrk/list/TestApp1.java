package backupcollectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);// 0   true as boolean object  AutoBoxing = [primitive value convert into Object ]--> Wrapper class
		list.add('R');// 1 <==itr
		list.add("Royal");// 2
		list.add(12);// 3
		list.add(56.765);// 4		
		list.add(23.654f);// 5
		list.add(7654L);// 6
		
		Student s1 = new Student(1, "Ganesh", 10, 100); 
		list.add(s1);// 7
		
		System.out.println("list.size() : " + list.size());
		
//		Object obj = list.get(6);// boolean object
//		System.out.println(obj);// value	 UnBoxing = [Object to convert into value]

/*		
		// 1. Standard for loop (Forward Direction + BackWard Direction Iterate)
		//---------------------------
		
		for(int i = 0 ; i < list.size() ; i++) 
		{
			// Upcasting
			Object obj = list.get(i);

			if (obj instanceof Student) 
			{
				// Downcasting
				Student s = (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());				
			} 
			else 
			{
				System.out.println(obj);
			}
		}
		// 2. For Each Loop / Enhanced for Loop / Advanced for loop (Forward Direction)
		for(	 Object obj	: list) 
		{
			if (obj instanceof Student ) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" "+s.getStd()+" " +s.getMarks() );
			}else 
			{
				System.out.println(obj);
			}
		}
 // 3.   Iterator Way - Traditional Way (Forward Direction)
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student ) 
			{
				Student s= (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" "+s.getStd()+" " +s.getMarks() );
			}else 
			{
				System.out.println(obj);
			}
		}
 *
 */
		// 4. By ListIterator Way (Forward Direction + BackWard Direction Iterate)
		
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) 
		{
			// Upcasting
			Object obj = itr.next();
			System.out.println(obj);
//			if(obj instanceof Student) 
//			{
//				// Downcasting
//				Student s = (Student)obj;
//				System.out.println(s.getRno()+" " + s.getName()+" "+s.getStd()+" " +s.getMarks() );
//			}
//			else 
//			{
//				System.out.println(obj);
//			}
						
//			if (obj instanceof Student ) 
//			{
//				Student s= (Student)obj;
//				System.out.println(s.getRno()+" " + s.getName()+" "+s.getStd()+" " +s.getMarks() );
//			}else 
//			{
//				System.out.println(obj);
//			}
		}
		System.out.println("--------------------------");
		
//		while(itr.hasPrevious()) 
//		{
//			Object obj = itr.previous();
//			
//			if (obj instanceof Student ) 
//			{
//				Student s= (Student)obj;
//				System.out.println(s.getRno()+" " + s.getName()+" "+s.getStd()+" " +s.getMarks() );
//			}else 
//			{
//				System.out.println(obj);
//			}
//		}
	}
}