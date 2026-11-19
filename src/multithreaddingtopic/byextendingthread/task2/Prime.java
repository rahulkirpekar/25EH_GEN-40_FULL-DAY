package multithreaddingtopic.byextendingthread.task2;

public class Prime 
{
	// resource
	public boolean isPrime(int no) 
	{
		if(no <= 1) 
		{
			return false;
		}
		
		for (int i = 2; i <no; i++) 
		{
			if(no%i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}
