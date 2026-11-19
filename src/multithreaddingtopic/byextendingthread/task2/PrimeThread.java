package multithreaddingtopic.byextendingthread.task2;

public class PrimeThread extends Thread
{
	Prime prime = null;
	private int start,end;
	
	static int primeCount = 0;
	
	public PrimeThread(Prime prime,int start , int end) 
	{
		this.prime=prime;
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() 
	{
		for (int i = start; i < end; i++) 
		{
			int no = i;
			
			boolean flag = prime.isPrime(no);
			
			if(flag) 
			{
				System.out.println(Thread.currentThread().getName() +"====>"+no);
				primeCount++;
			}

			try 
			{
				Thread.sleep(200);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static int getPrimeCount() 
	{
		return primeCount;
	}
}
