package stringtopic.immutable;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		String value =  "Royal technosoft private limited";
		
		String words[] = value.split("\\s");
		
		
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("words["+ i +"] : " + words[i]);
		}
	}
}
