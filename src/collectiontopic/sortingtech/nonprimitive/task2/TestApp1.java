package collectiontopic.sortingtech.nonprimitive.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "ganesh", 12000, "Se");
		Employee e2 = new Employee(2, "ankur", 9000, "Dr");
		Employee e3 = new Employee(3, "jay", 10000, "SE");
		Employee e4 = new Employee(4, "vishu", 5000, "Pr");
		Employee e5 = new Employee(5, "kunal", 11000, "Mr");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list);
		
		
		Iterator<Employee> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Employee e = (Employee) itr.next();
			System.out.println(e.getId()+" "+e.getName()+" " + e.getSalary()+" " + e.getDsgn());
		}
	}
}