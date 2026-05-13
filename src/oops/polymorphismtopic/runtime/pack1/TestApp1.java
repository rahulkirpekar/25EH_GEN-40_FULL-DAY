package oops.polymorphismtopic.runtime.pack1;

import java.util.Scanner;

public class TestApp1 
{
	public static void getBehaveBasedPersonType(Person person) 
	{
		person.getBehave();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Person person = null;
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Home");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Org");
		int choice = sc.nextInt();
		
		switch(choice) 
		{ 
			case 1: // Runtime Polymorphism
					// Upcasting --[Parent reference = Child Object]
					person = new School();	
					getBehaveBasedPersonType(person) ;
					
//					person.getBehave();
					break;
					
			case 2: 
					person = new Home();	
					getBehaveBasedPersonType(person) ;
//					person.getBehave();
					break;
					
			case 3: 
					person = new PublicPlace();	
					getBehaveBasedPersonType(person) ;
//					person.getBehave();
					break;
					
			case 4: 
					person = new Org();	
					getBehaveBasedPersonType(person) ;
//					person.getBehave();
					break;
		}
		
		
		
		
		
//		School school  = new School();
		
//		PublicPlace citizen = new PublicPlace();
//		getBehaveBasedPersonType(citizen);
		
		
//		Home child = new Home();
//		getBehaveBasedPersonType(child);
		
		
//		Person person = null;
		
		// static Binding
//		person = new Person();
//		person.getSpec();
		
		
		// Runtime Polymorphism
//		person = new School();
//		person.getBehave();
		
//		person = new Home();
//		person.getBehave();
		
//		person = new PublicPlace();
//		person.getBehave();
		
		
	}
}
