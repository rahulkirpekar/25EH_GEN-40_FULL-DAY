package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Mutable 
		StringBuilder sb = new StringBuilder("Royal Technosoft");
//		StringBuffer sb = new StringBuffer("Royal Technosoft");
		
		System.out.println("sb : " + sb + " --- " + sb.hashCode());
		
		sb.append(" P Limited");// Royal Technosoft P Limited
		
		System.out.println("sb : " + sb + " --- " + sb.hashCode());
	}
}
