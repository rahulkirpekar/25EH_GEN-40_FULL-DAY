package oops.encaptopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student obj = new Student();

		obj.setRno(1);
		obj.setName("Rahul");
		obj.setStd(12);
		obj.setMarks(100);

		System.out.println(obj.getRno()+" "+ obj.getName()+" " + obj.getStd()+" " + obj.getMarks());
	}
}
