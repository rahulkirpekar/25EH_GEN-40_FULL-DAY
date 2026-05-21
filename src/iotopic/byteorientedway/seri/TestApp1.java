package iotopic.byteorientedway.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// object
//		Student s1= new Student(1, "Rahul", 12, 100);
		
		// Multiple Objects
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		//object write into file---byte oriented way

		// Java7---Auto-Closable Resource
		try 
			(
				FileOutputStream fout = new FileOutputStream("htm4.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);

			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}