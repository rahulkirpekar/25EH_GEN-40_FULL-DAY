package backupcollectionfrmwrk.sortingtechiques.bycomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 8, 100);
		Student s2= new Student(2, "Kunall", 6, 90);
		Student s3= new Student(3, "Jayant", 7, 80);
		Student s4= new Student(4, "Sagar", 10, 70);
		Student s5= new Student(5, "Ankur", 9, 60);
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Iterator<Student> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = itr.next();

			s.dispData();
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Student NameWise Sorting : ");
		
		Collections.sort(list);
		
		itr = 	list.iterator();
		while (itr.hasNext()) 
		{
			Student s = itr.next();

			s.dispData();
		}
	}
}
