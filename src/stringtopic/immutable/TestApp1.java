package stringtopic.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		
		System.out.println(name1+" " + name1.hashCode());
		
		name1 = name1.concat(" Technosoft");// royal Technosoft
		
		System.out.println(name1+" " + name1.hashCode());
	}
}
