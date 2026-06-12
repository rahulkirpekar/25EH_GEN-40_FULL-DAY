package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Ankur", 12, 100);
		Student s2= new Student(2, "Rahul", 10, 90);
		Student s3= new Student(3, "Sagar", 11, 80);
		Student s4= new Student(4, "Kunal", 9, 95);
		Student s5= new Student(5, "Rakesh", 12, 75);
		
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s);
//			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	}
}
