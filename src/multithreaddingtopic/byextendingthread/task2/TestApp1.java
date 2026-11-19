package multithreaddingtopic.byextendingthread.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Prime resource = new Prime();
		
		PrimeThread primeThread1 = new PrimeThread(resource, 1, 100);
		PrimeThread primeThread2 = new PrimeThread(resource, 101, 200);
		PrimeThread primeThread3 = new PrimeThread(resource, 201, 300);
		
		primeThread1.start();
		primeThread2.start();
		primeThread3.start();
		
		
		try 
		{
			primeThread1.join();
			primeThread2.join();
			primeThread3.join();		

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Total Prime Count : " + PrimeThread.getPrimeCount());
	}
}
