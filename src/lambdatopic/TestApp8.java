package lambdatopic;

import java.util.function.Predicate;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Predicate<Integer>p = (Integer no) ->
		 {
			for (int i = 2; i < no; i++) 
			{
				if(no%i == 0) 
					return false;
			}
			return true;
		 };

		 System.out.println("13 is Prime Number ? " + p.test(13));
	}
}
