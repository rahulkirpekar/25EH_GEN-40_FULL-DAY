package backupcollectionfrmwrk.list;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		Object
		
		Student s1 = new Student(1, "Ankur", 10, 100);
		
		System.out.println("s1 : " + s1);
		System.out.println("s1.toString() : " + s1.toString());

		String value = "rahul";
		System.out.println("value : " + value);
		System.out.println("value.toString() : " + value.toString());
		
		
		
//		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
	}
}
