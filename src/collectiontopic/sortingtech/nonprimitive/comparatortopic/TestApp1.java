package collectiontopic.sortingtech.nonprimitive.comparatortopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "ankur", 10, 90);
		Student s2= new Student(2, "rahul", 12, 80);
		Student s3= new Student(3, "sagar", 11, 70);
		Student s4= new Student(4, "vishal", 8, 60);
		Student s5= new Student(5, "kunal", 9, 40);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		System.out.println("Markswise Student Sorting : ");
		System.out.println("-------------------------------");
		Collections.sort(list, new MarksWiseStudentComparator());
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		System.out.println("Namewise Student Sorting : ");
		System.out.println("-------------------------------");
		Collections.sort(list, new NameWiseStudentComparator());
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		
		System.out.println("Stdwise Student Sorting : ");
		System.out.println("-------------------------------");
		Collections.sort(list, new StdWiseStudentComparator());
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = (Student) itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
		}

	}
}